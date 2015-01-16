-- Seleccionar la cantidad de productos diferentes que se han comprado, 
-- agrupados por nombre de compa��a que lo ha comprado, categor�a y nombre 
-- del producto.

SELECT COMPANYNAME AS "NOMBRE DE LA COMPA��A", CATEGORYNAME AS "NOMBRE DE LA CATEGOR�A", 
       PRODUCTNAME AS "NOMBRE DEL PRODUCTO", COUNT(PRODUCTID) AS "TOTAL DE PRODUCTOS"
FROM PRODUCTS JOIN ORDERDETAILS USING (PRODUCTID)
              JOIN ORDERS USING (ORDERID)
              JOIN CUSTOMERS USING (CUSTOMERID)
              JOIN CATEGORIES USING (CATEGORYID)
GROUP BY COMPANYNAME, CATEGORYNAME, PRODUCTNAME;


-- Si suponemos que el 8% del precio final de cada unidad de producto est� 
-- dedicado a pagar servicios, calcular la media de gasto por categor�a y 
-- producto, siempre y cuando esta cantidad sea superior a 200 e inferior a 325.

SELECT CATEGORYNAME AS "CATEGOR�A", PRODUCTNAME AS "PRODUCTO", AVG(0.08 * O.UNITPRICE * (1 - O.DISCOUNT)) AS "MEDIA DE GASTOS"
FROM ORDERDETAILS O JOIN PRODUCTS USING (PRODUCTID)
                  JOIN CATEGORIES USING (CATEGORYID)
GROUP BY CATEGORYNAME, PRODUCTNAME
HAVING AVG(0.08 * O.UNITPRICE * (1 - O.DISCOUNT)) > 200 AND
       AVG(0.08 * O.UNITPRICE * (1 - O.DISCOUNT)) < 325;
       
       
-- Seleccionar el numero de empleados de la empresa agrupados por region, 
-- para aquellos empleados que se incorporaran a la empresa con una edad de 
-- entre 20 y 30 a�os (hay que usar los campos BIRTHDATE Y HIREDATE).

SELECT REGIONDESCRIPTION, COUNT(EMPLOYEEID)
FROM EMPLOYEES JOIN EMPLOYEETERRITORIES USING (EMPLOYEEID)
               JOIN TERRITORIES USING (TERRITORYID)
               JOIN REGION USING (REGIONID)
WHERE (HIREDATE - BIRTHDATE) BETWEEN 20*365 AND 30*365
GROUP BY REGIONDESCRIPTION;   


-- Seleccionar la suma de cantidades de unidades de productos que han comprado 
-- los diferentes clientes, para aquellos clientes que han sido atendidos por 
-- empleados de New York o Boston, y siempre que el n�mero de unidades est� 
-- entre 10 y 1000.

SELECT PRODUCTNAME AS PRODUCTO, SUM(PRODUCTID) AS "SUMA DE PRODUCTOS"
FROM PRODUCTS JOIN ORDERDETAILS USING (PRODUCTID)
              JOIN ORDERS USING (ORDERID)
              JOIN EMPLOYEES USING (EMPLOYEEID)
WHERE UPPER(CITY) LIKE 'NEW YORK' OR
      UPPER(CITY) LIKE 'BOSTON'
GROUP BY PRODUCTNAME
HAVING SUM(PRODUCTID) BETWEEN 10 AND 1000;



