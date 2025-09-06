import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EjmGridBagLayout extends JFrame {
    public EjmGridBagLayout() {
        setTitle("Ejemplo de GridBagLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);
        setLocationRelativeTo(null);

        // Panel principal con GridBagLayout
        JPanel panelGeneral = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Definimos valores por defecto para gbc
        gbc.insets = new Insets(5, 5, 5, 5); // espacio externo entre componentes
        gbc.fill = GridBagConstraints.NONE; // por defecto no rellenar
        gbc.anchor = GridBagConstraints.WEST; // alineación por defecto
        gbc.weightx = 0; // valores por defecto para reparto de espacio al redimensionar
        gbc.weighty = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;

        // Campo de texto "Clave" [0,0]
        JLabel lblClave = new JLabel("Clave:");
        gbc.gridx = 0; // columna
        gbc.gridy = 0; // fila
        panelGeneral.add(lblClave, gbc);

        // caja de texto para "Clave"  [0,1]
        JTextField txtClave = new JTextField(5);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panelGeneral.add(txtClave, gbc);

        // Campo de texto "Nombre" [0,2]
        JLabel lblNombre = new JLabel("Nombre:");
        gbc.gridx = 2; // columna
        gbc.gridy = 0; // fila
        panelGeneral.add(lblNombre, gbc);

        // caja de texto para "nombre"  [0,3]
        JTextField txtNombre = new JTextField(15);
        gbc.gridx = 3;
        gbc.gridy = 0;
        panelGeneral.add(txtNombre, gbc);

        // Campo de texto  "Direccion" [1,0]
        JLabel lblDireccion = new JLabel("Direccion:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panelGeneral.add(lblDireccion, gbc);

        // caja de texto para "Direccion"  [1,1]
        JTextField txtDireccion = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panelGeneral.add(txtDireccion, gbc);


        // Botón Aceptar [4,0]
        JButton btnAceptar = new JButton("Aceptar");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridheight = 3; // ocupa las dos filas
        gbc.fill = GridBagConstraints.VERTICAL; // se estira a lo ancho
        panelGeneral.add(btnAceptar, gbc);

        // Boton Cancelar [2,2]
        JButton btnCancelar = new JButton("Cancelar");
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 2; //ocupa dos columnas
        gbc.fill = GridBagConstraints.HORIZONTAL; //se estira a lo largo
        panelGeneral.add(btnCancelar, gbc);

        // Agregamos panel al frame
        add(panelGeneral);


        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EjmGridBagLayout());
    }
}