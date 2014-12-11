Cigarrillo (#marca, #filtro, nombre_fabricante, precio)

Estanco (#CIF, nombre, direccion)

Fabricante (#nombre, pais)

Compras (#CIF, #marca, #filtro, año, cantidad, precio)

Ventas (#CIF, #marca, #filtro, año, cantidad, precio)


Plantear las siguientes preguntas utilizando SQL:

1. Obtener todas las marcas de cigarrillos extranjeros.

SELECT NOMBRE
FROM FABRICANTE JOIN CIGARRILLO ON (FABRICANTE.NOMBRE = CIGARRILLO.NOMBRE_FABRICANTE)
WHERE PAIS NOT LIKE 'ESPAÑA';

2. Obtener el total de compras de cigarrillos con filtro (filtro = ’S’) realizadas por
marca.

SELECT COUNT (CANTIDAD)
FROM COMPRAS
WHERE FILTRO LIKE 'S'
GROUP BY MARCA;


3. Obtener una relacion completa de todas las compras y ventas realizadas.

-Consulta con union


4. Obtener la relacion de estancos que no han vendido cigarrillos ’Ducados’con filtro.

SELECT *
FROM ESTANCO JOIN VENTAS USING (CIF)
WHERE MARCA = 'DUCADOS' 
  AND CANTIDAD = 0
  AND FILTRO LIKE 'S';
