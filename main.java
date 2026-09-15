import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame ventana =  new JFrame("Panel de control");

            ventana.setSize(400,300);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setLocationRelativeTo(null);

            JPanel panel = new JPanel(new GridLayout(5,1,10,10));

            JLabel titulo = new JLabel("Panel de control", JLabel.CENTER);

            JTextField valor = new JTextField("Ingrese un valor");

            JCheckBox chekModo =
                    new JCheckBox("Activar modo avanzado");
            chekModo.setSelected(false);

            JButton EjecutarOperacion =
                    new JButton("Ejecutar Operacion");
            EjecutarOperacion.setEnabled(false);

            JButton botonLimpiar =
                    new JButton("Limpiar campos");
            botonLimpiar.setEnabled(true);

            panel.add(titulo);
            panel.add(valor);
            panel.add(chekModo);
            panel.add(EjecutarOperacion);
            panel.add(botonLimpiar);

            ventana.add(panel);

            ventana.setVisible(true);

        });

    }


}
