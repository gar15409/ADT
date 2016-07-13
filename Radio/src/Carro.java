import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;


/**
@author Pablo Ortiz, Pedro Garcia, Fredy Espana
@version 1.1 alpha
*/	
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;

public class Carro extends Driver {

	private JFrame frame; /** Frame principal */
	private JTextField textField; /** Pantalla del radio */
	private JButton btn; /** Boton numeral */
	private JButton btn_1; /** Boton numeral */
	private JButton btn_2; /** Boton numeral */
	private JButton btn_3; /** Boton numeral */
	private JButton btn_4; /** Boton numeral */
	private JButton btn_5; /** Boton numeral */
	private JButton btn_6; /** Boton numeral */
	private JButton btn_7; /** Boton numeral */
	private JButton btn_8; /** Boton numeral */
	private JButton btn_9; /** Boton numeral */
	private JButton btn_10; /** Boton numeral */
	private JButton btn_11; /** Boton numeral */
	private JButton btn_12; /** Cambiar emisora (FORWARD) */
	private JButton btn_13; /** Cambiar emisora (BACKWARD) */
	private JRadioButton rdbtnSaveSelect; /** Guardar o seleccionar con botones */
	private JRadioButton rdbtnOnOff; /** Encendido o Apagado */
	private JRadioButton rdbtnAm; /** AM o FM */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carro window = new Carro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Se crea la aplicacion
	 */
	public Carro() {
		initialize();
		
	}

	/**
	 * Inicializacion de contenidos del frame
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setResizable(false);
		frame.setBounds(100, 100, 652, 277);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btn = new JButton("1");
		btn.setBounds(10, 200, 47, 37);
		frame.getContentPane().add(btn);
		btn.addActionListener(new MiListener());
		
		btn_1 = new JButton("2");
		btn_1.setBounds(55, 200, 51, 37);
		frame.getContentPane().add(btn_1);
		btn_1.addActionListener(new MiListener());
		
		btn_2 = new JButton("3");
		btn_2.setBounds(104, 200, 51, 37);
		frame.getContentPane().add(btn_2);
		btn_2.addActionListener(new MiListener());
		
		btn_3 = new JButton("4");
		btn_3.setBounds(152, 200, 51, 37);
		frame.getContentPane().add(btn_3);
		btn_3.addActionListener(new MiListener());
		
		btn_4 = new JButton("5");
		btn_4.setBounds(201, 200, 51, 37);
		frame.getContentPane().add(btn_4);
		btn_4.addActionListener(new MiListener());
		
		btn_5 = new JButton("6");
		btn_5.setBounds(250, 200, 51, 37);
		frame.getContentPane().add(btn_5);
		btn_5.addActionListener(new MiListener());
		
		btn_6 = new JButton("7");
		btn_6.setBounds(299, 200, 51, 37);
		frame.getContentPane().add(btn_6);
		btn_6.addActionListener(new MiListener());
		
		btn_7 = new JButton("8");
		btn_7.setBounds(348, 200, 51, 37);
		frame.getContentPane().add(btn_7);
		btn_7.addActionListener(new MiListener());
		
		btn_8 = new JButton("9");
		btn_8.setBounds(397, 200, 51, 37);
		frame.getContentPane().add(btn_8);
		btn_8.addActionListener(new MiListener());
		
		btn_9 = new JButton("10");
		btn_9.setBounds(446, 200, 63, 37);
		frame.getContentPane().add(btn_9);
		btn_9.addActionListener(new MiListener());
		
		btn_10 = new JButton("11");
		btn_10.setBounds(507, 200, 63, 37);
		frame.getContentPane().add(btn_10);
		btn_10.addActionListener(new MiListener());
		
		btn_11 = new JButton("12");
		btn_11.setBounds(568, 200, 63, 37);
		frame.getContentPane().add(btn_11);
		btn_11.addActionListener(new MiListener());
		
		rdbtnOnOff = new JRadioButton("Apagado");
		rdbtnOnOff.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				ON_OFF(); 
				if(power == true){
					rdbtnOnOff.setText("Encendido");
					/** Cast para display */
					textField.setText(String.valueOf(Tune));
				}
				else{
					rdbtnOnOff.setText("Apagado");
					textField.setText("");
				}
			}
		});
		
		
		
		rdbtnOnOff.setBounds(23, 12, 97, 23);
		frame.getContentPane().add(rdbtnOnOff);
		
		rdbtnAm = new JRadioButton("AM");
		rdbtnAm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AM_FM();
				if(Tune_Type == true){
					rdbtnAm.setText("FM");
					if (power == true){
						/** Cast para display */
					textField.setText(String.valueOf(Tune));
					}
				}
				if(Tune_Type == false){
					rdbtnAm.setText("AM");
					if(power == true){
						/** Cast para display */
					textField.setText(String.valueOf(Tune));
					}
				}
			}
		});
		
		rdbtnAm.setBounds(23, 38, 70, 23);
		frame.getContentPane().add(rdbtnAm);
		
		btn_12 = new JButton("<-");
		btn_12.setBounds(255, 160, 51, 33);
		frame.getContentPane().add(btn_12);
		btn_12.addActionListener(new MiListener());
		
		btn_13 = new JButton("->");
		btn_13.setBounds(305, 160, 51, 33);
		frame.getContentPane().add(btn_13);
		btn_13.addActionListener(new MiListener());
		
		textField = new JTextField();
		textField.setBackground(Color.BLACK);
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 55));
		textField.setText("");
		textField.setBounds(172, 62, 264, 87);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		rdbtnSaveSelect = new JRadioButton("Guardar Estacion");
		rdbtnSaveSelect.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Guardar_seleccion();
				
				if(Save_Select == true){
					rdbtnSaveSelect.setText("Seleccionar Estacion");
				}
				else	{
					rdbtnSaveSelect.setText("Guardar Estacion");
				}
			}
		});
		
		rdbtnSaveSelect.setBounds(16, 171, 155, 23);
		frame.getContentPane().add(rdbtnSaveSelect);
	}
	
	/** Manejo de eventos, listeners 
	@author Pablo Ortiz, Pedro Garcia, Fredy Espana
	@version 1.1 alpha
	*/	
	private class MiListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			/** BOTON [1] */
			if(e.getSource()==btn){
				if(Save_Select == false){
					Guardar_Emisora(0);
				}
				else{
					Seleccionar_emisora_guardada(0);
					textField.setText(String.valueOf(new DecimalFormat("0.00").format(Tune)));
				}
			}
			
			/** BOTON [2] */
			if(e.getSource()==btn_1){
				if(Save_Select == false){
					Guardar_Emisora(1);
				}
				else{
					Seleccionar_emisora_guardada(1);
					textField.setText(String.valueOf(new DecimalFormat("0.00").format(Tune)));
				}
			}
			
			/** BOTON [3] */
			if(e.getSource()==btn_2){
				if(Save_Select == false){
					Guardar_Emisora(2);
				}
				else{
					Seleccionar_emisora_guardada(2);
					textField.setText(String.valueOf(new DecimalFormat("0.00").format(Tune)));
				}
			}
			
			/** BOTON [4] */
			if(e.getSource()==btn_3){
				if(Save_Select == false){
					Guardar_Emisora(3);
				}
				else{
					Seleccionar_emisora_guardada(3);
					textField.setText(String.valueOf(new DecimalFormat("0.00").format(Tune)));
				}
			}
			
			/** BOTON [5] */
			if(e.getSource()==btn_4){
				if(Save_Select == false){
					Guardar_Emisora(4);
				}
				else{
					Seleccionar_emisora_guardada(4);
					textField.setText(String.valueOf(new DecimalFormat("0.00").format(Tune)));
				}
			}
			
			/** BOTON [6] */
			if(e.getSource()==btn_5){
				if(Save_Select == false){
					Guardar_Emisora(5);
				}
				else{
					Seleccionar_emisora_guardada(5);
					textField.setText(String.valueOf(new DecimalFormat("0.00").format(Tune)));
				}
			}
			
			/** BOTON [7] */
			if(e.getSource()==btn_6){
				if(Save_Select == false){
					Guardar_Emisora(6);
				}
				else{
					Seleccionar_emisora_guardada(6);
					textField.setText(String.valueOf(new DecimalFormat("0.00").format(Tune)));
				}
			}
			
			/** BOTON [8] */
			if(e.getSource()==btn_7){
				if(Save_Select == false){
					Guardar_Emisora(7);
				}
				else{
					Seleccionar_emisora_guardada(7);
					textField.setText(String.valueOf(new DecimalFormat("0.00").format(Tune)));
				}
			}
			
			/** BOTON [9] */
			if(e.getSource()==btn_8){
				if(Save_Select == false){
					Guardar_Emisora(8);
				}
				else{
					Seleccionar_emisora_guardada(9);
					textField.setText(String.valueOf(new DecimalFormat("0.00").format(Tune)));
				}
			}
			
			/** BOTON [10] */
			if(e.getSource()==btn_9){
				if(Save_Select == false){
					Guardar_Emisora(9);
				}
				else{
					Seleccionar_emisora_guardada(9);
					textField.setText(String.valueOf(new DecimalFormat("0.00").format(Tune)));
				}
			}
			
			/** BOTON [11] */
			if(e.getSource()==btn_10){
				if(Save_Select == false){
					Guardar_Emisora(10);
				}
				else{
					Seleccionar_emisora_guardada(10);
					textField.setText(String.valueOf(new DecimalFormat("0.00").format(Tune)));
				}
			}
			
			/** BOTON [12] */
			if(e.getSource()==btn_11){
				if(Save_Select == false){
					Guardar_Emisora(11);
				}
				else{
					Seleccionar_emisora_guardada(11);
					textField.setText(String.valueOf(new DecimalFormat("0.00").format(Tune)));
				}
			}
			
			/** Atrasar emisora [<-] */
			if(e.getSource()==btn_12){
				Cambio_de_Emisora(false);
				textField.setText(String.valueOf(new DecimalFormat("0.00").format(Tune)));
			}
			
			/** Adelantar emisora [->] */
			if(e.getSource()==btn_13){
				Cambio_de_Emisora(true);
				textField.setText(String.valueOf(new DecimalFormat("0.00").format(Tune)));
			}
		}
	}
}
