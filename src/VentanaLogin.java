import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaLogin {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Inicio de Sesión - Bienestar Universitario");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        colocarComponentes(panel, frame);

        frame.setVisible(true);
    }

    private static void colocarComponentes(JPanel panel, JFrame frame) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Iniciar Sesión");
        loginButton.setBounds(10, 80, 150, 25);
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = userText.getText();

                if (usuario.equalsIgnoreCase("admin")) {
                    JOptionPane.showMessageDialog(panel, "Inicio de sesión exitoso. Bienvenido Administrador.");
                    frame.dispose(); // Cerrar ventana de login
                    VentanaAdministrador.main(null); // Abrir ventana de administrador
                } else if (!usuario.isEmpty()) {
                    JOptionPane.showMessageDialog(panel, "Inicio de sesión exitoso. Bienvenido Estudiante.");
                    frame.dispose(); // Cerrar ventana de login
                    VentanaEstudiante.main(null); // Abrir ventana de estudiante
                } else {
                    JOptionPane.showMessageDialog(panel, "Por favor, ingrese un usuario válido.");
                }
            }
        });
    }
}
