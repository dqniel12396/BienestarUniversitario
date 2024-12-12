import java.util.ArrayList;

public class ImplementoDeportivo {
    private String tipoImplemento;
    private String estado; // Disponible o No Disponible

    public ImplementoDeportivo(String tipoImplemento, String estado) {
        this.tipoImplemento = tipoImplemento;
        this.estado = estado;
    }

    public String getTipoImplemento() {
        return tipoImplemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static ArrayList<ImplementoDeportivo> generarImplementosEjemplo() {
        ArrayList<ImplementoDeportivo> implementos = new ArrayList<>();
        implementos.add(new ImplementoDeportivo("Balón de Fútbol", "Disponible"));
        implementos.add(new ImplementoDeportivo("Raqueta de Tenis", "Disponible"));
        return implementos;
    }
}
