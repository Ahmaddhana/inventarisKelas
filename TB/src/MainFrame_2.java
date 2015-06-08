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
		
		JButton btnLogin = new JButton("LogIn");
		btnLogin.setBounds(173, 95, 89, 23);
		getContentPane().add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				try{
					if(textField.getText().equals("Admin") && textField_1.getText().equals("admin")){
						new TB().setVisible(true);
						dispose();
						JOptionPane.showMessageDialog(null, "Login Success", "Information",JOptionPane.INFORMATION_MESSAGE);
					}
					else{
						JOptionPane.showMessageDialog(null, "Password Salah", "Wrong",JOptionPane.WARNING_MESSAGE);
					}
				}
				catch(Exception err){
					JOptionPane.showMessageDialog(null, "Terjadi Kesalahan", "Kesalahan",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		
	}
}
