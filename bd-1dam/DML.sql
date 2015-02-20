-- Dada la tabla PERSONAS insertar a un persona de apellidos y nombre
-- ?Quiroga Rojas, Leopoldo?, cuya funci�n sea ?CONSERJE?, con DNI
-- 456788999 y con el c�digo de hospital 4.

INSERT INTO PERSONAS (cod_hospital, dni, apellidos, funcion) 
       VALUES ('4', 456788999, 'QUIROGA ROJAS, LEOPOLDO', 'CONSERJE');
       
-- Inserta en la tabla PERSONAS una persona de nombre ?Serrano Ruiz,
-- Antonio?, con DNI 111333222 perteneciente al hospital n�mero 3.

INSERT INTO PERSONAS (apellidos, dni, cod_hospital) 
       VALUES ('Serrano Ruiz, Antonio', 111333222, '3');
       
-- Inserta en la tabla PERSONAS1 los datos de las personas que trabajan en
-- el hospital n�mero 1 (INSERT con SELECT).


-- Se ha creado una nueva tabla llamada PERSONAS2. Esta tabla tiene los
-- siguientes campos (DNI, APELLIDOS, FUNCI�N). �C�mo podremos
-- introducir en esa tabla los datos de las PERSONAS del c�digo de hospital
-- 4?


-- Inserta en la tabla PERSONAS una persona con DNI 99887766 y apellidos
-- ?Mart�nez Mart�nez, Alejandro? en el hospital que tiene tan s�lo 1 persona
-- (INSERT con SELECT).


-- En la tabla HOSPITALES cambiar el c�digo de los hospitales que tienen el
-- c�digo 3 al c�digo 4. (Utilizar UPDATE).

UPDATE HOSPITALES SET cod_hospital = '4' WHERE cod_hospital = '3';

--Insertar en la tabla EMPLE un empleado con c�digo 9999, apellido
--'GONZ�LEZ' y c�digo de departamento 10.

INSERT INTO EMPLE (emp_no, apellido, dept_no)
       VALUES ('9999', 'GONZ�LEZ', '10');
       
-- Insertar en la tabla EMPLE un empleado con c�digo 5000, apellido
-- ?MORAGA?, oficio ?EMPLEADO?, su director es el empleado 7902, la fecha de
-- alta en la empresa es ?17/10/99?, su salario es 100000, no tiene comisi�n y
-- pertenece al departamento n�mero 20. (para indicar que no tiene comisi�n
-- deber�s poner NULL en el campo comisi�n).

INSERT INTO EMPLE VALUES ('5000', 'MORAGA', 'EMPLEADO', '7902', '17/10/1999', 100000, NULL, '20');

-- Insertar en la tabla DEPART un departamento cuyo n�mero sea 50, de
-- nombre ?GENERAL? y cuya localizaci�n sea ?SEVILLA?.

INSERT INTO DEPART VALUES ('50', 'GENERAL', 'SEVILLA');

-- Insertar en la tabla DEPART un departamento cuyo n�mero sea 60 y de
-- nombre ?PRUEBAS?

INSERT INTO DEPART (dept_no, dnombre) VALUES ('60', 'PRUEBAS');

-- Insertar en la tabla EMPLE30 los datos de los empleados que pertenecen al
-- departamento n�mero 30.


-- Insertar en la tabla EMPLE20 el dni, n�mero de departamento y salario de
-- los empleados que pertenecen al departamento n�mero 20.

-- Doblar el salario a todos los empleados del departamento 30. (Utilizar
-- UPDATE).

UPDATE EMPLE SET salario = 2*salario WHERE dept_no = 30;