package bdaduana.modelo;

import java.text.DecimalFormat;

public class Administrador extends Trabajador {
    private static final DecimalFormat FORMATO_ADMIN = new DecimalFormat("ADM0000");
    private static int contador = 0;
    
    private final String codigo;
    
    public Administrador() {
        contador++;
        this.codigo = FORMATO_ADMIN.format(contador);
    }
    
    public Object[] registrarNuevo() {
        Object[] filas = {
            this.codigo,
            this.getNombre(),
            this.getApellido(),
            this.getUsuario(),
            this.getContraseña()
        };
        return filas;
    }
}
