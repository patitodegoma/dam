Seleccionar nombre y apellidos de los empleados, el n�mero de pedido, y el
nombre de contacto del cliente que haya solicitado alg�n pedido.

SELECT FIRSTNAME, LASTNAME, ORDERID, CONTACTNAME
FROM (ORDERS JOIN EMPLOYEES USING(EMPLOYEEID))
     JOIN CUSTOMERS USING(CUSTOMERID);
     
Igual pero las que se hicieron en septiembre del 96

SELECT FIRSTNAME, LASTNAME, ORDERID, CONTACTNAME
FROM (ORDERS JOIN EMPLOYEES USING(EMPLOYEEID))
     JOIN CUSTOMERS USING(CUSTOMERID)
WHERE TO_CHAR(ORDERDATE, 'MM/YY') = '09/96';


Nombre de la compa��a que hace los pedidos y el producto pedido. 
(Customers y Products)
  