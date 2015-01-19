-- Seleccionar los empleados que cobran más que Bruce Ernst

SELECT FIRST_NAME, LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY > (
                SELECT SALARY
                FROM EMPLOYEES
                WHERE UPPER(FIRST_NAME) = 'BRUCE' AND
                      UPPER(LAST_NAME) = 'ERNST'
                );


-- Seleccionar los empleados que estén en Contabilidad o en Marketing (usando
-- subconsultas)

SELECT *
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (
                        SELECT DEPARTMENT_ID
                        FROM DEPARTMENTS
                        WHERE UPPER(DEPARTMENT_NAME) IN ('ACCOUNTING', 'MARKETING')
                       );