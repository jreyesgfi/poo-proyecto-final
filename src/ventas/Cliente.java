package ventas;

public class Cliente {
    private String id;
    private String name;
    private String telefono;
    private boolean recibirPublicidad;

    public Cliente(String id, String name, String telefono, boolean recibirPublicidad) {
        this.id = id;
        this.name = name;
        this.telefono = telefono;
        this.recibirPublicidad = recibirPublicidad;
    }


    // Propagar información
    private Cliente copiaCliente() {
        final Cliente copia = new Cliente(this.id, this.name, this.telefono, this.recibirPublicidad);
        return copia;
    }

    public Cliente propagarInformacion(){
        return copiaCliente();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTelefono() {
        return telefono;
    }

    public boolean isRecibirPublicidad() {
        return recibirPublicidad;
    }
}
