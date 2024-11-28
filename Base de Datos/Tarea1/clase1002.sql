select * from pedidos;

--Ejemplo: se desea obtener los pedidos cuyo total sean mayores al promedio 

select avg(total) from pedidos;

select (select avg(total) from pedidos) promedio, numero_pedido, ruc, total, factura, fecha from pedidos 
where total > (select avg(total) from pedidos);

--se desea obtener clientes cuya ciudad empiece con A (multiples filas)
SELECT cl.nombre, ci.nombre_ciudad
FROM clientes cl join ciudades ci on cl.codigo_ciudad = ci.codigo_ciudad
WHERE ci.codigo_ciudad in (SELECT codigo_ciudad FROM ciudades
						WHERE UPPER(nombre_ciudad) LIKE 'A%');
						
--se desea obtener clientes cuya ciudad sea ASUNCION (una fila)
SELECT cl.nombre, ci.nombre_ciudad
FROM clientes cl join ciudades ci on cl.codigo_ciudad = ci.codigo_ciudad
WHERE ci.codigo_ciudad = (SELECT codigo_ciudad FROM ciudades
						  WHERE nombre_ciudad LIKE 'ASU%');
						  
/*CREATE VIEW view_name AS query;
Ejemplo:
CREATE VIEW v_hoteles AS
select H.Nombre as Hotel, C.Descripcion as Ciudad, H.CantHabitaciones from Hotel H join Ciudad C
on C.CodCiudad=H.CodCiudad*/

--Vistas
--crear vistas
create or replace view vpedidos as 
select * from pedidos;
	
--consultar vistas
select numero_pedido, fecha from vpedidos;

--eliminar vistas
drop view if exists vpedidos;