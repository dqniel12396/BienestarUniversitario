public class Usuario {
    private String nombre;
    private int id;
    private String tipoUsuario; // "Estudiante" o "Administrador"

    public Usuario(String nombre, int id, String tipoUsuario) {
        this.nombre = nombre;
        this.id = id;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }
}
