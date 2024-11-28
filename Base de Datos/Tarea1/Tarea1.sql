-- todos los tipos de articulos
SELECT descripcion_tipo FROM tipos_articulos;

SELECT * FROM articulos;

SELECT * FROM sucursales;
--código de articulo, stock y sucursal en la sucursal 1

SELECT a.codigo_articulo AS CodigoDeArticulo, asu.stock, s.nombre_sucursal AS Sucursal
FROM articulos a
INNER JOIN articulos_sucursal asu ON a.codigo_articulo = asu.codigo_articulo
INNER JOIN sucursales s ON asu.codigo_sucursal = s.codigo_sucursal
WHERE s.codigo_ciudad = 1;

-- Una consulta de todas las mercaderías con stock cero de la sucursal 9
SELECT a.descripcion AS Mercaderia 
FROM articulos a
INNER JOIN articulos_sucursal asu ON a.codigo_articulo = asu.codigo_articulo
WHERE asu.stock = 0;

--4. Empleados con apellido MESSI 
SELECT e.nombres, e.apellidos 
FROM empleados e
WHERE e.apellidos = 'MESSI';

--5. Lista de todos los clientes excepto los de apellido González 
SELECT * FROM clientes;

SELECT c.nombre AS clientes 
FROM clientes c 
WHERE c.nombre NOT LIKE 'González';





