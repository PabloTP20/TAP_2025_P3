import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame miVentana = new JFrame();
        miVentana.setSize(800,400);
        miVentana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//cierra el programa
        miVentana.setTitle("Mi primer GUI");
        miVentana.setLocationRelativeTo(null);
        // miVentana.setResizable(false);


        // Definicion de paneles como contenedores
        JPanel panelGeneral = new JPanel();
        JPanel panelSuperior = new JPanel();
        JPanel panelInferior = new JPanel();
        JPanel panelBotones = new JPanel();
        // DEfinicion de etiquetas parte superior
        JLabel lblClave = new JLabel();
        lblClave.setText("Clave:");
        JLabel lblNombre = new JLabel("Nombre:");
        //Definicion de cajas de texto parte superior
        JTextField txtClave = new JTextField(5);
        JTextField txtNombre = new JTextField(30);

        //Definicion de etiquetas parte inferior
        JLabel lblDireccion = new JLabel("Direccion:");
        JTextField txtDireccion = new JTextField(30);

        //Definimos unos botones
        JButton btnAceptar = new JButton("Aceptar");
        JButton btnCancelar = new JButton("Cancelar");

        //integrar paneles


        panelSuperior.add(lblClave);
        panelSuperior.add(txtClave);
        panelSuperior.add(lblNombre);
        panelSuperior.add(txtNombre);

        panelInferior.add(lblDireccion);
        panelInferior.add(txtDireccion);
        panelInferior.add(btnAceptar);
        panelInferior.add(btnCancelar);

        panelBotones.add(btnAceptar);
        panelBotones.add(btnCancelar);

        panelGeneral.add(panelSuperior);
        panelGeneral.add(panelInferior);
        panelGeneral.add(panelBotones);
        miVentana.add(panelGeneral);


        miVentana.setVisible(true);
    }
}
