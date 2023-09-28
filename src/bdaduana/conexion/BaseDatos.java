package bdaduana.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Optional;
import javax.swing.JOptionPane;

public class BaseDatos {
    private static final String URL = "jdbc:mysql://localhost:3306/BDAduana";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "";
    
    private static Connection conexion = null;
    
    public static Connection getConexion() {
        if (conexion == null) {
            try {
                conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            }
            catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Error: No se pudo establecer la conexión a la BD! \n" + error);
            }
        }
        return conexion;
    }
    
    public static Optional<ResultSet> consultaResultSet(String sqlCodigo) {
        Connection conexion = getConexion();
        try {
            PreparedStatement consulta = conexion.prepareStatement(sqlCodigo);
            return Optional.of(consulta.executeQuery());
        }
        catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo ejectuar el código SQL \n" + error);
            return Optional.empty();
        }
    }
    
    public static int consultaUpdate(String sqlCodigo) {
        Connection conexion = getConexion();
        try {
            PreparedStatement consulta = conexion.prepareStatement(sqlCodigo);
            return consulta.executeUpdate();
        }
        catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo ejectuar el código SQL \n" + error);
            return 0;
        }
    }
}
