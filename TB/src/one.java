import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;


public class one extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		
		JLabel lblNewLabel = new JLabel("Nama Ruang");
		lblNewLabel.setBounds(10, 11, 96, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lokasi ");
		lblNewLabel_1.setBounds(10, 45, 46, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblProgramStudi = new JLabel("Program Studi");
		lblProgramStudi.setBounds(10, 79, 96, 23);
		contentPane.add(lblProgramStudi);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"INFORMATIKA", "SIPIL", "INDUSTRI", "ELEKTRI", "MESIN"}));
		comboBox.setBounds(184, 80, 163, 20);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(184, 12, 163, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"GKB 1", "GKB 2", "GKB 3"}));
		comboBox_1.setBounds(184, 46, 163, 20);
		contentPane.add(comboBox_1);
	}
}
