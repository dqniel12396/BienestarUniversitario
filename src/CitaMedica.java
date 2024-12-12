import java.util.ArrayList;

public class CitaMedica {
    private String fecha;
    private String hora;
    private String estado; // Disponible, Reservada, Cancelada
    private String doctorAsignado;

    public CitaMedica(String fecha, String hora, String estado, String doctorAsignado) {
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.doctorAsignado = doctorAsignado;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDoctorAsignado() {
        return doctorAsignado;
    }

    public static ArrayList<CitaMedica> generarCitasEjemplo() {
        ArrayList<CitaMedica> citas = new ArrayList<>();
        citas.add(new CitaMedica("2024-12-13", "10:00", "Disponible", "Dr. Pérez"));
        citas.add(new CitaMedica("2024-12-13", "11:00", "Disponible", "Dr. Gómez"));
        return citas;
    }
}
