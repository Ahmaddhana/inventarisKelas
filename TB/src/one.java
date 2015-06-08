import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import com.sun.glass.events.KeyEvent;


public class one extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JComboBox comboBox;
	private JButton btnLoad;
	private JRadioButton rdbtnGkb;
	private JRadioButton rdbtnGkb_1;
	private JRadioButton rdbtnGkb_2;
	
	private identitasRuangKelas in1;
	private jmlKondisiPosisiSarana in2;
	private kondisiKelas in3;

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
		
		JLabel lblNewLabel = new JLabel("Nama Ruang");
		lblNewLabel.setBounds(10, 11, 69, 23);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(184, 12, 163, 20);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("Lokasi ");
		lblNewLabel_1.setBounds(10, 45, 46, 23);
		contentPane.add(lblNewLabel_1);
		
		rdbtnGkb = new JRadioButton("GKB 1");
		rdbtnGkb.setBounds(89, 45, 53, 23);
		contentPane.add(rdbtnGkb);
		
		rdbtnGkb_1 = new JRadioButton("GKB 2");
		rdbtnGkb_1.setBounds(144, 45, 53, 23);
		contentPane.add(rdbtnGkb_1);
		
		rdbtnGkb_2 = new JRadioButton("GKB 3");
		rdbtnGkb_2.setBounds(199, 45, 53, 23);
		contentPane.add(rdbtnGkb_2);
		
		//grub radio buttons
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnGkb);
		group.add(rdbtnGkb_1);
		group.add(rdbtnGkb_2);
		
		JLabel lblProgramStudi = new JLabel("Program Studi");
		lblProgramStudi.setBounds(10, 79, 69, 23);
		contentPane.add(lblProgramStudi);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ahmad", "dhana", "renomi"}));
		comboBox.setBounds(89, 80, 113, 20);
		contentPane.add(comboBox);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(335, 146, 89, 23);
		contentPane.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				in1 = new identitasRuangKelas();
				in2 = new jmlKondisiPosisiSarana();
				in3 = new kondisiKelas();
				
				in1.setNamaR(textField.getText());
				if(rdbtnGkb.isSelected()){
					in1.setLokasiR(rdbtnGkb.getText());
				}
				if(rdbtnGkb_1.isSelected()){
					in1.setLokasiR(rdbtnGkb_1.getText());
				}
				if(rdbtnGkb_2.isSelected()){
					in1.setLokasiR(rdbtnGkb_2.getText());
				}
				in1.setProgStudi(comboBox.getSelectedItem()+"");
				
				classBaca.write1_1(in1);
				new Two().setVisible(true);
				dispose();
			}
		});
		
		btnLoad = new JButton("Load");
		btnLoad.setBounds(200, 146, 89, 23);
		contentPane.add(btnLoad);
		btnLoad.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				in1 = classBaca.read1_1();
				
				textField.setText(in1.getNamaR());
				if(in1.getLokasiR().equals(rdbtnGkb.getText())==true){
					rdbtnGkb = new JRadioButton("GKB 1",true);
				}
				if(in1.getLokasiR().equals(rdbtnGkb_1.getText())==true){
					rdbtnGkb_1 = new JRadioButton("GKB 2",true);
				}
				if(in1.getLokasiR().equals(rdbtnGkb_2.getText())==true){
					rdbtnGkb_2 = new JRadioButton("GKB 3",true);
				}
				comboBox.setSelectedItem(in1.getProgStudi());
			}
		});
	}
}
