import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Six extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Six frame = new Six();
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
	public Six() {
		setTitle("Kenyamanan Ruang Kelas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kebisingan");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(68, 11, 122, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bau\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(68, 45, 122, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Kebocoran");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(68, 82, 122, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Kerusakan");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(68, 119, 122, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Keausan");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(68, 157, 122, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnPrev = new JButton("Prev");
		btnPrev.setBounds(10, 206, 89, 23);
		contentPane.add(btnPrev);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(335, 206, 89, 23);
		contentPane.add(btnNext);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Bising");
		rdbtnNewRadioButton.setBounds(166, 11, 59, 15);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Tidak Bising");
		rdbtnNewRadioButton_1.setBounds(266, 11, 89, 15);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Bau");
		rdbtnNewRadioButton_2.setBounds(166, 45, 48, 14);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Tidak Bising");
		rdbtnNewRadioButton_3.setBounds(266, 45, 89, 14);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Bocor");
		rdbtnNewRadioButton_4.setBounds(166, 82, 59, 15);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Tidak Bocor");
		rdbtnNewRadioButton_5.setBounds(266, 82, 81, 14);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Rusak");
		rdbtnNewRadioButton_6.setBounds(166, 121, 69, 12);
		contentPane.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Tidak Rusak");
		rdbtnNewRadioButton_7.setBounds(266, 119, 89, 14);
		contentPane.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Aus");
		rdbtnNewRadioButton_8.setBounds(166, 157, 48, 14);
		contentPane.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Tidak Aus");
		rdbtnNewRadioButton_9.setBounds(266, 157, 71, 14);
		contentPane.add(rdbtnNewRadioButton_9);
	}

}
