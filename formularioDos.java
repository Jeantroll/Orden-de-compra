package source;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class formularioDos extends JFrame {

	private JPanel contentPane;
	private JTextField txtCliente;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField vlrUnitUNO;
	private JTextField vlrUnitDOS;
	private JTextField vlrUnitTRES;
	private JTextField cantUNO;
	private JTextField cantDOS;
	private JTextField cantTRES;
	private JTextField vlrTotalUNO;
	private JTextField vlrTotalDOS;
	private JTextField vlrTotalTRES;
	private JTextField vlrTOTAL;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formularioDos frame = new formularioDos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public formularioDos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ORDEN DE COMPRA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(28, 28, 141, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cliente");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(28, 72, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtCliente = new JTextField();
		txtCliente.setBounds(84, 70, 156, 20);
		contentPane.add(txtCliente);
		txtCliente.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Producto");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(28, 117, 71, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(28, 142, 141, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(28, 173, 141, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(28, 204, 141, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Vlr. Unitario");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(217, 117, 71, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Cantidad");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(327, 117, 71, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("Vlr. Total");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(440, 118, 65, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Valor total");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(338, 256, 71, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel resultado = new JLabel("");
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		resultado.setBounds(28, 307, 508, 14);
		contentPane.add(resultado);
		
		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.addActionListener(new ActionListener() {
			private Component frame;

			public void actionPerformed(ActionEvent e) {
				String unitUNO = vlrUnitUNO.getText().trim();
				String cantidadUNO = cantUNO.getText().trim();
				String unitDOS = vlrUnitDOS.getText().trim();
				String cantidadDOS = cantDOS.getText().trim();
				String unitTRES = vlrUnitTRES.getText().trim();
				String cantidadTRES = cantTRES.getText().trim();
				
				int num1 = Integer.parseInt(unitUNO);
				int num2 = Integer.parseInt(cantidadUNO);
				int num3 = Integer.parseInt(unitDOS);
				int num4 = Integer.parseInt(cantidadDOS);
				int num5 = Integer.parseInt(unitTRES);
				int num6 = Integer.parseInt(cantidadTRES);

				
				
				vlrTotalUNO.setText((num1 * num2)+ "");
				vlrTotalDOS.setText((num3 * num4)+ "");
				vlrTotalTRES.setText((num5 * num6)+ "");
				
				String valortotaluno = vlrTotalUNO.getText().trim();
				String valortotaldos = vlrTotalDOS.getText().trim();
				String valortotaltres = vlrTotalTRES.getText().trim();
				int num7 = Integer.parseInt(valortotaluno);
				int num8 = Integer.parseInt(valortotaldos);
				int num9 = Integer.parseInt(valortotaltres);
				
				vlrTOTAL.setText((num7 + num8 + num9)+ "");
				
				String cliente = txtCliente.getText().trim();
				String TOTAL = vlrTOTAL.getText().trim();
				
				resultado.setText("Señor(a) "+cliente+" el total de su compra es: "+ TOTAL);
				

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(419, 337, 112, 23);
		contentPane.add(btnNewButton);
		
		vlrUnitUNO = new JTextField();
		vlrUnitUNO.setBounds(189, 142, 112, 20);
		contentPane.add(vlrUnitUNO);
		vlrUnitUNO.setColumns(10);
		
		vlrUnitDOS = new JTextField();
		vlrUnitDOS.setColumns(10);
		vlrUnitDOS.setBounds(189, 173, 112, 20);
		contentPane.add(vlrUnitDOS);
		
		vlrUnitTRES = new JTextField();
		vlrUnitTRES.setColumns(10);
		vlrUnitTRES.setBounds(189, 204, 112, 20);
		contentPane.add(vlrUnitTRES);
		
		cantUNO = new JTextField();
		cantUNO.setColumns(10);
		cantUNO.setBounds(321, 142, 77, 20);
		contentPane.add(cantUNO);
		
		cantDOS = new JTextField();
		cantDOS.setColumns(10);
		cantDOS.setBounds(321, 173, 77, 20);
		contentPane.add(cantDOS);
		
		cantTRES = new JTextField();
		cantTRES.setColumns(10);
		cantTRES.setBounds(321, 204, 77, 20);
		contentPane.add(cantTRES);
		
		vlrTotalUNO = new JTextField();
		vlrTotalUNO.setColumns(10);
		vlrTotalUNO.setBounds(419, 142, 112, 20);
		contentPane.add(vlrTotalUNO);
		
		vlrTotalDOS = new JTextField();
		vlrTotalDOS.setColumns(10);
		vlrTotalDOS.setBounds(419, 173, 112, 20);
		contentPane.add(vlrTotalDOS);
		
		vlrTotalTRES = new JTextField();
		vlrTotalTRES.setColumns(10);
		vlrTotalTRES.setBounds(419, 204, 112, 20);
		contentPane.add(vlrTotalTRES);
		
		vlrTOTAL = new JTextField();
		vlrTOTAL.setColumns(10);
		vlrTOTAL.setBounds(406, 254, 130, 20);
		contentPane.add(vlrTOTAL);
	}
}
