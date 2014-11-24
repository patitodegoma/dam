/*
Seleccionar el nombre, apellidos y salario completo de todos los empleados. 
El salario completo se calcula a partir de las columnas SALARY y COMMISSION_PCT.
Hay que sumarle al SALARY el porcentaje del mismo expresado en COMMISSION_PCT. 
El resultado debe estar redondeado con solo 2 decimales. Si algún empleado no 
tiene comisión, también debe mostrarse su salario.
*/

SELECT FIRST_NAME, LAST_NAME, ROUND(SALARY + SALARY*NVL(COMMISSION_PCT, 0), 2) AS "SALARIO COMPLETO"
FROM EMPLOYEES;


