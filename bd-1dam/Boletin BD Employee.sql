-- Mes en el que nacieron más empleados

SELECT MES, CUANTOS
FROM
	(SELECT EXTRACT (MONTH FROM BIRTH_DATE) AS MES, COUNT(*) AS CUANTOS
	 FROM EMPLOYEES
	 GROUP BY EXTRACT (MONTH FROM BIRTH_DATE)
	 ORDER BY COUNT(*) DESC)
WHERE ROWNUM = 1;


SELECT TO_CHAR(BIRTH_DATE, MONTH)
FROM EMPLOYEES
GROUP BY TO_CHAR(BIRTH_DATE, MONTH)
HAVING COUNT(*) = (
				SELECT MAX(COUNT(*))
				FROM EMPLOYEES
				GROUP BY TO_CHAR(BIRTH_DATE, MONTH)
				);


-- Seleccionar los 3 departamentos en los que más se cobra.

SELECT ROWNUM, DEPT_NAME, SUMA
FROM (
		SELECT DEPT_NAME, SUM(SALARY) AS SUMA
		FROM SALARIES JOIN EMPLOYEES USING (EMP_NO)
					  JOIN DEPT_EMP USING (EMP_NO)
					  JOIN DEPARTMENTS USING (DEPT_NO)
		GROUP BY DEPT_NAME
		ORDER BY SUM(SALARY) DESC
	)
WHERE ROWNUM <= 3;

-- Seleccionar el numero de hombres que cobran más que alguna mujer del 
-- departamento de Marketing.

SELECT COUNT(EMP_NO)
FROM EMPLOYEES JOIN SALARIES USING (EMP_NO)
WHERE SALARY > ANY (
                SELECT SALARY
                FROM SALARIES JOIN EMPLOYEES USING (EMP_NO)
                JOIN DEPT_EMP USING (EMP_NO)
                JOIN DEPARTMENTS USING (DEPT_NO)
                WHERE GENDER = 'F' 
                  AND DEPT_NAME = 'Marketing'
                  AND TO_CHAR(TO_DATE, 'YYYY') = 9999)
AND GENDER = 'M'
AND TO_CHAR(TO_DATE, 'YYYY') = 9999;

-- Seleccionar el nombre de aquellos empleados que no han cobrado nunca menos
-- de 70.000 USD

SELECT FIRST_NAME, LAST_NAME, MIN(SALARY)
FROM EMPLOYEES JOIN SALARIES USING (EMP_NO)
GROUP BY FIRST_NAME, LAST_NAME
HAVING MIN(SALARY) >= 70000;

   -- O TAMBIÉN

SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE EMP_NO NOT IN (
                    SELECT DISTINCT EMP_NO
                    FROM SALARIES
                    WHERE SALARY < 70000);
                    
-- Seleccionar el año y el nombre del departamento en el que más se ha cobrado

SELECT TO_CHAR (FROM_DATE, 'YYYY'), DEPT_NAME, SUM(SALARY)
FROM EMPLOYEES JOIN SALARIES USING (EMP_NO)
    JOIN DEPT_EMP USING (EMP_NO)
    JOIN DEPARTMENTS USING (DEPT_NO)
GROUP BY TO_CHAR (FROM_DATE, 'YYYY'), DEPT_NAME
HAVING SUM(SALARY) = (
                    SELECT TO_CHAR (FROM_DATE, 'YYYY'), DEPT_NAME, SUM(SALARY)
                    FROM EMPLOYEES JOIN SALARIES USING (EMP_NO)
                        JOIN DEPT_EMP USING (EMP_NO)
                        JOIN DEPARTMENTS USING (DEPT_NO)
                    GROUP BY TO_CHAR (FROM_DATE, 'YYYY'), DEPT_NAME)
ORDER BY TO_CHAR (FROM_DATE, 'YYYY');


    
  --  LO SUBE AL AULA VIRTUAL --
  
  
-- Seleccionar el nombre del departamento que tiene más empleados

SELECT DEPT_NAME
FROM (
      SELECT DEPT_NAME, COUNT(EMP_NO)
      FROM DEPARTMENTS JOIN DEPT_EMP USING (DEPT_NO)
                JOIN EMPLOYEES USING (EMP_NO)
      GROUP BY DEPT_NAME
      ORDER BY COUNT(EMP_NO) DESC)
WHERE ROWNUM <= 1;

   -- habría que hacerlo con having max count, para que me saque los dos
   -- que tienen el máximo de trabajadores
   
   SELECT DEPT_NAME
   FROM DEPARTMENTS JOIN DEPT_EMP USING (DEPT_NO)
                JOIN EMPLOYEES USING (EMP_NO)
   GROUP BY DEPT_NAME
   HAVING COUNT(EMP_NO) = (
                          SELECT MAX(COUNT(EMP_NO))
                          FROM DEPARTMENTS JOIN DEPT_EMP USING (DEPT_NO)
                              JOIN EMPLOYEES USING (EMP_NO)
                          GROUP BY DEPT_NAME
                          )
   ORDER BY COUNT(EMP_NO) DESC;


-- Seleccionar el nombre y salario de los 3 gerentes de departamento que más
-- cobran


SELECT FIRST_NAME, LAST_NAME, SALARY
FROM 
      (SELECT FIRST_NAME, LAST_NAME, SALARY
      FROM DEPT_MANAGER JOIN EMPLOYEES USING (EMP_NO)
                JOIN SALARIES USING (EMP_NO)
      WHERE EXTRACT(YEAR FROM TO_DATE) = 9999
      ORDER BY SALARY DESC)
WHERE ROWNUM <= 1;


-- Año en el que menos han cobrado los empleados de Marketing

SELECT TO_CHAR(FROM_DATE, 'YYYY'), SUM(SALARY)
FROM EMPLOYEES JOIN DEPT_EMP USING (EMP_NO)
        JOIN DEPARTMENTS USING (DEPT_NO)
        JOIN SALARIES USING (EMP_NO)
WHERE UPPER(DEPT_NAME) = 'MARKETING'
GROUP BY TO_CHAR(FROM_DATE, 'YYYY')
HAVING SUM(SALARY) = (
                      SELECT MIN(SUM(SALARY))
                      FROM EMPLOYEES JOIN DEPT_EMP USING (EMP_NO)
                      JOIN DEPARTMENTS USING (DEPT_NO)
                      JOIN SALARIES USING (EMP_NO) 
                      WHERE UPPER(DEPT_NAME) = 'MARKETING'
                      GROUP BY TO_CHAR(FROM_DATE, 'YYYY')
                      )
ORDER BY TO_CHAR(FROM_DATE, 'YYYY');

-- Seleccionar hombre y mujer que más y menos cobran

        -- HOMBRE QUE MÁS COBRA
SELECT FIRST_NAME, LAST_NAME, SALARY
FROM (
      SELECT FIRST_NAME, LAST_NAME, SALARY
      FROM EMPLOYEES JOIN SALARIES USING (EMP_NO)
      WHERE GENDER = 'M' 
         AND EXTRACT(YEAR FROM TO_DATE) = 9999
      ORDER BY SALARY DESC)
WHERE ROWNUM <= 1;


-- SELECCIONAR SALARIO ACTUAL MEDIO...

SELECT DEPT_NAME, ROUND(AVG (SALARY), 2)
FROM EMPLOYEES JOIN SALARIES USING (EMP_NO)
      JOIN DEPT_EMP USING (EMP_NO)
      JOIN DEPARTMENTS USING (DEPT_NO)
WHERE EXTRACT(YEAR FROM TO_DATE) = 9999
GROUP BY DEPT_NAME
HAVING AVG(SALARY) < (
                    SELECT AVG(SALARY)
                    FROM SALARIES
                    WHERE EXTRACT(YEAR FROM TO_DATE) = 9999
                  )
ORDER BY ROUND(AVG (SALARY), 2) DESC;