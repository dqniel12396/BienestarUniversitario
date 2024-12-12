import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaAdministrador {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel del Administrador");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        colocarComponentes(panel);

        frame.setVisible(true);
    }

    private static void colocarComponentes(JPanel panel) {
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("Gestión de Recursos - Administrador");
        titleLabel.setBounds(10, 10, 300, 25);
        panel.add(titleLabel);

        JLabel citasLabel = new JLabel("Citas Médicas:");
        citasLabel.setBounds(10, 40, 100, 25);
        panel.add(citasLabel);

        ArrayList<CitaMedica> citas = CitaMedica.generarCitasEjemplo();
        JTextArea areaCitas = new JTextArea();
        areaCitas.setBounds(10, 70, 250, 100);

        for (CitaMedica cita : citas) {
            areaCitas.append(cita.getFecha() + " " + cita.getHora() + " - " + cita.getEstado() + "\n");
        }
        panel.add(areaCitas);

        JButton actualizarCitaButton = new JButton("Actualizar Estado Cita");
        actualizarCitaButton.setBounds(10, 180, 200, 25);
        panel.add(actualizarCitaButton);

        actualizarCitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!citas.isEmpty()) {
                    citas.get(0).setEstado("Reservada");
                    JOptionPane.showMessageDialog(panel, "Estado de cita actualizado.");
                }
            }
        });

        JLabel implementosLabel = new JLabel("Implementos Deportivos:");
        implementosLabel.setBounds(300, 40, 200, 25);
        panel.add(implementosLabel);

        ArrayList<ImplementoDeportivo> implementos = ImplementoDeportivo.generarImplementosEjemplo();
        JTextArea areaImplementos = new JTextArea();
        areaImplementos.setBounds(300, 70, 250, 100);

        for (ImplementoDeportivo implemento : implementos) {
            areaImplementos.append(implemento.getTipoImplemento() + " - " + implemento.getEstado() + "\n");
        }
        panel.add(areaImplementos);

        JButton actualizarImplementoButton = new JButton("Actualizar Estado Implemento");
        actualizarImplementoButton.setBounds(300, 180, 250, 25);
        panel.add(actualizarImplementoButton);

        actualizarImplementoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!implementos.isEmpty()) {
                    implementos.get(0).setEstado("No Disponible");
                    JOptionPane.showMessageDialog(panel, "Estado de implemento actualizado.");
                }
            }
        });
    }
}
