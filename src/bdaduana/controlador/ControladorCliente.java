package bdaduana.controlador;

import bdaduana.conexion.BaseDatos;
import bdaduana.modelo.Cliente;
import bdaduana.vista.PantallaCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class ControladorCliente implements ActionListener {
    private final PantallaCliente pantalla;
    private final DefaultTableModel modeloTabla;
    String[] TituloTabla = {"DAM", "Estado de la carga", "Cantidad de bultos", "Peso", "Duda Razonable"};

    public ControladorCliente(PantallaCliente pantalla) {
        this.pantalla = pantalla;
        this.pantalla.jbtnBuscar.addActionListener(this);
        this.modeloTabla = new DefaultTableModel(null, TituloTabla);
        this.pantalla.jtblMostrar.setModel(modeloTabla);
        this.pantalla.setVisible(true);
    }

    public void MostrarBD() {
        try {
            Statement st = BaseDatos.INSTANCE.getConexion().createStatement();
            ResultSet rs = st.executeQuery("Select * from DAMCliente");
            while (rs.next()) {
                Cliente cl = new Cliente();
                cl.setDAM(rs.getString(1));
                
                // Agrega el resto de los atributos y métodos necesarios para completar la lógica.
                // modelotabla.addRow(cl.BuscarDAM());
            }
            JOptionPane.showMessageDialog(null, "Datos recibidos correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los datos");
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pantalla.jbtnBuscar) {
            MostrarBD();
        }
    }
}
