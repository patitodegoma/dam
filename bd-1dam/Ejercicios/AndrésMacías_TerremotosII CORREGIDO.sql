/*
1. Obtener todos los terremotos que sucedieron en un martes de octubre, con 
una magnitud comprendida entre 1.0 y 2.0
*/

SELECT *
FROM TERREMOTOS
WHERE TO_CHAR(FECHA, 'D') LIKE ('2')
  AND TO_CHAR(FECHA, 'MM') LIKE ('10')
  AND MAG BETWEEN 1.0 AND 2.0;


Otra forma:

EXTRACT (MONTH FROM FECHA) = 10
AND TO_CHAR(FECHA, 'DY') = 'MAR';

/*
2. Obtener todos los terremotos que sucedieron en la 2ª semana del mes a menos
de 100 km de profundidad.
*/

SELECT *
FROM TERREMOTOS
WHERE TO_CHAR(FECHA, 'W') LIKE ('2')
  AND PROF < 100;


EXTRACT(DAY FROM FECHA) BETWEEN 8 AND 14;


/*
3. Obtener todos los terremotos que sucedieron en Úbeda en los últimos días de
mes.
*/

SELECT *
FROM TERREMOTOS
WHERE LOC LIKE ('%ÚBEDA%')
  AND FECHA > LAST_DAY(FECHA) - INTERVAL '5' DAY;     

  Ojo, no se pasa de mes porque en el mes siguiente el LAST_DAY ya tiraría de otro mes



/*
4. Obtener los puntos (lat,lng) de todos los terremotos cuya localización sea 
Torreperogil, Sabiote o Ubeda.
*/

SELECT LAT, LNG
FROM TERREMOTOS
WHERE LOC LIKE ('%TORREPEROGIL%')
   OR LOC LIKE ('%SABIOTE%')
   OR LOC LIKE ('%ÚBEDA%');

/*
5. Obtener todos los terremotos que sucedieron hace mas de 3 meses y menos
de 6. La localización hay que formatearla para que no aparezca la provincia
o el pais.
*/


SELECT IDSUCESO, FECHA, LAT, LNG, PROF, MAG, 
       NVL(SUBSTR(LOC, 0, (INSTR(LOC, '.')-1)), LOC) AS "LOCALIZACIÓN"
FROM TERREMOTOS;
WHERE MONTHS_BETWEEN (SYSDATE, FECHA) < 6
  AND MONTHS_BETWEEN (SYSDATE, FECHA) > 3;




/*
6. Obtener todos los terremotos que sucedieron en latitudes comprendidas
entre 25 y 35 y de las que no se tiene datos de su profundidad.
*/

SELECT *
FROM TERREMOTOS
WHERE LAT BETWEEN 25 AND 35
  AND PROF IS NULL;