import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class formDaftar extends JFrame {

	private JPanel contentPane;
	private JTextField userName;
	private JTextField Password;
	private JButton btnKembali;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formDaftar frame = new formDaftar();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public formDaftar() {
		setResizable(false);
		setTitle("Form Pendaftaran");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 204);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(72, 53, 81, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(72, 78, 81, 14);
		contentPane.add(lblPassword);
		
		userName = new JTextField();
		userName.setBounds(163, 50, 182, 20);
		contentPane.add(userName);
		userName.setColumns(10);
		
		Password = new JTextField();
		Password.setBounds(163, 75, 182, 20);
		contentPane.add(Password);
		Password.setColumns(10);
		
		JButton btnDaftar = new JButton("Daftar");
		btnDaftar.setBounds(163, 109, 89, 23);
		contentPane.add(btnDaftar);
		btnDaftar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(userName.getText().equals("") && Password.getText().equals("")){
						JOptionPane.showMessageDialog(null, "Tidak Boleh Ada Yang Kosong", "Kesalahan",JOptionPane.WARNING_MESSAGE);
						
					}else{
						BufferedWriter writer = new BufferedWriter(new FileWriter("Database.txt", true));
						
						writer.write(userName.getText() + " " + Password.getText());
						writer.newLine();
						writer.close();
						
						new MainFrame_2().setVisible(true);
						dispose();
						JOptionPane.showMessageDialog(null, "Anda Terdaftar", "Info", JOptionPane.INFORMATION_MESSAGE);
					}
				}catch(Exception err){
					JOptionPane.showMessageDialog(null, "Terjadi Kesalahan", "Perhatian", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		btnKembali = new JButton("Kembali");
		btnKembali.setBounds(256, 109, 89, 23);
		contentPane.add(btnKembali);
		btnKembali.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new MainFrame_2().setVisible(true);
			}
		});
	}
}
