package catalogo;

/**
 * La clase Mejora representa una mejora con un nombre y un porcentaje de incremento.
 */
public class Mejora {
    private String nombre;
    private float porcentajeIncremento;

    /**
     * Constructor para inicializar un objeto Mejora.
     *
     * @param nombre El nombre de la mejora.
     * @param porcentajeIncremento El porcentaje de incremento del precio base.
     */
    public Mejora(String nombre, float porcentajeIncremento) {
        this.nombre = nombre;
        this.porcentajeIncremento = porcentajeIncremento;
    }

    /**
     * Obtiene el nombre de la mejora.
     *
     * @return El nombre de la mejora.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el porcentaje de incremento de la mejora.
     *
     * @return El porcentaje de incremento.
     */
    public float getPorcentajeIncremento() {
        return porcentajeIncremento;
    }
}