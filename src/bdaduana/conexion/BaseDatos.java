package bdaduana.conexion;

import java.sql.*;
import java.util.Optional;
import javax.swing.JOptionPane;

public class BaseDatos {
    public static final BaseDatos INSTANCE = new BaseDatos(); 
    private static final String BDAUANA_URL = "jdbc:mysql://localhost:3306/BDAduana";
    
    private Connection conexion = null;
    private final String url;
    
    public BaseDatos(String url) {
        this.url = url;
    }
    
    public BaseDatos() {
        this(BDAUANA_URL);
    }
    
    /*
        ** Este método solo se utilizará en el Main para crear la conexión.
    */
    public void crearConexion() {
        if (conexion == null) {
            try {
                this.conexion = DriverManager.getConnection(this.url, "root", "");
            }
            catch (SQLException error) {
                JOptionPane.showMessageDialog(null, "Error: No se pudo establecer la conexión a la BD! \n" + error);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error: La conexión ya está establecida!");
        }
    }
    
    /*
        ** Utilizado para consultas que recupera datos del base de datos, como 'select'.
        ** Retorna un ResultSet opcional, utiliza el método 'get'.
    */
    public Optional<ResultSet> ejecutarQuery(String sqlCodigo) {
        try {
            Statement consulta = conexion.createStatement();
            return Optional.of(consulta.executeQuery(sqlCodigo));
        }
        catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo ejectuar el código SQL \n" + error.getMessage());
            return Optional.empty();
        }
    }
    
    /*
        ** Utilizado para consultas que modifica el base de datos, como 'insert', 'update', y 'delete'.
        ** Retorna la cantidad de filas afectadas por el código SQL.
    */
    public int ejecutarUpdate(String sqlCodigo) {
        try {
            Statement consulta = conexion.createStatement();
            return consulta.executeUpdate(sqlCodigo);
        }
        catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo ejectuar el código SQL \n" + error);
            return 0;
        }
    }
}
