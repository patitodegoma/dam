-- Seleccionar la suma del importe total de los pedidos (se recuerda que hay 
-- que sumar cada uno de los detalles del pedido (precio unitario, cantidad, 
-- descuento...)) agrupadas por años y meses.

SELECT TO_CHAR(ORDERDATE, 'Month') AS MES, TO_CHAR(ORDERDATE, 'YYYY') AS AÑO, ROUND(SUM (UNITPRICE*QUANTITY*(1-DISCOUNT)),2) AS SUMA
FROM ORDERDETAILS JOIN ORDERS USING (ORDERID)
GROUP BY TO_CHAR(ORDERDATE, 'Month'), TO_CHAR(ORDERDATE, 'YYYY');


-- Seleccionar el número de pedidos atendidos, agrupados por empleado y mes.

SELECT FIRSTNAME AS NOMBRE, LASTNAME AS APELLIDO, TO_CHAR(ORDERDATE, 'Month') AS MES, COUNT(ORDERID) AS "TOTAL PEDIDOS"
FROM ORDERDETAILS JOIN ORDERS USING (ORDERID)
    JOIN EMPLOYEES USING (EMPLOYEEID)
GROUP BY FIRSTNAME, LASTNAME, TO_CHAR(ORDERDATE, 'Month');