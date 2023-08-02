package DiseñoProyecto;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.List;

@SuppressWarnings("unused")
public class ConversorMonedas extends Componentes{
	/**
	 * Conversor de monedas
	 * @author Josue Urcia
	 */
	private static final long serialVersionUID = 1L;
	List<String> opciones;
	JComboBox<String> comboBox;


	public ConversorMonedas() {
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
		setTitle("Conversor de monedas");
		setSize(500, 150);
	}
	
	private void PanelOpciones() {
        // Crear un arreglo de opciones
        opciones = List.of("  <>Default<>", "  Dolares a soles",
        		"  Soles a Dolares");

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
	        		JOptionPane.showMessageDialog(this, "Tu moneda convertida a soles es: S/ " + monedaconvertida*3.5);
	        	break;
	        	case(2):
	        		JOptionPane.showMessageDialog(this, "Tu moneda convertida a dolares es: $ " + monedaconvertida/3.5);
	        	break;
	        }
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(this, "Tu moneda debe ser un número");
		}
    }

}
