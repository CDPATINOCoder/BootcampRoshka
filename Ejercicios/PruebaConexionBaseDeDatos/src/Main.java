import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection c = null;
        try {
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/market", "postgres", "cesarcrack24");

//         topClientesFacturas(c);
//         topClientesGasto(c);
//         topMonedas(c);
 //        topProveedor(c);
//         topProductos(c);
            consultaId97(c);



        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }

    public static void topClientesFacturas(Connection c) throws SQLException {
        try (Statement stmt = c.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT c.nombre || ' ' || c.apellido AS cliente, " +
                     "COUNT(f.cliente_id) AS CANTIDAD_FACTURAS " +
                     "FROM factura f " +
                     "JOIN cliente c ON c.id = f.cliente_id " +
                     "GROUP BY c.nombre, c.apellido " +
                     "ORDER BY COUNT(f.cliente_id) DESC;")) {
            while (rs.next()) {
                System.out.println("Cliente: " + rs.getString("CLIENTE") +
                        ", Cantidad de Facturas: " + rs.getInt("CANTIDAD_FACTURAS"));
            }
        }
    }

    public static void topMonedas(Connection c) throws SQLException {
        try (Statement stmt = c.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT m.nombre AS moneda, COUNT(f.moneda_id) AS TotalMoneda\n" +
                     "FROM cliente c\n" +
                     "INNER JOIN factura f ON c.id = f.cliente_id\n" +
                     "INNER JOIN moneda m ON m.id = f.moneda_id\n" +
                     "GROUP BY m.nombre\n" +
                     "ORDER BY TotalMoneda DESC;")) {
            while (rs.next()) {
                System.out.println("Moneda: " + rs.getString("moneda") +
                        ", Cantidad de Facturas: " + rs.getInt("TotalMoneda"));
            }
        }
    }
    public static void topClientesGasto(Connection c) throws SQLException {
        try (Statement stmt = c.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT c.id, c.nombre||' '||c.apellido AS Cliente, SUM(fd.cantidad * p.precio) AS Monto\n" +
                     "FROM cliente c \n" +
                     "INNER JOIN factura f ON c.id = f.cliente_id\n" +
                     "INNER JOIN factura_detalle fd ON f.id = fd.factura_id\n" +
                     "INNER JOIN producto p ON fd.producto_id = p.id\n" +
                     "GROUP BY c.id, c.nombre, c.apellido\n" +
                     "ORDER BY Monto DESC;")) {
            while (rs.next()) {
                System.out.println("Cliente: " + rs.getString("Cliente") +
                        "Monto : " + rs.getInt("Monto"));
            }
        }
    }

    public static void topProveedor(Connection c) throws SQLException {
        try (Statement stmt = c.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT pv.id, pv.nombre, COUNT(proveedor_id) AS TotalProveedores\n" +
                     "FROM proveedor pv\n" +
                     "INNER JOIN producto p ON pv.id = p.proveedor_id\n" +
                     "GROUP BY pv.id\n" +
                     "ORDER BY TotalProveedores DESC;")) {
            while (rs.next()) {
                System.out.println("id: " + rs.getInt("id") +
                        "nombre : " + rs.getString("nombre") +
                        "TotalProveedor: " + rs.getInt("TotalProveedores"));
            }
        }
    }

    public static void topProductos(Connection c) throws SQLException {
        try (Statement stmt = c.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT p.id, p.nombre, SUM(fd.cantidad) AS CantidadVendido\n" +
                     "FROM factura_detalle fd\n" +
                     "INNER JOIN producto p ON fd.producto_id = p.id\n" +
                     "GROUP BY p.id\n" +
                     "ORDER BY CantidadVendido DESC\n" +
                     "Limit 5;")) {
            while (rs.next()) {
                System.out.println("id: " + rs.getInt("id") +
                        " nombre : " + rs.getString("nombre") +
                        " CantidadVendido: " + rs.getInt("CantidadVendido"));
            }
        }
    }
    public static void topMenosVendido(Connection c) throws SQLException {
        try (Statement stmt = c.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT p.id, p.nombre, SUM(fd.cantidad) AS CantidadVendido\n" +
                     "FROM factura_detalle fd\n" +
                     "INNER JOIN producto p ON fd.producto_id = p.id\n" +
                     "GROUP BY p.id\n" +
                     "ORDER BY CantidadVendido ASC\n" +
                     "Limit 5;\n" +
                     "Limit 5;")) {
            while (rs.next()) {
                System.out.println("id: " + rs.getInt("id") +
                        " nombre : " + rs.getString("nombre") +
                        " CantidadVendido: " + rs.getInt("CantidadVendido"));
            }
        }
    }

    public static void consultaId97(Connection c) throws SQLException {
        try (Statement stmt = c.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT c.nombre||' '||c.apellido AS Cliente, f.fecha_emision, p.nombre AS Producto, fd.cantidad, ft.nombre AS TipoDeFactura\n" +
                     "FROM cliente c \n" +
                     "INNER JOIN factura f ON c.id = f.cliente_id\n" +
                     "INNER JOIN factura_detalle fd ON f.id = fd.factura_id\n" +
                     "INNER JOIN producto p ON fd.producto_id = p.id\n" +
                     "INNER JOIN factura_tipo ft ON f.factura_tipo_id = ft.id \n" +
                     "WHERE f.id = 97;")) {
            while (rs.next()) {
                System.out.println(" Cliente: " + rs.getString("Cliente") +
                        ", Fecha De Emision : " + rs.getString("fecha_emision") +
                        ", Producto: " + rs.getString("Producto") +
                        ", Cantidad : " + rs.getInt("cantidad") +
                        ", Tipo de Factura : " + rs.getString("TipoDeFactura"));
            }
        }
    }





}
