import java.sql.*;

public class EjecutarConsulta {

	public static void main(String[] args) {
		/*Intentamos establecer una conexión empleando el método getConnection de la clase del ejemplo anterior*/     
		 try (Connection conn = ConexionBaseDatos.getConnection()) {
		/*Creamos un objeto de la clase Statement, usado para ejecutar consultas estáticas. Este objeto se crea llamando al método createStatement del objeto Connection*/
		    Statement stmt = conn.createStatement();
		/*A continuación empleamos el método executeQuery de la clase Statement, pasando como parámetro el SQL que queremos ejecutar. El resultado será devuelto en objeto de la clase ResultSet*/    
		ResultSet rs = stmt.executeQuery("SELECT * FROM empleados");
		/*Por último, a modo de ejemplo, recorremos el objeto ResultSet de forma bastante similar a como lo hacíamos con Iteradores*/
		    while (rs.next()) {
		  System.out.println(rs.getString("nombre") + ", " + rs.getInt("edad"));
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }

	
}
