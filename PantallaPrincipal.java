package DiseñoProyecto;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PantallaPrincipal extends Componentes {	
	/**
	 * Programa de interfaz principal del programa
	 * @author Josue Urcia
	 */
	private static final long serialVersionUID = 1L;

	public PantallaPrincipal() {
		super.Config();
		super.iniciarMenuPrincipal();
		DescripcionInput();
		this.PanelOpciones();
		this.setVisible(true);
	}
	
	protected void DescripcionInput() {
        /// Crear un panel para el campo de entrada y la descripción
        JPanel panelCentral = new JPanel(new GridLayout(1, 1, 10, 10));
        panelCentral.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Crear una etiqueta con la descripción
        JLabel descripcionLabel = new JLabel("Ingrese la unidad que desea convertir: ");

        // Crear el campo de entrada
        //JTextField inputField = new JTextField(20);
        //inputField.setHorizontalAlignment(JTextField.CENTER);

        // Agregar la descripción y el campo de entrada al panel
        panelCentral.add(descripcionLabel);
        //panelCentral.add(inputField);

        // Establecer la posición del panel de campo de entrada y descripción en el centro de la ventana
        add(panelCentral, BorderLayout.PAGE_START);
	}
	
	private void PanelOpciones() {
        // Crear un arreglo de opciones
        String[] opciones = {"  <>Default<>", "  Conversor de monedas",
        		"  Conversión de Temperatura"};

        // Crear el componente JComboBox con las opciones
        JComboBox<String> comboBox = new JComboBox<>(opciones);

        // Agregar el JComboBox al contenido de la ventana
        getContentPane().add(comboBox,BorderLayout.CENTER);
        
        comboBox.addActionListener (new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String opcionSeleccionada = (String) comboBox.getSelectedItem();
                	if(opcionSeleccionada == "  Conversor de monedas") {
                		JOptionPane.showMessageDialog(null, "¡Has hecho clic en: " + opcionSeleccionada +"\n Redirigiendo . . .");
                		ConversorMonedas Ventana1 = new ConversorMonedas();
                		Ventana1.setVisible(true);
                		setVisible(false);
                	} else {
                		JOptionPane.showMessageDialog(null, "¡Has hecho clic en: " + "  Conversor de Temperatura" +"\n Redirigiendo . . .");
                		ConversorTemperatura Ventana2 = new ConversorTemperatura();
                		Ventana2.setVisible(true);
                		setVisible(false);
                	}
            }
        });
	}

}

