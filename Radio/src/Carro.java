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

public class Carro {

	private JFrame frame;
	private JTextField textField;

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
	 * Create the application.
	 */
	public Carro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 675, 277);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_1 = new JButton("1");
		btn_1.setBounds(18, 200, 39, 23);
		frame.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.setBounds(67, 200, 39, 23);
		frame.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.setBounds(116, 200, 39, 23);
		frame.getContentPane().add(btn_3);
		
		JButton btn_4 = new JButton("4");
		btn_4.setBounds(164, 200, 39, 23);
		frame.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.setBounds(213, 200, 39, 23);
		frame.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.setBounds(262, 200, 39, 23);
		frame.getContentPane().add(btn_6);
		
		JButton btn_7 = new JButton("7");
		btn_7.setBounds(310, 200, 40, 23);
		frame.getContentPane().add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_8.setBounds(360, 200, 39, 23);
		frame.getContentPane().add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setBounds(409, 200, 39, 23);
		frame.getContentPane().add(btn_9);
		
		JButton btn_10 = new JButton("10");
		btn_10.setBounds(458, 200, 51, 23);
		frame.getContentPane().add(btn_10);
		
		JButton btn_11 = new JButton("11");
		btn_11.setBounds(519, 200, 51, 23);
		frame.getContentPane().add(btn_11);
		
		JButton btn_12 = new JButton("12");
		btn_12.setBounds(580, 200, 51, 23);
		frame.getContentPane().add(btn_12);
		
		JRadioButton rdbtnOnOff = new JRadioButton("Apagado");
		rdbtnOnOff.setBounds(23, 12, 97, 23);
		frame.getContentPane().add(rdbtnOnOff);
		
		JRadioButton rdbtnAmFm = new JRadioButton("AM");
		rdbtnAmFm.setBounds(23, 38, 51, 23);
		frame.getContentPane().add(rdbtnAmFm);
		
		JButton bwd_btn = new JButton("<-");
		bwd_btn.setBounds(255, 160, 51, 33);
		frame.getContentPane().add(bwd_btn);
		
		JButton fwd_btn = new JButton("->");
		fwd_btn.setBounds(305, 160, 51, 33);
		frame.getContentPane().add(fwd_btn);
		
		textField = new JTextField();
		textField.setBackground(Color.BLACK);
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 55));
		textField.setText("107.5");
		textField.setBounds(172, 62, 264, 87);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnSaveSelect = new JRadioButton("Guardar Estacion");
		rdbtnSaveSelect.setBounds(16, 171, 109, 23);
		frame.getContentPane().add(rdbtnSaveSelect);
	}
}
