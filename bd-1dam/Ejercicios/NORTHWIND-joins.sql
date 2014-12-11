Seleccionar nombre y apellidos de los empleados, el número de pedido, y el
nombre de contacto del cliente que haya solicitado algún pedido.

SELECT FIRSTNAME, LASTNAME, ORDERID, CONTACTNAME
FROM (ORDERS JOIN EMPLOYEES USING(EMPLOYEEID))
     JOIN CUSTOMERS USING(CUSTOMERID);
     
Igual pero las que se hicieron en septiembre del 96

SELECT FIRSTNAME, LASTNAME, ORDERID, CONTACTNAME
FROM (ORDERS JOIN EMPLOYEES USING(EMPLOYEEID))
     JOIN CUSTOMERS USING(CUSTOMERID)
WHERE TO_CHAR(ORDERDATE, 'MM/YY') = '09/96';


Nombre de la compañía que hace los pedidos y el producto pedido. 
(Customers y Products)
  