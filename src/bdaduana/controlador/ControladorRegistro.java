package bdaduana.controlador;

import bdaduana.conexion.BaseDatos;
import bdaduana.vista.PantallaLogin;
import bdaduana.vista.PantallaRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import javax.swing.JOptionPane;

public class ControladorRegistro implements ActionListener, MouseListener {
    private final PantallaRegistro pantalla;
    
    public ControladorRegistro(PantallaRegistro pantalla) {
        this.pantalla = pantalla;
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        pantalla.OCULTAR.setVisible(false);
        
        this.configurarListeners();
    }
    
    
    public void configurarListeners() {
        pantalla.btnRegistrar.addActionListener(this);
        pantalla.btnVolver.addActionListener(this);
        pantalla.OCULTAR.addMouseListener(this);
        pantalla.VER1.addMouseListener(this);
    }
    
    public void registrar() {
        String nombre = pantalla.txtNombre.getText();
        String dni = pantalla.txtDNI.getText();
        String correo = pantalla.txtCorreo.getText();
        String contraseña = String.valueOf(pantalla.txtPass.getPassword());
        
        try {
            String codigoSQL = "insert into usuarios values (?, ?, ?, ?)";
            PreparedStatement consulta = BaseDatos.INSTANCE.getConexion().prepareStatement(codigoSQL);
            
            consulta.setString(1, nombre);
            consulta.setString(2, dni);
            consulta.setString(3, correo);
            consulta.setString(4, contraseña);
            consulta.executeUpdate();
            
            JOptionPane.showMessageDialog(pantalla, "Registro exitoso!");
        }
        catch (SQLException error) {
            JOptionPane.showMessageDialog(pantalla, "Error: No se logró registrar! \n" + error.getMessage());
        }
    }
    
    public void ocultarIcono() {
        pantalla.VER1.setVisible(true);
        pantalla.OCULTAR.setVisible(false);
        pantalla.txtPass.setEchoChar('●');
    }
    
    public void verIcono() {
        pantalla.VER1.setVisible(false);
        pantalla.OCULTAR.setVisible(true);
        pantalla.txtPass.setEchoChar((char) 0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pantalla.btnVolver) {
            ControladorLogin login = new ControladorLogin(new PantallaLogin());
            pantalla.dispose();
        }
        if (e.getSource() == pantalla.btnRegistrar) {
            this.registrar();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getComponent() == pantalla.OCULTAR) {
           this.ocultarIcono();
       }
       if (e.getComponent() == pantalla.VER1) {
           this.verIcono();
       }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
