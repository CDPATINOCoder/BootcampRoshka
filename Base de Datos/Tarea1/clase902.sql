--FUNCIONES PARA STRINGS
--LOWER: Convierte un string alfanumérico a minúsculas
select lower(nombre) from clientes;
select lower('HOLA') from clientes;
--UPPER: Convierte un string alfanumérico a mayúsculas
select lower(upper(direccion)) from clientes;
--INITCAP: Convierte la primera letra de cada palabra en mayúsculas y las siguientes en minúsculas.
select INITCAP(nombre) from clientes;
--CONCAT: Equivalente al operador de concatenación
select concat(ruc, dv, '- ',nombre, '- ', direccion) from clientes;
select ruc ||' + ' || nombre || ' + ' || direccion || ' + ' || telefono as "Datos del cliente" from clientes;
select * from clientes;
--SUBSTR: Retorna una cantidad de caracteres de la expresión, 
--partiendo de la posición m, con n caracteres de longitud
select substr(nombre, 3, 5) from clientes;
--LENGTH: Retorna el número de caracteres
select length(nombre) from clientes;
--LTRIM/RTRIM: Quita todas las apariciones del conjunto de ‘caracteres’ 
--del lado izquierdo/derecho de la columna o expresión. 
select rtrim(nombre, 'EL') from clientes;
--LPAD/RPAD: Justifica el string a la derecha/izquierda, llenando el espacio con los caracteres indicados. 
--El string total resultante tiene un total de ‘n’ de longitud
select rpad(direccion, 30, '*') from clientes;
--select substr((strpos(nombre , ',') + 1)), strpos(nombre , ' ') + 1)) from clientes;

--ROUND: Redondea la columna o expresión a n lugares decimales. 
--Si se omite n, se suprimen las posiciones decimales. 
--Si n es negativo, se redondean los dígitos a la izquierda del punto decimal
select round((precio_unitario + 0.757), 2) from articulos;
--TRUNC: Trunca la columna o valor a n posiciones decimales, y si se omite n, 
--no existen posiciones decimales. 
--Si n es negativo, los números a la izquierda del punto decimal son truncados a cero.
select trunc((1.000), 0) from articulos;
--SQRT: Retorna la raíz cuadrada de n
select round(sqrt(ultimo_costo)) from articulos;
--POWER: Retorna el resultado de elevar n a la m potencia

--funciones para fecha/hora
--AGE: calcula edades entre dos fechas
select age(timestamp '2001-04-10');
--CURRENT_DATE: retorna la fecha actual
select current_date;
--CURRENT_TIME: retorna la hora actual
select current_time;
--CURRENT_TIMESTAMP: retorna la fecha y hora con la zona horaria actual
select CURRENT_TIMESTAMP;
--DATE_PART: permite obtener subcampos por ejemplo, el año el mes, día, semana de una fecha
SELECT date_part('hour', TIMESTAMP '2001-02-16 20:38:40');
SELECT date_part('year', TIMESTAMP '2001-02-16 20:38:40');
SELECT date_part('month', TIMESTAMP '2001-02-16 20:38:40');
SELECT date_part('minute', TIMESTAMP '2001-02-16 20:38:40');
SELECT date_part('seconds', TIMESTAMP '2001-02-16 20:38:40');
SELECT date_part('day', current_timestamp);
SELECT date_part('day', current_date);
--TO_DATE: convierte un carácter a fecha.
select date_part('day', to_date('2001-02-16', 'yyyy-MM-DD'));
select to_date('05 Dec 2000', 'DD Mon YYYY');
-- TO_char
select to_char(current_timestamp, 'HH24:MI:SS')
select to_timestamp('05 Dec 2000', 'DD Mon YYYY');
--TO_TIMESTAMP: para convertir una cadena de caracteres a timestamp

--cast
SELECT CAST ('100' AS INTEGER);
SELECT CAST ('2015-01-01' AS DATE);

SELECT '100'::INTEGER;
SELECT '01-OCT-2015'::DATE;

SELECT TO_CHAR(NOW() :: DATE, 'month dd, yyyy');