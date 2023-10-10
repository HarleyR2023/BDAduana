package bdaduana;

import java.text.DecimalFormat;

public interface Formatos {
    DecimalFormat EMPLEADO = new DecimalFormat("SEC0000");
    DecimalFormat ADMIN = new DecimalFormat("ADM0000");
    DecimalFormat CONSIGNATORIO = new DecimalFormat("0000");
}
