import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class one extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	identitasRuangKelas data = new identitasRuangKelas(); 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					one frame = new one();
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
	public one() {
		setTitle("Identitas Ruang Kelas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 219);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(335, 146, 89, 23);
		contentPane.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				data.setNamaR(textField.getText());
				new Two().setVisible(true);
				dispose();
			}
		});
		
		JLabel lblNewLabel = new JLabel("Nama Ruang");
		lblNewLabel.setBounds(10, 11, 96, 23);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(184, 12, 163, 20);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("Lokasi ");
		lblNewLabel_1.setBounds(10, 45, 46, 23);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnGkb = new JRadioButton("GKB 1");
		rdbtnGkb.setBounds(145, 45, 85, 23);
		contentPane.add(rdbtnGkb);
		
		JRadioButton rdbtnGkb_1 = new JRadioButton("GKB 2");
		rdbtnGkb_1.setBounds(232, 45, 74, 23);
		contentPane.add(rdbtnGkb_1);
		
		JRadioButton rdbtnGkb_2 = new JRadioButton("GKB 3");
		rdbtnGkb_2.setBounds(308, 45, 69, 23);
		contentPane.add(rdbtnGkb_2);
		
		JLabel lblProgramStudi = new JLabel("Program Studi");
		lblProgramStudi.setBounds(10, 79, 96, 23);
		contentPane.add(lblProgramStudi);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Informatika", "Sipil", "Industri", "Elektro", "Mesin"}));
		comboBox.setBounds(216, 80, 113, 20);
		contentPane.add(comboBox);
	}
}
