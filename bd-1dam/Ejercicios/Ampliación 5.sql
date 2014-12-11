Persona (#DNI, nombre, apellidos, DNI_cabeza, calle, numero,
escalera, planta, puerta)

Piso (#calle, #numero, #escalera, #planta, #puerta, metros,
codigo_postal)

Zona (#codigo_postal, nombre)

Propietario (#DNI, #calle, #numero, #escalera, #planta, #puerta,
fecha_compra)


Plantear las siguientes preguntas utilizando SQL:

1. Obtener el DNI de todos los propietarios de una casa en la zona Centro.

SELECT DNI
FROM (ZONA JOIN PISO USING (CODIGO_POSTAL) )
    JOIN PERSONA ON (PERSONA.CALLE = PISO.CALLE AND
                     PERSONA.NUMERO = PISO.NUMERO AND
                     PERSONA.PLANTA = PISO.PLANTA AND
                     PERSONA.PUERTA = PISO.PUERTA)
WHERE ZONA.NOMBRE LIKE 'CENTRO';


2. Obtener el DNI, nombre y apellidos de los propietarios de un piso en la calle
Damaso, numero 20.

SELECT DNI, NOMBRE, APELLIDOS
FROM PROPIETARIO JOIN PERSONA USING (DNI)
WHERE CALLE LIKE 'DAMASO'
  AND NUMERO = 20


3. Obtener todos los pisos de mas de 50m2
cuyo propietario tiene el DNI numero
44.351.312.

SELECT *
FROM PISO JOIN PROPIETARIO ON (PISO.CALLE = PROPIETARIO.CALLE AND
                               PISO.NUMERO = PROPIETARIO.NUMERO AND
                               PISO.PLANTA = PROPIETARIO.PLANTA AND
                               PISO.PUERTA = PROPIETARIO.PUERTA)
WHERE METROS > 50 
  AND DNI = 44351312;


4. Obtener el numero de personas que viven en el numero 14 de Felipe II.

SELECT COUNT(*)
FROM PERSONAS
WHERE CALLE LIKE 'FELIPE II'
  AND NUMERO = 14;


5. Obtener el tamaño medio de las casas de la zona de Latina.

SELECT AVG (METROS)
FROM PISO JOIN ZONA USING (CODIGO_POSTAL)
WHERE ZONA.NOMBRE LIKE 'LATINA';
