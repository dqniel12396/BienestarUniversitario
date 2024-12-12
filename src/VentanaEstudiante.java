import javax.swing.*;
import java.util.ArrayList;

public class VentanaEstudiante {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel de Estudiante");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        colocarComponentes(panel);

        frame.setVisible(true);
    }

    private static void colocarComponentes(JPanel panel) {
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("Citas Médicas Disponibles:");
        titleLabel.setBounds(10, 20, 200, 25);
        panel.add(titleLabel);

        ArrayList<CitaMedica> citas = CitaMedica.generarCitasEjemplo();
        JTextArea areaCitas = new JTextArea();
        areaCitas.setBounds(10, 50, 300, 150);

        for (CitaMedica cita : citas) {
            areaCitas.append(cita.getFecha() + " " + cita.getHora() + " - " + cita.getEstado() + "\n");
        }

        panel.add(areaCitas);

        JButton reservarCitaButton = new JButton("Reservar Cita");
        reservarCitaButton.setBounds(10, 220, 150, 25);
        panel.add(reservarCitaButton);
    }
}
