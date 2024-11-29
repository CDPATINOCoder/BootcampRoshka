SELECT c.nombre, c.apellido, f.cliente_id, COUNT(f.id) AS NumeroDeFacturas
FROM cliente c
INNER JOIN factura f ON c.id = f.cliente_id
GROUP BY c.id, f.cliente_id
ORDER BY NumeroDeFacturas DESC
LIMIT 5;

SELECT * FROM cliente;
SELECT * FROM factura;
SELECT * FROM factura_detalle;
SELECT * FROM producto;

SELECT c.id, c.nombre||' '||c.apellido AS Cliente, SUM(fd.cantidad * p.precio) AS Monto
FROM cliente c 
INNER JOIN factura f ON c.id = f.cliente_id
INNER JOIN factura_detalle fd ON f.id = fd.factura_id
INNER JOIN producto p ON fd.producto_id = p.id
GROUP BY c.id, c.nombre, c.apellido
ORDER BY Monto DESC;


SELECT m.nombre, COUNT(f.moneda_id) AS TotalMoneda
FROM cliente c
INNER JOIN factura f ON c.id = f.cliente_id
INNER JOIN moneda m ON m.id = f.moneda_id
GROUP BY m.nombre
ORDER BY TotalMoneda DESC;


SELECT pv.id, pv.nombre, COUNT(proveedor_id) AS TotalProveedores
FROM proveedor pv
INNER JOIN producto p ON pv.id = p.proveedor_id
GROUP BY pv.id
ORDER BY TotalProveedores DESC;


SELECT p.id, p.nombre, SUM(fd.cantidad) AS CantidadVendido
FROM factura_detalle fd
INNER JOIN producto p ON fd.producto_id = p.id
GROUP BY p.id
ORDER BY CantidadVendido DESC
Limit 5;

SELECT p.id, p.nombre, SUM(fd.cantidad) AS CantidadVendido
FROM factura_detalle fd
INNER JOIN producto p ON fd.producto_id = p.id
GROUP BY p.id
ORDER BY CantidadVendido ASC
Limit 5;



SELECT c.nombre||' '||c.apellido AS Cliente, f.fecha_emision, p.nombre AS Producto, fd.cantidad, ft.nombre AS TipoDeFactura
FROM cliente c 
INNER JOIN factura f ON c.id = f.cliente_id
INNER JOIN factura_detalle fd ON f.id = fd.factura_id
INNER JOIN producto p ON fd.producto_id = p.id
INNER JOIN factura_tipo ft ON f.factura_tipo_id = ft.id 
WHERE f.id = 97;



-- Montos de facturas ordenados según totales
-- Mostrar el IVA del 10% de los montos totales de facturas
-- (suponer que todos los productos tienen IVA del 10%)

SELECT f.id, SUM(fd.cantidad * p.precio) AS MontoTotal, SUM((fd.cantidad * p.precio) * 0.1)
FROM factura f
INNER JOIN factura_detalle fd ON f.id = fd.factura_id
INNER JOIN producto p ON fd.producto_id = p.id
GROUP BY f.id
ORDER BY MontoTotal DESC;

