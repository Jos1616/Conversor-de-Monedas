package DiseñoProyecto;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Componentes extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2680119429685583479L;
	JTextField inputField;
	
	protected void Config() {
		setTitle("ProyectoAlura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 120);
        setLocationRelativeTo(null);
	}
	
	protected void iniciarMenuPrincipal() {
		// TODO Auto-generated method stub
		//String input = JOptionPane.showInputDialog(null, "Ingresa el valor de tu moneda en soles");
		
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("Menú");
		JMenu ayuda = new JMenu("Ayuda");
		
		//String[] vector = new String[10];
		JMenuItem opcion1 = new JMenuItem("Regresar principal");
        JMenuItem opcion2 = new JMenuItem("Salir");
        
        //String[] vector = new String[10];
        JMenuItem manual = new JMenuItem("Manual");
        JMenuItem info = new JMenuItem("About me");
		
        //Para Agregar elementos al menu
        menu.add(opcion1);
        menu.add(opcion2);
        
        //Para Agregar elementos al ayuda
        ayuda.add(manual);
        ayuda.add(info);
        
        //Para agregar el menu a la barra de menu
        menubar.add(menu);
        menubar.add(ayuda);
        
        //Establecer la barra de menu en la ventana
        setJMenuBar(menubar);
        
     // Agregar ActionListener al menu Principal
        opcion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí va la funcionalidad que se ejecutará cuando se seleccione "Nuevo"
                JOptionPane.showMessageDialog(opcion1, "Regresando a la opción principal");
                PantallaPrincipal Ventana0 = new PantallaPrincipal();
        		Ventana0.setVisible(true);
        		setVisible(false);
            }
        });
        opcion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí va la funcionalidad que se ejecutará cuando se seleccione "Nuevo"
                JOptionPane.showMessageDialog(opcion2, "Que tenga buen día \n Saliendo . . . ");
                System.exit(0);
            }
        });
        
     // Agregar ActionListener al menu Ayuda
        manual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí va la funcionalidad que se ejecutará cuando se seleccione "Nuevo"
                JOptionPane.showMessageDialog(manual, "Mostrando el manual");
            }
        });
        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí va la funcionalidad que se ejecutará cuando se seleccione "Nuevo"
                JOptionPane.showMessageDialog(info, "@autor : Josue Urcia \n@proyecto: AluraONE2 Conversor");
            }
        });
	}
	
	protected void DescripcionSecInput() {
		
		/// Crear un panel para el campo de entrada y la descripción
        JPanel panelCentral = new JPanel(new GridLayout(1, 1, 10, 10));
        panelCentral.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Crear una etiqueta con la descripción
        JLabel descripcionLabel = new JLabel("Ingrese el valor que desea convertir: ");
        //valor =  Double.parseDouble(inputField.getText());

        // Crear el campo de entrada
        inputField = new JTextField(20);
        inputField.setHorizontalAlignment(JTextField.CENTER);

        // Agregar la descripción y el campo de entrada al panel
        panelCentral.add(descripcionLabel);
        panelCentral.add(inputField);

        // Establecer la posición del panel de campo de entrada y descripción en el centro de la ventana
        add(panelCentral, BorderLayout.PAGE_START);
	}
	protected void Boton() {
	// Crear el botón para mostrar el contenido del input
    JButton mostrarBoton = new JButton("Mostrar");
    mostrarBoton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mostrarRespuesta();
        }
    });
    
    getContentPane().add(mostrarBoton,BorderLayout.PAGE_END );
	}
	
	protected void mostrarRespuesta() {
        String contenidoInput = inputField.getText();
        JOptionPane.showMessageDialog(this, "Tu unidad convertida es: " + contenidoInput);
    }
}
