-- CONSULTAS EJERCICIO 1

/* Seleccionar aquellos empleados cuyo número de departamento esté entre el 80
y el 120 (ambos excluidos) */

SELECT *
FROM EMPLOYEES
WHERE DEPARTMENT_ID > '80' AND DEPARTMENT_ID < '120';

--Seleccionar todos los paises que contengan una letra a en la segunda posición.

SELECT *
FROM COUNTRIES
WHERE COUNTRY_NAME
LIKE '_a%';

/* Seleccionar el nombre y apellidos de los empleados cuyo salario bruto anual
sea mayor o igual que 100000$, y que no sean contables (FI_ACCOUNT). */

SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE SALARY*12 > '100000' AND JOB_ID NOT IN 'FI_ACCOUNT';

--Seleccionar aquellos departamentos cuyo nombre contega dos letras t.

SELECT *
FROM DEPARTMENTS
WHERE DEPARTMENT_NAME LIKE '%t%t%';

/* Seleccionar las localizaciones que estén en las ciudades de Toronto, Tokyo, 
Hirosima y Londres. */

SELECT *
FROM LOCATIONS
WHERE CITY IN ('Toronto', 'Tokyo', 'Hiroshima', 'London');
