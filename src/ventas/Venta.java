package ventas;

import java.time.LocalDate;
import java.util.List;

public class Venta {
    private String id_venta;
    private LocalDate fecha_venta;
    private String id_cliente;
    private String id_coche;
    private List<String> id_mejoras;
}
