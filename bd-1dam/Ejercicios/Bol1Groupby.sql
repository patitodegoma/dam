-- Corrección Boletín 1 - Group by y Having

-- Ejercicio 1

-- Seleccionar el salario máximo de cada departamento, mostrando el nombre
-- del departamento y dicha cantidad.

SELECT MAX(SALARY), DEPARTMENT_NAME
FROM DEPARTMENTS JOIN EMPLOYEES USING (DEPARTMENT_ID)
GROUP BY DEPARTMENT_NAME;

-- Ejercicio 2

-- Seleccionar el salario mínimo de cada departamento, para aquellos 
--departamentos cuyo salario minimo sea menor que 5000$

SELECT MIN(SALARY), DEPARTMENT_NAME
FROM DEPARTMENTS JOIN EMPLOYEES USING (DEPARTMENT_ID)
GROUP BY DEPARTMENT_NAME
HAVING MIN(SALARY)<5000;

-- Ejercicio 3

-- Seleccionar el número de empleados que trabajan en cada oficina, mostrando 
-- el STREET_ADDRESS y dicho numero; hay que ordenar la salida de mayor a menor.

SELECT STREET_ADDRESS, COUNT(EMPLOYEE_ID)
FROM EMPLOYEES JOIN DEPARTMENTS USING (DEPARTMENT_ID)
     JOIN LOCATIONS USING (LOCATION_ID)
GROUP BY STREET_ADDRESS
ORDER BY COUNT(EMPLOYEE_ID) DESC;

-- Ejercicio 4

-- Modificar la consulta anterior para que muestre las localizaciones que no 
-- tienen ningún empleado.

SELECT STREET_ADDRESS, COUNT(EMPLOYEE_ID)
FROM EMPLOYEES JOIN DEPARTMENTS USING (DEPARTMENT_ID)
     RIGHT JOIN LOCATIONS USING (LOCATION_ID)
GROUP BY STREET_ADDRESS
ORDER BY COUNT(EMPLOYEE_ID) DESC;

-- Ejercicio 5

-- Sea el salario que es cobrado por más personas a la vez. Mostrar dicho
-- número de personas.

SELECT MAX(COUNT(EMPLOYEE_ID))
FROM EMPLOYEES
GROUP BY SALARY
ORDER BY COUNT(EMPLOYEE_ID) DESC;

-- Ejercicio 6

-- Seleccionar el numero de empleados que empezaron a trabajar cada año, 
-- ordenando la salida por el año.

SELECT EXTRACT(YEAR FROM HIRE_DATE), COUNT(EMPLOYEE_ID)
FROM EMPLOYEES
GROUP BY EXTRACT(YEAR FROM HIRE_DATE)
ORDER BY EXTRACT(YEAR FROM HIRE_DATE) DESC;
     
     