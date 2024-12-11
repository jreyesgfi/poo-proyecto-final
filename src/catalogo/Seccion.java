package catalogo;

/**
 * La clase Seccion representa una sección con un nombre y una descripción.
 */
public class Seccion {
    private String nombre;
    private String descripcion;

    /**
     * Constructor para inicializar un objeto Seccion.
     *
     * @param nombre El nombre de la sección.
     * @param descripcion La descripción de la sección.
     */
    public Seccion(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el nombre de la sección.
     *
     * @return El nombre de la sección.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Obtiene la descripción de la sección.
     *
     * @return La descripción de la sección.
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * Establece el nombre de la sección.
     *
     * @param nombre El nombre de la sección.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece la descripción de la sección.
     *
     * @param descripcion La descripción de la sección.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}