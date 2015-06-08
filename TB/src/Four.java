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
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class Four extends JFrame {

	private JPanel contentPane;
	control2 data1 = new control2();
	/**
	 * Launch the application..
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Four frame = new Four();
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
	public Four() {
		setTitle("Lingkungan Ruang Kelas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 284);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kondisi Lantai");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(41, 11, 110, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Kondisi Dinding");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(41, 46, 110, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblKondisiAtap = new JLabel("Kondisi Atap");
		lblKondisiAtap.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKondisiAtap.setBounds(41, 79, 110, 14);
		contentPane.add(lblKondisiAtap);
		
		JLabel lblNewLabel_2 = new JLabel("Kondisi Pintu");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(41, 113, 110, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Kondisi Jendela");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(41, 146, 110, 14);
		contentPane.add(lblNewLabel_3);
		
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(335, 211, 89, 23);
		contentPane.add(btnNext);
		btnNext.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Five().setVisible(true);
				dispose();
			}
		});
		
		
		JButton btnPrev = new JButton("Prev");
		btnPrev.setBounds(10, 211, 89, 23);
		contentPane.add(btnPrev);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BERSIH", "TIDAK BERSIH"}));
		comboBox.setBounds(211, 9, 144, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"BERSIH", "TIDAK BERSIH"}));
		comboBox_1.setBounds(211, 43, 144, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"BERSIH", "TIDAK BERSIH"}));
		comboBox_2.setBounds(211, 77, 144, 20);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"BERSIH", "TIDAK BERSIH"}));
		comboBox_3.setBounds(211, 113, 144, 20);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"BERSIH", "TIDAK BERSIH"}));
		comboBox_4.setBounds(211, 144, 144, 20);
		contentPane.add(comboBox_4);
		btnPrev.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			new Thrre().setVisible(true);
			dispose();
				
			}
		});
	}

}
