package DiseñoProyecto;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.List;


@SuppressWarnings("unused")
public class ConversorTemperatura extends Componentes{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<String> opciones;
	JComboBox<String> comboBox;

	public ConversorTemperatura() {
		Config();
		super.iniciarMenuPrincipal();
		super.DescripcionSecInput();
		PanelOpciones();
		super.Boton();
		setVisible(true);
	}
	
	@Override
	protected void Config() {
		super.Config();
		setTitle("Conversor de Temperatura");
		setSize(500, 150);
	}
	
	private void PanelOpciones() {
        // Crear un arreglo de opciones
        opciones = List.of("  <>Default<>", "  Celsius a Kelvin",
        		"  Kelvin a Celsius");

        // Crear el componente JComboBox con las opciones
        String[] arregloOpciones = opciones.toArray(new String[0]);
        comboBox = new JComboBox<>(arregloOpciones);

        // Agregar el JComboBox al contenido de la ventana
        getContentPane().add(comboBox,BorderLayout.CENTER);
	}
	
	@Override
	protected void mostrarRespuesta() {
		try {
			String contenidoInput = super.inputField.getText();
	        double monedaconvertida = Double.parseDouble(contenidoInput);
	        int index = opciones.indexOf((String) comboBox.getSelectedItem());
	        
	        switch(index) {
	        	case(1):
	        		JOptionPane.showMessageDialog(this, "Tu temperatura convertida a kelvin es: " + (monedaconvertida+273.15) +" K");
	        	break;
	        	case(2):
	        		JOptionPane.showMessageDialog(this, "Tu temperatura convertida a celsius es: " + (monedaconvertida-273.15) + "°C");
	        	break;
	        }
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(this, "Tu temperatura debe ser un número");
		}
    }

}
