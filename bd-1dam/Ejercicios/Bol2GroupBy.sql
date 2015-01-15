-- Ejercicio 1
-- Seleccionar el numero de empleados de la empresa agrupados por region, si 
-- y solo si el numero de empleados está entre 10 y 15.

SELECT REGIONDESCRIPTION, COUNT(EMPLOYEEID)
FROM ((EMPLOYEES JOIN EMPLOYEETERRITORIES USING (EMPLOYEEID))
    JOIN TERRITORIES USING (TERRITORYID))
    JOIN REGION USING (REGIONID)
GROUP BY REGIONDESCRIPTION
HAVING COUNT(EMPLOYEEID) BETWEEN 10 AND 15;


-- Ejercicio 2
-- Seleccionar el nombre de las empresas que no han realizado ningun pedido.

SELECT COMPANYNAME
FROM CUSTOMERS LEFT JOIN ORDERS USING (CUSTOMERID)
GROUP BY COMPANYNAME
HAVING COUNT(ORDERID) = 0;


-- Ejercicio 3
-- Sea el numero diferente de productos que se han pedido, agrupados por 
-- categoría. Mostrar el mayor (solo el número).

SELECT MAX(COUNT(DISTINCT(PRODUCTID)))
FROM ORDERDETAILS JOIN PRODUCTS USING (PRODUCTID)
GROUP BY CATEGORYID;


-- Ejercicio 4
-- Modificar la consulta anterior para que solo haga referencia a los pedidos 
-- realizados por clientes de Estados Unidos y atendidos por empleados de Oeste
-- (Western).

SELECT MAX(COUNT(DISTINCT(PRODUCTID)))
FROM ORDERDETAILS JOIN PRODUCTS USING (PRODUCTID)
     JOIN ORDERS USING (ORDERID)
     JOIN CUSTOMERS USING (CUSTOMERID)
     JOIN EMPLOYEES USING (EMPLOYEEID)
     JOIN EMPLOYEETERRITORIES USING (EMPLOYEEID)
     JOIN TERRITORIES USING (TERRITORYID)
     JOIN REGION USING (REGIONID)
WHERE UPPER(CUSTOMERS.COUNTRY) LIKE 'USA'
     AND UPPER(REGION.REGIONDESCRIPTION) LIKE 'WESTERN'
GROUP BY CATEGORYID;


-- Ejercicio 5
-- Si suponemos que nuestro margen de beneficio con los productos es de un 25%
-- (es decir, el 25% de su precio, son beneficios, y el 75% son costes),
-- calcular la cantidad de beneficio que hemos obtenido, agrupado por categoria
-- y producto. Las cantidades deben redondearse a dos decimales.

SELECT CATEGORYNAME, PRODUCTNAME, 
       SUM(
         ROUND(
           ((O.UNITPRICE * O.QUANTITY * (1 - O.DISCOUNT)) * 0.25) ,2)) 
              AS BENEFICIOS
FROM ORDERDETAILS O JOIN PRODUCTS P ON (P.PRODUCTID = O.PRODUCTID)
     JOIN CATEGORIES C ON (C.CATEGORYID = P.CATEGORYID)
GROUP BY CATEGORYNAME, PRODUCTNAME;


-- Seleccionar el número de empleados, agrupados por el mes en que fueron
-- contratados por la empresa, para aquellos empleados que fueron contratados
-- en la década de los 90.

SELECT TO_CHAR(HIREDATE, 'MONTH'), COUNT(*) FROM EMPLOYEES
WHERE HIREDATE BETWEEN
    TO_DATE ('01/01/1990') AND
    TO_DATE ('01/01/1990') + INTERVAL '10' YEAR
GROUP BY EXTRACT(MONTH FROM HIREDATE), TO_CHAR(HIREDATE, 'MONTH')
ORDER BY EXTRACT(MONTH FROM HIREDATE);




