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
import javax.swing.JSplitPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class Thrre extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	jmlKondisiPosisiSarana data = new jmlKondisiPosisiSarana();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
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
		setBounds(100, 100, 700, 503);
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
		lblNewLabel.setBounds(10, 61, 171, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Posisi Stop Kontak/Steker");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 111, 171, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Jumlah Kabel LCD");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 173, 171, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Kondisi Kabel LCD");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 224, 171, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Posisi Kabel LCD");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 272, 171, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Jumlah Dan Kondisi Lampu");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 325, 171, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Posisi Lampu");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(10, 378, 171, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Jumlah Dan Kondisi Kipas Angin");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(341, 11, 171, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Posisi Kipas Angin");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(338, 61, 171, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Jumlah Dan Kondisi AC");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(338, 111, 171, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Posisi AC");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(338, 173, 171, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("SSID");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(341, 224, 171, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Bandwidth");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12.setBounds(341, 272, 171, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Jumlah Dan Kondisi CCTV");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13.setBounds(338, 325, 171, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Posisi CCTV");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14.setBounds(338, 378, 171, 14);
		contentPane.add(lblNewLabel_14);
		
		textField = new JTextField();
		textField.setBounds(187, 375, 127, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BAIK", "TIDAK BAIK"}));
		comboBox.setBounds(187, 59, 127, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"DI POJOK RUANG", "DEKAT DOSEN"}));
		comboBox_1.setBounds(187, 109, 127, 20);
		contentPane.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(187, 11, 127, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"BAIK", "TIDAK BAIK"}));
		comboBox_2.setBounds(187, 222, 127, 20);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"DI POJOK RUANG", "DEKAT DOSEN"}));
		comboBox_3.setBounds(187, 270, 127, 20);
		contentPane.add(comboBox_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(540, 221, 134, 23);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(187, 322, 127, 23);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"BAIK", "TIDAK BAIK"}));
		comboBox_4.setBounds(540, 9, 134, 20);
		contentPane.add(comboBox_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(180, 173, 134, -11);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"BAIK", "TIDAK BAIK"}));
		comboBox_5.setBounds(540, 109, 134, 20);
		contentPane.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"BAIK", "TIDAK BAIK"}));
		comboBox_6.setBounds(540, 323, 134, 20);
		contentPane.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"DEPAN", "BELAKANG"}));
		comboBox_7.setBounds(540, 376, 134, 20);
		contentPane.add(comboBox_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(187, 170, 127, 23);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(540, 58, 134, 23);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(540, 270, 134, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(540, 172, 134, 23);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
	}
}
