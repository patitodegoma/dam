/*
1. Seleccionar las ciudades y temperaturas máximas para aquellas ciudades que 
acaban en A, para aquellos meses que contengan una B, y aquellos días que
fuesen miércoles y día par.
*/

SELECT CIUDAD, MAXIMA
FROM TEMPERATURAS
WHERE MOD(TO_NUMBER(TO_CHAR(FECHA, 'DD')), 2) = 0
  AND TO_CHAR(FECHA, 'D') LIKE ('3')
  AND TO_CHAR(FECHA, 'MONTH') LIKE ('%B%')
  AND CIUDAD LIKE ('%A');

/*
2. Seleccionar las ciudades y sus correspondientes horas de sol para aquellos
días con menos de 3 horas de sol para aquellas fechas cuyo siguiente martes
sea un día impar.
*/

SELECT CIUDAD, HORAS
FROM HORAS_SOL
WHERE HORAS < 3
  AND MOD(TO_NUMBER(TO_CHAR((NEXT_DAY(FECHA, 2)), 'DD')), 2) != 0; 


/*
3. Seleccionar la ciudad y sus temperaturas mínimas para aquellas fechas de 
primavera o de otoño que sean Lunes.
*/

SELECT *
FROM TEMPERATURAS
WHERE TO_CHAR(FECHA, 'D') LIKE ('1')
  AND (TO_NUMBER(TO_CHAR(FECHA, 'DDD')) BETWEEN 80 AND 171
     OR TO_NUMBER(TO_CHAR(FECHA, 'DDD')) BETWEEN 264 AND 354);


/*
4. Seleccionar las precipitaciones de los primeros días de la segunda semana
de cada mes.
*/

SELECT *
FROM PRECIPITACIONES
WHERE TO_NUMBER(TO_CHAR(FECHA, 'DD')) BETWEEN 8 AND 10;



/*
5. Seleccionar las horas de sol de los antepenúltimos días de cada mes, si
y solo si son superiores a 0,5.
*/

SELECT *
FROM HORAS_SOL
WHERE HORAS > 0.5
  AND FECHA = LAST_DAY(FECHA) - INTERVAL '2' DAY;