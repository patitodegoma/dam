-- Obtener la edad media de los ciclistas de los equipos, para todos aquellos 
-- equipos que no tienen ningún ciclista que haya ganado en un puerto de 
-- montaña.

SELECT DISTINCT(NOMEQ) AS "NOMBRE EQUIPO", ROUND(AVG(EDAD), 2) AS "EDAD MEDIA"
FROM CICLISTA
WHERE NOMEQ NOT IN (
                    SELECT NOMEQ
                    FROM CICLISTA JOIN PUERTO USING (DORSAL))
GROUP BY NOMEQ;

-- Obtener el dorsal y el nombre de los ciclistas que han ganado los puertos de
-- menor altura de cada etapa.

    -- Puertos de menor etapa
    
    SELECT NETAPA, MIN (ALTURA)
    FROM PUERTO
    GROUP BY NETAPA;
    
SELECT DORSAL, NOMBRE
FROM PUERTO JOIN CICLISTA USING (DORSAL)
WHERE (NETAPA, ALTURA) IN (
                           SELECT NETAPA, MIN (ALTURA)
                           FROM PUERTO
                           GROUP BY NETAPA);
                           
               -- OTRA SOLUCIÓN         
               
 SELECT DORSAL, NOMBRE
 FROM CICLISTA
 WHERE DORSAL IN (
                SELECT DORSAL
                FROM PUERTO
                WHERE (NETAPA, ALTURA) IN (
                                           SELECT NETAPA, MIN (ALTURA)
                                           FROM PUERTO
                                           GROUP BY NETAPA));



-- Obtener el dorsal y el nombre de los ciclistas tales que todas las etapas
-- que han ganado tienen entre 30 y 100 km (resolver usando subconsultas).

SELECT DORSAL, NOMBRE
FROM CICLISTA
WHERE DORSAL IN (
          SELECT DORSAL
          FROM ETAPA
          GROUP BY DORSAL
          HAVING MIN(KM) >= 30 AND MAX(KM) <= 100);
          
          
-- Obtener la ciudad de salida y llegada de aquella etapa que tiene más puertos
-- de montaña, indicando cuántos tiene.



-- Calcular la pendiente media de aquellas etapas que tengan este valor
-- superior o igual a la media de las pendientes de todas las etapas.


-- Obtener la cantidad de premio obtenido por cada equipo, para aquellos 
-- equipos cuyo premio sea superior a la suma de los premios de cada uno de los
-- tipos de Maillot.



-- Obtener el nombre del equipo que ha ganado en más etapas con puerto de 
-- montaña, indicando cuantas ha ganado.



-- Indicar el número de etapas ganadas por cada uno de equipos para aquellos 
-- equipos con una media de edad entre 20 y 25 años, o para aquellos equipos 
-- donde la edad de los ciclistas sea mayor que la edad media de los ciclistas.


