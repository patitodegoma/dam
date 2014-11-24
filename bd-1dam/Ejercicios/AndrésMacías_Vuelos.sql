-- 1. SELECCIONAR TODOS LOS VUELOS QUE SALEN EN MARTES, JUEVES O SABADO.

SELECT *
FROM VUELOS
WHERE TO_CHAR(SALIDA, 'D') LIKE ('2') OR
      TO_CHAR(SALIDA, 'D') LIKE ('4') OR
      TO_CHAR(SALIDA, 'D') LIKE ('6');


-- 2. SELECCIONAR LOS VUELOS CUYA DURACI�N EST� ENTRE 60 Y 90 MINUTOS.

SELECT *
FROM VUELOS
WHERE ((LLEGADA - SALIDA)*24*60) BETWEEN 60 AND 90;


-- 3. SELECCIONAR LOS VUELOS QUE SALDR�N EN MARZO DESDE MANCHESTER.

SELECT *
FROM VUELOS
WHERE DESDE LIKE ('Manchester')
AND SALIDA >= TO_DATE('01/03/2015', 'DD/MM/YYYY')
AND SALIDA <= TO_DATE('31/03/2015', 'DD/MM/YYYY');


/* 4. SELECCIONAR LOS VUELOS QUE SALDRAN DESDE SEVILLA HACIA BARCELONA O BERLIN
EN LOS PR�XIMOS 30 DIAS. */

SELECT *
FROM VUELOS
WHERE (LLEGADA - SYSDATE) <= 30
  AND (LLEGADA - SYSDATE) > 0
  AND DESDE LIKE ('Sevilla')
  AND (HASTA LIKE ('Barcelona') OR HASTA LIKE ('Berlin'));


/* 5. SELECCIONAR EL N�MERO DE MESES QUE QUEDA PARA TODOS LOS VUELOS QUE 
LLEGUEN A MADRID. EL NUMERO DE MESES DEBE REONDEARSE CON DOS DECIMALES. */

SELECT ROUND(MONTHS_BETWEEN (LLEGADA, SYSDATE), 2)
FROM VUELOS
WHERE HASTA LIKE ('Madrid');


/* 6. SELECCIONAR AQUELLOS VUELOS QUE LLEGAN A SEVILLA Y QUE SU LLEGADA ES EN
UNA FECHA CUYO MES TIENE 31 DIAS. */

SELECT *
FROM VUELOS
WHERE HASTA LIKE ('Sevilla')
  AND (TO_CHAR (LLEGADA, 'MM') = '01'
    OR TO_CHAR (LLEGADA, 'MM') = '03'
    OR TO_CHAR (LLEGADA, 'MM') = '05'
    OR TO_CHAR (LLEGADA, 'MM') = '07'
    OR TO_CHAR (LLEGADA, 'MM') = '08'
    OR TO_CHAR (LLEGADA, 'MM') = '10'
    OR TO_CHAR (LLEGADA, 'MM') = '12');


-- 7. SELECCIONAR AQUELLOS VUELOS QUE LLEGAN ENTRE LAS SEMANAS 15 Y 30 DEL A�O.

SELECT *
FROM VUELOS
WHERE TO_NUMBER(TO_CHAR(LLEGADA, 'IW')) BETWEEN 15 AND 30;


/* 8. SELECCIONAR EL N�MERO DE VUELOS QUE SALEN DESDE VENECIA, BERLIN O 
AMSTERDAM Y QUE LLEGAN ENTRE EL 19/02/2013 Y EL 13/03/2013 O CUYA DURACION SEA 
SUPERIOR 120 MINUTOS. */

SELECT *
FROM VUELOS
WHERE DESDE LIKE ('Venecia') 
   OR DESDE LIKE ('Berlin') 
   OR DESDE LIKE ('Amsterdam')
 AND ((LLEGADA <= TO_DATE('13/03/2013', 'DD/MM/YYYY')
   AND LLEGADA >= TO_DATE('19/02/2013', 'DD/MM/YYYY'))
  OR ((LLEGADA - SALIDA)*24*60) > 120);


