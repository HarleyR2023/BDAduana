package bdaduana.controlador;

import bdaduana.modelo.Empleado;
import bdaduana.modelo.Trabajador;
import bdaduana.vista.PantallaEmpleados;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorEmpleados {
    public static final ArrayList<Empleado> EMPLEADOS = new ArrayList<>();
    
    private final PantallaEmpleados pantalla;
    private final DefaultTableModel modelo;
    
    public ControladorEmpleados(PantallaEmpleados pantalla) {
        this.pantalla = pantalla;
        this.modelo = (DefaultTableModel) pantalla.tableRegistros.getModel();
        this.configurarComponentes();
        this.iniciarTabla();
    }
    
    private void configurarComponentes() {
        Empleado ejemplo = new Empleado();
        ejemplo.setUsuario("EmpleadoEjem");
        ejemplo.setCorreo("empleado1234@gmail.com");
        ejemplo.setDNI("12345678");
        ejemplo.setContraseña("ejemplo");
    
        EMPLEADOS.add(ejemplo);
        
        modelo.setRowCount(0);
        pantalla.buttonRegistrar.addActionListener((e) -> this.crearRegistro());
        pantalla.buttonActualizar.addActionListener((e) -> this.guardarCambios());
        pantalla.buttonEliminar.addActionListener((e) -> this.eliminarRegistro());
        
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
    
    public void iniciarTabla() {
        EMPLEADOS.forEach(empleado -> {
            modelo.addRow(empleado.registrarNuevo());
        });
    }
    
    public void crearRegistro() {
        modelo.setRowCount(modelo.getRowCount() + 1);
        for (int column = 0; column < modelo.getColumnCount(); column++) {
                modelo.setValueAt("", modelo.getRowCount() - 1, 0);
            }
    }
    
    public void guardarCambios() {
        if (!this.esValido()) return;
        EMPLEADOS.clear();
        for (int row = 0; row < modelo.getRowCount(); row++) {
            Empleado empleado = new Empleado();
            String dni = String.valueOf(modelo.getValueAt(row, 0));
            String correo = String.valueOf(modelo.getValueAt(row, 1));
            String usuario = String.valueOf(modelo.getValueAt(row, 2));
            String contrasena = String.valueOf(modelo.getValueAt(row, 0));
            empleado.setDNI(dni);
            empleado.setContraseña(correo);
            empleado.setUsuario(usuario);
            empleado.setContraseña(contrasena);
            EMPLEADOS.add(empleado);
        }
        JOptionPane.showMessageDialog(pantalla, "Datos guardados con éxito!");
    }
    
    public boolean esValido() {
        for (int row = 0; row < modelo.getRowCount(); row++) {
            for (int column = 0; column < modelo.getColumnCount(); column++) {
                Object data = modelo.getValueAt(row, column);
                
                if (String.valueOf(data).isEmpty() || String.valueOf(data).isBlank()) {
                    JOptionPane.showMessageDialog(pantalla, "Te falta completar algunos datos!");
                    return false;
                }
            }
        }
        return true;
    }
    
    public void eliminarRegistro() {
        int selectedRow = pantalla.tableRegistros.getSelectedRow();
        
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(pantalla, "No tienes ningún registro seleccionado!");
            return;
        }
        modelo.removeRow(pantalla.tableRegistros.getSelectedRow());
    }
}
