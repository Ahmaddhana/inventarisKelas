import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;


public class Five extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	KebersihanRK data = new KebersihanRK();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Five frame = new Five();
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
	public Five() {
		setTitle("Kebersihan Ruang Kelas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sirkulasi Udara");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(81, 11, 122, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nilai Pencahayaan");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(81, 46, 122, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Kelembapan (%)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(81, 81, 122, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Suhu (Celcius)");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(81, 118, 122, 14);
		contentPane.add(lblNewLabel_3);
		
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(335, 182, 89, 23);
		contentPane.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new Six().setVisible(true);
				data.setSirkulUdara(textField.getText());
				data.setNilaiCahaya(Integer.parseInt(textField.getText()));
				data.setKelembapan(Integer.parseInt(textField.getText()));
				data.setSuhu(Integer.parseInt(textField.getText()));
				dispose();
				
			}
		});
		
		JButton btnPrev = new JButton("Prev");
		btnPrev.setBounds(10, 182, 89, 23);
		contentPane.add(btnPrev);
		btnPrev.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new Four().setVisible(true);
				dispose();
				
			}
		});
		
		
		textField = new JTextField();
		textField.setBounds(241, 11, 61, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(241, 46, 61, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(241, 82, 61, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(241, 118, 61, 23);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}

}
