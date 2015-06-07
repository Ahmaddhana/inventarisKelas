import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Two extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Two frame = new Two();
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
	public Two() {
		setTitle("Kondisi Ruang Kelas");
		setFont(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(335, 165, 89, 23);
		contentPane.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thrre().setVisible(true);
				dispose();
			}
		});;
		
		
		JButton btnPrev = new JButton("Prev");
		btnPrev.setBounds(10, 165, 89, 23);
		contentPane.add(btnPrev);
		btnPrev.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new one().setVisible(true);
				dispose();
			}
		});
		
		JLabel lblPanjangKelas = new JLabel("Panjang Ruang");
		lblPanjangKelas.setBounds(72, 11, 89, 14);
		lblPanjangKelas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPanjangKelas.setToolTipText("");
		contentPane.add(lblPanjangKelas);
		
		JLabel lblNewLabel = new JLabel("Lebar Ruang");
		lblNewLabel.setBounds(72, 36, 89, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Jumlah Kursi");
		lblNewLabel_1.setBounds(72, 61, 89, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Jumlah Pintu");
		lblNewLabel_2.setBounds(72, 86, 89, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Jumlah Jendela");
		lblNewLabel_3.setBounds(72, 111, 89, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(205, 9, 45, 16);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(205, 34, 45, 16);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(205, 61, 45, 14);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(205, 84, 45, 14);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(205, 109, 45, 14);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
