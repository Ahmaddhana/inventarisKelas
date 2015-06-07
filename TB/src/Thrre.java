import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JRadioButton;


public class Thrre extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtDiAtap;
	private JTextField textField_6;
	private JTextField textField_7;
	jmlKondisiPosisiSarana data = new jmlKondisiPosisiSarana();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thrre frame = new Thrre();
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
	public Thrre() {
		setTitle("jmlKondisiPosisiSarana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Prev");
		btnNewButton.setBounds(10, 430, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			new Two().setVisible(true);
			data.setJmlStopkontak(Integer.parseInt(textField.getText()));
			data.setJmlKabelLCD(Integer.parseInt(textField.getText()));
			data.setJmlLampu(Integer.parseInt(textField.getText()));
			data.setPosisiLampu(textField.getText());
			data.setJmlKipas(Integer.parseInt(textField.getText()));
			data.setPosisiKipas(textField.getText());
			data.setJmlAC(Integer.parseInt(textField.getText()));
			data.setSSID(textField.getText());
			data.setJmlCCTV(Integer.parseInt(textField.getText()));
			
			dispose();
			}
		});
		
		JButton btnNewButton_1 = new JButton("Next");
		
		btnNewButton_1.setBounds(420, 430, 89, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			new Four().setVisible(true);
			dispose();
			}
		});
		
		JLabel lblJumlahStopKontaksteker = new JLabel("Jumlah Stop Kontak/Steker");
		lblJumlahStopKontaksteker.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblJumlahStopKontaksteker.setBounds(10, 11, 171, 14);
		contentPane.add(lblJumlahStopKontaksteker);
		
		JLabel lblNewLabel = new JLabel("Kondisi Stop Kontak/Steker");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 36, 171, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Posisi Stop Kontak/Steker");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 61, 171, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Jumlah Kabel LCD");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 86, 171, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Kondisi Kabel LCD");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 111, 171, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Posisi Kabel LCD");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 132, 171, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Jumlah Dan Kondisi Lampu");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 157, 171, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Posisi Lampu");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(10, 182, 171, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Jumlah Dan Kondisi Kipas Angin");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(10, 207, 171, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Posisi Kipas Angin");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(10, 231, 171, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Jumlah Dan Kondisi AC");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(10, 256, 171, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Posisi AC");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(10, 281, 171, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("SSID");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(10, 306, 171, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Bandwidth");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12.setBounds(10, 331, 171, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Jumlah Dan Kondisi CCTV");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13.setBounds(10, 356, 171, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Posisi CCTV");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14.setBounds(10, 381, 171, 14);
		contentPane.add(lblNewLabel_14);
		
		textField = new JTextField();
		textField.setBounds(201, 11, 38, 14);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnBaik = new JRadioButton("Baik");
		rdbtnBaik.setBounds(199, 33, 99, 17);
		contentPane.add(rdbtnBaik);
		
		textField_1 = new JTextField();
		textField_1.setBounds(201, 208, 38, 14);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(201, 157, 38, 14);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(201, 86, 38, 14);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(201, 257, 38, 14);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(201, 356, 38, 14);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("DiPojok Ruang");
		rdbtnNewRadioButton.setBounds(198, 61, 119, 14);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Dekat Dosen");
		rdbtnNewRadioButton_1.setBounds(319, 61, 136, 14);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Tidak Baik");
		rdbtnNewRadioButton_2.setBounds(319, 34, 189, 14);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Berfungsi");
		rdbtnNewRadioButton_3.setBounds(198, 111, 119, 14);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Tidak Berfungsi");
		rdbtnNewRadioButton_4.setBounds(319, 111, 125, 14);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("DiPojok Ruang");
		rdbtnNewRadioButton_5.setBounds(198, 132, 119, 17);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Dekat Dosen");
		rdbtnNewRadioButton_6.setBounds(319, 132, 136, 14);
		contentPane.add(rdbtnNewRadioButton_6);
		
		txtDiAtap = new JTextField();
		txtDiAtap.setBounds(201, 182, 136, 14);
		contentPane.add(txtDiAtap);
		txtDiAtap.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(201, 231, 136, 14);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Di Depan");
		rdbtnNewRadioButton_7.setBounds(196, 281, 121, 14);
		contentPane.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Di Samping");
		rdbtnNewRadioButton_8.setBounds(319, 282, 125, 14);
		contentPane.add(rdbtnNewRadioButton_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(201, 311, 136, 14);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Bisa Login");
		rdbtnNewRadioButton_9.setBounds(197, 331, 120, 14);
		contentPane.add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("Tidak Bisa Login");
		rdbtnNewRadioButton_10.setBounds(319, 331, 125, 14);
		contentPane.add(rdbtnNewRadioButton_10);
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("Depan");
		rdbtnNewRadioButton_11.setBounds(197, 381, 120, 14);
		contentPane.add(rdbtnNewRadioButton_11);
		
		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("Belakang");
		rdbtnNewRadioButton_12.setBounds(319, 381, 125, 14);
		contentPane.add(rdbtnNewRadioButton_12);
	}
}
