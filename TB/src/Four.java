import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;


public class Four extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
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
		setBounds(100, 100, 450, 227);
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
		lblNewLabel_1.setBounds(41, 36, 110, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblKondisiAtap = new JLabel("Kondisi Atap");
		lblKondisiAtap.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKondisiAtap.setBounds(41, 59, 110, 14);
		contentPane.add(lblKondisiAtap);
		
		JLabel lblNewLabel_2 = new JLabel("Kondisi Pintu");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(41, 84, 110, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Kondisi Jendela");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(41, 109, 110, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnPrev = new JButton("Prev");
		btnPrev.setBounds(10, 154, 89, 23);
		contentPane.add(btnPrev);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(335, 154, 89, 23);
		contentPane.add(btnNext);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Bersih");
		rdbtnNewRadioButton.setBounds(181, 10, 57, 14);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Bersih");
		rdbtnNewRadioButton_1.setBounds(181, 36, 57, 12);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Bersih");
		rdbtnNewRadioButton_2.setBounds(181, 59, 57, 14);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Bersih");
		rdbtnNewRadioButton_3.setBounds(181, 84, 57, 14);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Bersih");
		rdbtnNewRadioButton_4.setBounds(181, 109, 57, 14);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Tidak Bersih");
		rdbtnNewRadioButton_5.setBounds(262, 10, 110, 14);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Tidak Bersih");
		rdbtnNewRadioButton_6.setBounds(262, 35, 103, 14);
		contentPane.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Tidak Bersih");
		rdbtnNewRadioButton_7.setBounds(262, 59, 110, 14);
		contentPane.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Tidak Bersih");
		rdbtnNewRadioButton_8.setBounds(262, 84, 110, 14);
		contentPane.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Tidak Bersih");
		rdbtnNewRadioButton_9.setBounds(262, 109, 110, 14);
		contentPane.add(rdbtnNewRadioButton_9);
	}

}
