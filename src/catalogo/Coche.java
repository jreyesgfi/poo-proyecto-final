package catalogo;

import java.util.ArrayList;

/**
 * La clase Coche representa un coche con un identificador, precio base, stock, modelo y año de fabricación.
 */
public class Coche {
    private String id;
    private Float precio_base;
    private Integer stock;
    private String modelo;
    private Integer fabricacion;


    /**
     * Constructor para inicializar un objeto Coche.
     *
     * @param modelo      El modelo del coche.
     * @param precio_base El precio base del coche.
     * @param stock       El stock del coche (debe estar entre 0 y 10).
     * @param fabricacion El año de fabricación del coche.
     */
    public Coche(String modelo, Float precio_base, Integer stock, Integer fabricacion) {
        this.modelo = modelo;
        this.precio_base = precio_base;
        this.stock = obtenerStock(stock);
        this.fabricacion = fabricacion;
        this.id = generarId();
    }

    /**
     * Genera el identificador del coche concatenando el modelo y el año de fabricación.
     *
     * @return El identificador del coche.
     */
    private String generarId() {
        return String.format("%s-%d", this.modelo, this.fabricacion);
    }

    /**
     * Valida y obtiene el stock del coche.
     *
     * @param stock El stock a validar.
     * @return El stock validado.
     * @throws IllegalArgumentException si el stock no está entre 0 y 10.
     */
    private Integer obtenerStock(Integer stock) {
        if (stock < 0 || stock > 10) {
            throw new IllegalArgumentException("El stock tiene que ser mayor a 0 y menor que 10");
        }
        return stock;
    }

}
