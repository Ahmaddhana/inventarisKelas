import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.io.*;


public class MainFrame_2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame_2 frame = new MainFrame_2();
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
	
	public MainFrame_2() {
		setTitle("Form Login");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 221);
		
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(119, 39, 143, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(21, 42, 88, 14);
		getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(21, 67, 88, 14);
		getContentPane().add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 64, 143, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnDaftar = new JButton("Daftar");
		btnDaftar.setBounds(74, 95, 89, 23);
		getContentPane().add(btnDaftar);
		btnDaftar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				new formDaftar().setVisible(true);
				dispose();
			}
		});
		
		JButton btnLogin = new JButton("LogIn");
		btnLogin.setBounds(173, 95, 89, 23);
		getContentPane().add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				try{
					File dat = new File("Database.txt");
					FileReader read = new FileReader(dat);
					BufferedReader reader = new BufferedReader(read);
					
					String readFile = null;
					while((readFile = reader.readLine()) != null){
						if(readFile.contains(textField.getText()) && readFile.contains(textField_1.getText())){
							JOptionPane.showMessageDialog(null, "Login Success", "Information",JOptionPane.INFORMATION_MESSAGE);
							break;
						}
						else{
							JOptionPane.showMessageDialog(null, "Anda Belum Terdaftar", "Wrong",JOptionPane.WARNING_MESSAGE);
							break;
						}
					}
					
					reader.close();
				}catch(java.io.FileNotFoundException err){
					JOptionPane.showMessageDialog(null, "Database Tidak Di Temukan, \nHarap Mendaftar Terlebih Dahulu", "Kesalahan",JOptionPane.WARNING_MESSAGE);
				}catch(IOException err){
					JOptionPane.showMessageDialog(null, "Terjadi Kesalahan", "Kesalahan",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		
	}
}