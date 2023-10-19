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

public class ControladorLogin implements ActionListener, MouseListener {
    private final PantallaLogin pantalla;
    
    public ControladorLogin(PantallaLogin pantalla) {
        this.pantalla = pantalla;
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        pantalla.OCULTAR.setVisible(false);
        
        this.configurarListeners();
    }
    
    public void configurarListeners() {
        pantalla.btnEntrar.addActionListener(this);
        pantalla.btnRegistrar.addActionListener(this);
        pantalla.OCULTAR.addMouseListener(this);
        pantalla.VER.addMouseListener(this);
    }
    
    public boolean login(String correo, String contraseña) {
        try {
            String codigoSQL = "select from * where Usuarios where Correo = ? and Contraseña = ?";
            PreparedStatement consulta = BaseDatos.INSTANCE.getConexion().prepareStatement(codigoSQL);
            consulta.setString(1, correo);
            consulta.setString(2, contraseña);
            
            return consulta.executeQuery().next();
        }
        catch (SQLException error) {
            JOptionPane.showMessageDialog(pantalla, "Error: Correo o contraseña inválida!");
        }
        return false;
    }
    
    public void registrar() {
        ControladorRegistro registro = new ControladorRegistro(new PantallaRegistro());
        pantalla.dispose();
    }
    
    public void iniciarSesion() {
        String correo = pantalla.txtUser.getText();
        String contraseña = String.valueOf(pantalla.txtPass.getPassword());
            
        if (this.login(correo, contraseña)) {
            JOptionPane.showMessageDialog(pantalla, "Inicio de sesión exitoso!");
        }
    }
    
    public void ocultarIcono() {
        pantalla.VER.setVisible(true);
        pantalla.OCULTAR.setVisible(false);
        pantalla.txtPass.setEchoChar('●');
    }
    
    public void verIcono() {
        pantalla.VER.setVisible(false);
        pantalla.OCULTAR.setVisible(true);
        pantalla.txtPass.setEchoChar((char) 0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pantalla.btnEntrar) {
            this.iniciarSesion();
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
       if (e.getComponent() == pantalla.VER) {
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
