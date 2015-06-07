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


public class NomNom extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NomNom frame = new NomNom();
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
	public NomNom() {
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
		lblNewLabel.setBounds(10, 11, 69, 23);
		contentPane.add(lblNewLabel);
		
		JTextPane txtpnNamaRuang = new JTextPane();
		txtpnNamaRuang.setBounds(89, 11, 113, 23);
		contentPane.add(txtpnNamaRuang);
		
		JLabel lblNewLabel_1 = new JLabel("Lokasi ");
		lblNewLabel_1.setBounds(10, 45, 46, 23);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnGkb = new JRadioButton("GKB 1");
		rdbtnGkb.setBounds(89, 45, 53, 23);
		contentPane.add(rdbtnGkb);
		
		JRadioButton rdbtnGkb_1 = new JRadioButton("GKB 2");
		rdbtnGkb_1.setBounds(144, 45, 53, 23);
		contentPane.add(rdbtnGkb_1);
		
		JRadioButton rdbtnGkb_2 = new JRadioButton("GKB 3");
		rdbtnGkb_2.setBounds(199, 45, 53, 23);
		contentPane.add(rdbtnGkb_2);
		
		JLabel lblProgramStudi = new JLabel("Program Studi");
		lblProgramStudi.setBounds(10, 79, 69, 23);
		contentPane.add(lblProgramStudi);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ahmad", "dhana", "renomi"}));
		comboBox.setBounds(89, 80, 113, 20);
		contentPane.add(comboBox);
	}
}
