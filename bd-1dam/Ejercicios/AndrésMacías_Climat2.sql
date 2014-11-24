1. Seleccionar las ciudades, fechas Y temperaturas cuya temperatura maxima 
estuviera entre 35 y 40 grados y fuera martes o jueves.

SELECT *
FROM TEMPERATURAS
WHERE MAXIMA BETWEEN 35 AND 40
  AND TO_CHAR(FECHA, 'D') IN ('2', '4');


2. Seleccionar el número de horas de sol en Jaen y Almeria para los meses pares.

SELECT COUNT(HORAS)
FROM HORAS_SOL
WHERE CIUDAD IN ('JAEN', 'ALMERIA')
  AND MOD(TO_NUMBER(TO_CHAR(FECHA, 'MM')), 2) = 0;

3. Seleccionar las precipitaciones de los sábados de Febrero, de los martes de
Marzo y de los jueves de Abril de las ciudades de Sevilla y Jaen.

SELECT PREC
FROM PRECIPITACIONES
WHERE CIUDAD IN ('SEVILLA', 'JAEN')
    AND
     (TO_CHAR(FECHA, 'D') LIKE ('6')
  AND TO_CHAR(FECHA, 'MM') LIKE ('02'))
     OR
     (TO_CHAR(FECHA, 'D') LIKE ('2') 
  AND TO_CHAR(FECHA, 'MM') LIKE ('03'))
     OR
     (TO_CHAR(FECHA, 'D') LIKE ('4')
  AND TO_CHAR(FECHA, 'MM') LIKE ('04'));


4. Seleccionar las temperaturas de aquellas ciudades con contengan una E de
aquellos martes que fueran final de mes.

SELECT MAXIMA, MINIMA
FROM TEMPERATURAS
WHERE CIUDAD LIKE ('%E%')
  AND TO_CHAR(FECHA, 'D') LIKE ('2')
  AND FECHA = LAST_DAY(FECHA);



5. Seleccionar las precipitaciones de los dias de mitad de mes

SELECT PREC
FROM PRECIPITACIONES
WHERE TO_NUMBER(TO_CHAR(FECHA, 'DD')) > 12
  AND TO_NUMBER(TO_CHAR(FECHA, 'DD')) < 18;


6. Seleccionar las horas de sol de las fechas que estén en las semanas 
impares del año.

SELECT HORAS_SOL
FROM HORAS_SOL
WHERE MOD(TO_NUMBER(TO_CHAR(FECHA, 'IW')), 2) != 0 ;

