-- Seleccionar los 2 meses en el que se contrataron más empleados cuyo trabajo 
-- desempeñado sea Sales Representative.


SELECT MES, EMPLEADOS
FROM (
      SELECT TO_CHAR (HIRE_DATE, 'MONTH') AS MES, COUNT (EMPLOYEE_ID) AS EMPLEADOS
      FROM EMPLOYEES JOIN JOBS USING (JOB_ID)
      WHERE UPPER(JOB_TITLE) = 'SALES REPRESENTATIVE'
      GROUP BY TO_CHAR (HIRE_DATE, 'MONTH')
      ORDER BY COUNT (EMPLOYEE_ID) DESC
      )
WHERE ROWNUM <=2;


-- Selecciona la media de salario de aquellos departamentos para aquellos 
-- departamentos donde el salario medio sea menor a la media de los salarios 
-- de todos los empleados, ordenando la salida de menor a mayor salario.

SELECT DEPARTMENT_NAME AS "DEPARTAMENTO", ROUND(AVG(SALARY), 2) AS "SALARIO MEDIO"
FROM EMPLOYEES JOIN DEPARTMENTS USING (DEPARTMENT_ID)
GROUP BY DEPARTMENT_NAME
HAVING AVG(SALARY) < (
                      SELECT AVG(SALARY)
                      FROM EMPLOYEES
                      )
ORDER BY ROUND(AVG(SALARY), 2);

-- Seleccionar los 3 departamentos en los que, en media, menos se cobra.

SELECT DEPARTAMENTO, "SALARIO MEDIO"
FROM (
      SELECT DEPARTMENT_NAME AS "DEPARTAMENTO", ROUND(AVG(SALARY), 2) AS "SALARIO MEDIO"
      FROM EMPLOYEES JOIN DEPARTMENTS USING (DEPARTMENT_ID)
      GROUP BY DEPARTMENT_NAME
      ORDER BY ROUND(AVG(SALARY), 2)
      )
WHERE ROWNUM <= 3;

-- Seleccionar el nombre y apellidos de aquellos empleados que nunca han 
-- trabajado como Programmer

SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE EMPLOYEE_ID NOT IN (
        SELECT EMPLOYEE_ID
        FROM EMPLOYEES JOIN JOBS USING (JOB_ID)
        WHERE UPPER(JOB_TITLE) = 'PROGRAMMER'
                          )
INTERSECT
SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE EMPLOYEE_ID NOT IN (
              SELECT EMPLOYEE_ID
              FROM JOB_HISTORY JOIN JOBS USING (JOB_ID)
              WHERE UPPER(JOB_TITLE) = 'PROGRAMMER'
              )
ORDER BY LAST_NAME;
