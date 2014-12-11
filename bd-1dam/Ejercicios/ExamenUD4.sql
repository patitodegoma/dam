/*
Seleccionar las localidades en las que pare alg�n bus del modelo "ULTRAVELOZ"
*/

SELECT DISTINCT(LOCALIDAD)
FROM ((PARADAS JOIN PARADA_LINEA USING (ID_PARADA))
     JOIN BUSES_LINEAS USING (ID_LINEA))
     JOIN BUSES USING (ID_BUS)
WHERE MODELO LIKE 'ULTRAVELOZ';

/*
Seleccionar los nombres de conductores de autobuses que trabajen en alguna 
l�nea que haga parada en "Almensilla" o en "San Juan de Aznalfarache"
*/


SELECT DISTINCT(CONDUCTORES.NOMBRE)
FROM ((CONDUCTORES JOIN BUSES_LINEAS ON (CONDUCTORES.ID_COND = BUSES_LINEAS.ID_CONDUCTOR))
     JOIN PARADA_LINEA USING (ID_LINEA))
     JOIN PARADAS USING (ID_PARADA)
WHERE UPPER(PARADAS.LOCALIDAD) LIKE 'ALMENSILLA' OR
      UPPER(PARADAS.LOCALIDAD) LIKE 'SAN JUAN DE AZNALFARACHE';
      
      
/*
Seleccionar el codigo, el origen y el destino de las lineas que utilizan un 
vehiculo "RAPIDO", y que paran en "Tomares"
*/

SELECT DISTINCT(ID_LINEA), ORIGEN, DESTINO
FROM (((LINEAS JOIN PARADA_LINEA USING (ID_LINEA))
     JOIN PARADAS USING (ID_PARADA))
     JOIN BUSES_LINEAS USING (ID_LINEA))
     JOIN BUSES USING (ID_BUS)
WHERE UPPER(LOCALIDAD) LIKE 'TOMARES'
  AND UPPER(MODELO) LIKE 'RAPIDO';
      
      
/*
Seleccionar la menor hora a la que sale de la cabecera un autob�s que haga
estaci�n en alguna de las paradas de la "Av. Blas Infante"
*/

SELECT MIN(HORA)
FROM (HORARIO_REGULAR JOIN PARADA_LINEA USING (ID_LINEA))
     JOIN PARADAS USING (ID_PARADA)
WHERE UPPER(PARADAS.NOMBRE) LIKE 'AV. BLAS INFANTE%';



/*
Seleccionar el n�mero de l�neas diferentes que tengan alguna salida de la
cabecera a las 6 de la ma�ana y que paren en "Hipercor".
*/

SELECT COUNT((ID_LINEA)
FROM (HORARIO_REGULAR JOIN PARADA_LINEA USING (ID_LINEA))
     JOIN PARADAS USING (ID_PARADA)
WHERE HORA = 6 AND
      MINUTOS = 0 AND
      UPPER(NOMBRE) LIKE '%HIPERCOR%';
      
