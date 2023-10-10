package bdaduana.modelo;

import bdaduana.Formatos;

public class Administrador extends Trabajador {
    private static int contador = 0;
    
    private final String codigo;
    
    public Administrador() {
        contador++;
        this.codigo = Formatos.ADMIN.format(contador);
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
