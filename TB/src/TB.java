import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TB extends JFrame {

	control1 data1 = new control1();
	control2 data2 = new control2();
	control3 data3 = new control3();
	
	private JPanel contentPane;
	private JTextField txtContoh;
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_9;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;
	private JComboBox comboBox_6;
	private JComboBox comboBox_7;
	private JComboBox comboBox_8;
	private JComboBox comboBox_9;
	private JComboBox comboBox_10;
	private JComboBox comboBox_11;
	private JComboBox comboBox_12;
	private JComboBox comboBox_13;
	private JComboBox comboBox_14;
	private JComboBox comboBox_15;
	private JComboBox comboBox_16;
	private JComboBox comboBox_17;
	private JComboBox comboBox_18;
	private JComboBox comboBox_19;
	private JComboBox comboBox_20;
	private JComboBox comboBox_21;
	private JComboBox comboBox_22;
	private JComboBox comboBox_23;
	private JComboBox comboBox_24;
	private JComboBox comboBox_25;
	private JComboBox comboBox_26;
	
	private identitasRuangKelas in1;
	private kondisiKelas in2;
	private jmlKondisiPosisiSarana in3;
	private LingkunganRK in4;
	private KebersihanRK in5;
	private KenyamananRuangKelas in6;
	private KeamananRuangKelas in7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TB frame = new TB();
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
	public TB() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MainFrame_2().setVisible(true);
				dispose();
			}
		});
		btnLogout.setBounds(739, 11, 79, 23);
		contentPane.add(btnLogout);
		
		JButton btnBukaDatabase = new JButton("Buka Database");
		btnBukaDatabase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					in1 = classBaca.read1_1();
					in2 = classBaca.read1_2();
					in3 = classBaca.read1_3();
					in4 = classBaca.read2_1();
					in5 = classBaca.read2_2();
					in6 = classBaca.read3_1();
					in7 = classBaca.read3_2();
					
					//Read 1_1
					txtContoh.setText(in1.getNamaR());
				//	comboBox.setSelectedItem(in1.getLokasiR());
					textField_2.setText(in1.getProgStudi());
					
					//Read 1_2
					textField.setText(String.valueOf(in2.getPanjangruang()));
					textField_1.setText(String.valueOf(in2.getLebarruang()));
					textField_3.setText(String.valueOf(in2.getJumlahkursi()));
					
					//Read 1_3
					textField_6.setText(String.valueOf(in3.getJmlStopkontak()));
					textField_7.setText(String.valueOf(in3.getJmlKabelLCD()));
					textField_9.setText(String.valueOf(in3.getJmlLampu()));
					comboBox_6.setSelectedItem(in3.getPosisiLampu());
					textField_8.setText(String.valueOf(in3.getJmlKipas()));
					comboBox_8.setSelectedItem(in3.getPosisiKipas());
					textField_12.setText(String.valueOf(in3.getJmlAC()));
					textField_10.setText(in3.getSSID());
					comboBox_11.setSelectedItem(in3.getBandwidth());
					textField_11.setText(String.valueOf(in3.getJmlCCTV()));
					
					comboBox_1.setSelectedItem(in3.getKondisiStopKontak());
					comboBox_2.setSelectedItem(in3.getPosisiStopKontak());
					comboBox_4.setSelectedItem(in3.getKondisiKabelLCD());
					comboBox_3.setSelectedItem(in3.getPosisiKabelLCD());
					comboBox_7.setSelectedItem(in3.getKondisiKipas());
					comboBox_9.setSelectedItem(in3.getKondisiAC());
					comboBox_12.setSelectedItem(in3.getKondisiCCTV());
					comboBox_10.setSelectedItem(in3.getPosisiAC());
					comboBox_5.setSelectedItem(in3.getKondisiLampu());
					
					//read 2_1
					comboBox_14.setSelectedItem(in4.getKondLantai());
					comboBox_15.setSelectedItem(in4.getKonDinding());
					comboBox_16.setSelectedItem(in4.getKonAtap());
					comboBox_17.setSelectedItem(in4.getKonPintu());
					comboBox_18.setSelectedItem(in4.getKonJendela());
					
					textField_13.setText(in5.getSirkulUdara());
					textField_14.setText(String.valueOf(in5.getNilaiCahaya()));
					textField_15.setText(String.valueOf(in5.getKelembapan()));
					textField_16.setText(String.valueOf(in5.getSuhu()));
					
					comboBox_19.setSelectedItem(in6.getKebisingan());
					comboBox_20.setSelectedItem(in6.getBau());
					comboBox_21.setSelectedItem(in6.getKebocoran());
					comboBox_22.setSelectedItem(in6.getKerusakan());
					comboBox_23.setSelectedItem(in6.getKeausan());
					
					comboBox_24.setSelectedItem(in7.getKekokohan());
					comboBox_25.setSelectedItem(in7.getKuncipintudanjendela());
					comboBox_26.setSelectedItem(in7.getBahaya());
				}catch(java.lang.NullPointerException ex){
					JOptionPane.showMessageDialog(null, "Error at : " + ex);
				}
				
			}
		});
		btnBukaDatabase.setBounds(589, 11, 140, 23);
		contentPane.add(btnBukaDatabase);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 22, 808, 468);
		contentPane.add(tabbedPane);
		
		//Step Satu
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("----------Step 1----------", null, panel_1, null);
		panel_1.setLayout(null);
		
		txtContoh = new JTextField();
		txtContoh.setToolTipText("EX :Ruang  401");
		txtContoh.setBounds(203, 19, 108, 27);
		panel_1.add(txtContoh);
		txtContoh.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"GKB 1", "GKB 2", "GKb 3"}));
		comboBox.setBounds(203, 57, 108, 27);
		panel_1.add(comboBox);
		
		JLabel lblPanjangRuang = new JLabel("Panjang Ruang");
		lblPanjangRuang.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPanjangRuang.setHorizontalAlignment(SwingConstants.CENTER);
		lblPanjangRuang.setBounds(10, 138, 105, 14);
		panel_1.add(lblPanjangRuang);
		
		JLabel lblLokasi = new JLabel("Lokasi");
		lblLokasi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLokasi.setBounds(25, 63, 105, 14);
		panel_1.add(lblLokasi);
		
		JLabel lblProgramStudi = new JLabel("Program Studi");
		lblProgramStudi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblProgramStudi.setBounds(25, 101, 105, 14);
		panel_1.add(lblProgramStudi);
		
		textField_2 = new JTextField();
		textField_2.setBounds(202, 95, 109, 27);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label = new JLabel("Nama Ruang");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(25, 25, 105, 14);
		panel_1.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(202, 133, 109, 27);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(549, 167, 109, 27);
		panel_1.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(550, 205, 109, 27);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(550, 244, 109, 27);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(550, 280, 109, 27);
		panel_1.add(textField_5);
		
		JLabel lblLuasRuang = new JLabel("Panjang Ruang");
		lblLuasRuang.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLuasRuang.setBounds(372, 173, 82, 14);
		panel_1.add(lblLuasRuang);
		
		JLabel lblJumlahKursi = new JLabel("Jumlah Kursi");
		lblJumlahKursi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblJumlahKursi.setBounds(372, 211, 66, 14);
		panel_1.add(lblJumlahKursi);
		
		JLabel lblNamaRujumlahKursi = new JLabel("Jumlah Pintu");
		lblNamaRujumlahKursi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNamaRujumlahKursi.setBounds(372, 250, 82, 14);
		panel_1.add(lblNamaRujumlahKursi);
		
		JLabel lblJumlahJendela = new JLabel("Jumlah Jendela");
		lblJumlahJendela.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblJumlahJendela.setBounds(372, 286, 82, 14);
		panel_1.add(lblJumlahJendela);
		
		JButton btnNewButton = new JButton(">");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);;
			}
		});
		btnNewButton.setBounds(10, 402, 127, 27);
		panel_1.add(btnNewButton);
		
		
		//Step Dua
		panel = new JPanel();
		tabbedPane.addTab("----------Step 2----------", null, panel, null);
		panel.setLayout(null);
		
		textField_6 = new JTextField();
		textField_6.setBounds(178, 24, 121, 29);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(178, 151, 121, 29);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(178, 276, 121, 29);
		panel.add(textField_9);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Baik", "Tidak Baik"}));
		comboBox_1.setBounds(178, 64, 121, 29);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Di Pojok Ruang", "Dekat Dosen"}));
		comboBox_2.setBounds(178, 104, 121, 29);
		panel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Di Pojok Ruang", "Dekat Dosen"}));
		comboBox_3.setBounds(178, 227, 121, 29);
		panel.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Baik", "Tidak Baik"}));
		comboBox_4.setBounds(178, 187, 121, 29);
		panel.add(comboBox_4);
		
		JLabel lblJumlahStopKontaksteker = new JLabel("Jumlah Stop kontak/Steker");
		lblJumlahStopKontaksteker.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblJumlahStopKontaksteker.setBounds(10, 29, 158, 14);
		panel.add(lblJumlahStopKontaksteker);
		
		JLabel lblKondisiStopKontaksteker = new JLabel("Kondisi Stop kontak/Steker");
		lblKondisiStopKontaksteker.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKondisiStopKontaksteker.setBounds(10, 69, 149, 14);
		panel.add(lblKondisiStopKontaksteker);
		
		JLabel lblPosisiStopKontaksteker = new JLabel("Posisi   Stop kontak/Steker");
		lblPosisiStopKontaksteker.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPosisiStopKontaksteker.setBounds(10, 109, 158, 14);
		panel.add(lblPosisiStopKontaksteker);
		
		JLabel lblJumlahKabelLcd_1 = new JLabel("Jumlah Kabel LCD");
		lblJumlahKabelLcd_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblJumlahKabelLcd_1.setBounds(10, 156, 141, 14);
		panel.add(lblJumlahKabelLcd_1);
		
		JLabel lblJumlahKabelLcd = new JLabel("Kondisi Kabel LCD");
		lblJumlahKabelLcd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblJumlahKabelLcd.setBounds(10, 192, 141, 14);
		panel.add(lblJumlahKabelLcd);
		
		JLabel lblPosisiKabelLcd = new JLabel("Posisi   Kabel LCD");
		lblPosisiKabelLcd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPosisiKabelLcd.setBounds(10, 232, 141, 14);
		panel.add(lblPosisiKabelLcd);
		
		JLabel lblPosisiKabelLcd_1 = new JLabel("Jumlah Lampu");
		lblPosisiKabelLcd_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPosisiKabelLcd_1.setBounds(10, 281, 141, 14);
		panel.add(lblPosisiKabelLcd_1);
		
		JLabel lblPosisiLampu = new JLabel("Kondisi Lampu");
		lblPosisiLampu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPosisiLampu.setBounds(10, 321, 141, 14);
		panel.add(lblPosisiLampu);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Baik", "Tidak Baik"}));
		comboBox_5.setBounds(178, 316, 121, 29);
		panel.add(comboBox_5);
		
		JLabel lblPosisiLampu_1 = new JLabel("Posisi   Lampu");
		lblPosisiLampu_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPosisiLampu_1.setBounds(10, 362, 141, 14);
		panel.add(lblPosisiLampu_1);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Di Atap Ruangan", "Tidak Ada"}));
		comboBox_6.setBounds(178, 357, 121, 29);
		panel.add(comboBox_6);
		
		JLabel lblJumlahKipasAngin = new JLabel("Jumlah Kipas Angin");
		lblJumlahKipasAngin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblJumlahKipasAngin.setBounds(319, 27, 141, 14);
		panel.add(lblJumlahKipasAngin);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(448, 24, 128, 29);
		panel.add(textField_8);
		
		JLabel lblKondisiKipasAngin = new JLabel("Kondisi Kipas Angin");
		lblKondisiKipasAngin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKondisiKipasAngin.setBounds(319, 69, 141, 14);
		panel.add(lblKondisiKipasAngin);
		
		JLabel lblPosisiKipasAngin = new JLabel("Posisi Kipas Angin");
		lblPosisiKipasAngin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPosisiKipasAngin.setBounds(319, 109, 141, 14);
		panel.add(lblPosisiKipasAngin);
		
		JLabel lblJumlahAc = new JLabel("Jumlah AC");
		lblJumlahAc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblJumlahAc.setBounds(319, 156, 141, 14);
		panel.add(lblJumlahAc);
		
		JLabel lblKondisiAc = new JLabel("Kondisi AC");
		lblKondisiAc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKondisiAc.setBounds(319, 192, 141, 14);
		panel.add(lblKondisiAc);
		
		JLabel lblPosisiAc = new JLabel("Posisi   AC");
		lblPosisiAc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPosisiAc.setBounds(319, 232, 141, 14);
		panel.add(lblPosisiAc);
		
		JLabel lblSsid = new JLabel("SSID");
		lblSsid.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSsid.setBounds(319, 282, 141, 14);
		panel.add(lblSsid);
		
		JLabel lblBandwith = new JLabel("Bandwith");
		lblBandwith.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBandwith.setBounds(319, 323, 141, 14);
		panel.add(lblBandwith);
		
		JLabel lblJumlahCctv = new JLabel("Jumlah CCTV");
		lblJumlahCctv.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblJumlahCctv.setBounds(319, 362, 141, 14);
		panel.add(lblJumlahCctv);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Baik", "Tidak Baik"}));
		comboBox_7.setBounds(448, 64, 128, 29);
		panel.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"Di Atap Ruangan", "Di Samping"}));
		comboBox_8.setBounds(448, 104, 128, 29);
		panel.add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"Baik", "Tidak Baik"}));
		comboBox_9.setBounds(448, 187, 128, 29);
		panel.add(comboBox_9);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"Di Atap Ruangan", "Di Samping"}));
		comboBox_10.setBounds(448, 227, 128, 29);
		panel.add(comboBox_10);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"Ada", "Tidak Ada"}));
		comboBox_11.setBounds(448, 318, 128, 29);
		panel.add(comboBox_11);
		
		JLabel lblKondisiCctv = new JLabel("Kondisi CCTV");
		lblKondisiCctv.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKondisiCctv.setBounds(595, 64, 95, 14);
		panel.add(lblKondisiCctv);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(448, 280, 128, 29);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(448, 359, 128, 29);
		panel.add(textField_11);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"Baik", "Tidak Baik"}));
		comboBox_12.setBounds(683, 58, 110, 29);
		panel.add(comboBox_12);
		
		JLabel lblPosisiCctv = new JLabel("Posisi CCTV");
		lblPosisiCctv.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPosisiCctv.setBounds(606, 228, 95, 14);
		panel.add(lblPosisiCctv);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"Depan", "Belakang"}));
		comboBox_13.setBounds(683, 217, 110, 29);
		panel.add(comboBox_13);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(448, 151, 128, 29);
		panel.add(textField_12);
		
		JButton button = new JButton("<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		button.setBounds(10, 402, 127, 27);
		panel.add(button);
		
		JButton button_1 = new JButton(">");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		button_1.setBounds(147, 402, 127, 27);
		panel.add(button_1);
		
		
		//Step Tiga
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("----------Step 3----------", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblKondisiLantai = new JLabel("Kondisi   Lantai");
		lblKondisiLantai.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKondisiLantai.setBounds(10, 16, 141, 14);
		panel_2.add(lblKondisiLantai);
		
		JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"Bersih", "Tidak Bersih"}));
		comboBox_14.setBounds(149, 11, 110, 29);
		panel_2.add(comboBox_14);
		
		JComboBox comboBox_15 = new JComboBox();
		comboBox_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"Bersih", "Tidak Bersih"}));
		comboBox_15.setBounds(149, 48, 110, 29);
		panel_2.add(comboBox_15);
		
		JLabel lblKondisiDinding = new JLabel("Kondisi Dinding");
		lblKondisiDinding.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKondisiDinding.setBounds(10, 53, 141, 14);
		panel_2.add(lblKondisiDinding);
		
		JComboBox comboBox_16 = new JComboBox();
		comboBox_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"Bersih", "Tidak Bersih"}));
		comboBox_16.setBounds(149, 85, 110, 29);
		panel_2.add(comboBox_16);
		
		JLabel lblKondisiPintu = new JLabel("Kondisi     Atap");
		lblKondisiPintu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKondisiPintu.setBounds(10, 90, 141, 14);
		panel_2.add(lblKondisiPintu);
		
		JComboBox comboBox_17 = new JComboBox();
		comboBox_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"Bersih", "Tidak Bersih"}));
		comboBox_17.setBounds(149, 123, 110, 29);
		panel_2.add(comboBox_17);
		
		JLabel lblKondisiPintu_1 = new JLabel("Kondisi     Pintu");
		lblKondisiPintu_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKondisiPintu_1.setBounds(10, 128, 141, 14);
		panel_2.add(lblKondisiPintu_1);
		
		JComboBox comboBox_18 = new JComboBox();
		comboBox_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_18.setModel(new DefaultComboBoxModel(new String[] {"Bersih", "Tidak Bersih"}));
		comboBox_18.setBounds(149, 161, 110, 29);
		panel_2.add(comboBox_18);
		
		JLabel lblKondisiJendela = new JLabel("Kondisi Jendela");
		lblKondisiJendela.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKondisiJendela.setBounds(10, 166, 141, 14);
		panel_2.add(lblKondisiJendela);
		
		JLabel lblSirkulasiUdara = new JLabel("Sirkulasi Udara");
		lblSirkulasiUdara.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSirkulasiUdara.setBounds(10, 219, 141, 14);
		panel_2.add(lblSirkulasiUdara);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(149, 214, 110, 29);
		panel_2.add(textField_13);
		
		JLabel lblNilaiPencahayaan = new JLabel("Nilai Pencahayaan");
		lblNilaiPencahayaan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNilaiPencahayaan.setBounds(10, 257, 141, 14);
		panel_2.add(lblNilaiPencahayaan);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(149, 250, 110, 29);
		panel_2.add(textField_14);
		
		JLabel lblKelembapan = new JLabel("Kelembapan (%)");
		lblKelembapan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKelembapan.setBounds(10, 293, 141, 14);
		panel_2.add(lblKelembapan);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(149, 286, 110, 29);
		panel_2.add(textField_15);
		
		JLabel lblSuhucelcius = new JLabel("Suhu            (Celcius)");
		lblSuhucelcius.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSuhucelcius.setBounds(10, 331, 141, 14);
		panel_2.add(lblSuhucelcius);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(149, 324, 110, 29);
		panel_2.add(textField_16);
		
		JLabel lblKebisingan = new JLabel("Kebisingan");
		lblKebisingan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKebisingan.setBounds(334, 16, 141, 14);
		panel_2.add(lblKebisingan);
		
		JComboBox comboBox_19 = new JComboBox();
		comboBox_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_19.setModel(new DefaultComboBoxModel(new String[] {"Bising", "Tidak Bising"}));
		comboBox_19.setBounds(473, 11, 110, 29);
		panel_2.add(comboBox_19);
		
		JLabel lblBau = new JLabel("Bau");
		lblBau.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBau.setBounds(334, 53, 141, 14);
		panel_2.add(lblBau);
		
		JComboBox comboBox_20 = new JComboBox();
		comboBox_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_20.setModel(new DefaultComboBoxModel(new String[] {"Bau", "Tidak Bau"}));
		comboBox_20.setBounds(473, 48, 110, 29);
		panel_2.add(comboBox_20);
		
		JLabel lblKebocoran = new JLabel("Kebocoran");
		lblKebocoran.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKebocoran.setBounds(334, 90, 141, 14);
		panel_2.add(lblKebocoran);
		
		JComboBox comboBox_21 = new JComboBox();
		comboBox_21.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_21.setModel(new DefaultComboBoxModel(new String[] {"Bocor", "Tidak Bocor"}));
		comboBox_21.setBounds(473, 85, 110, 29);
		panel_2.add(comboBox_21);
		
		JLabel lblKerusakan = new JLabel("Kerusakan");
		lblKerusakan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKerusakan.setBounds(334, 128, 141, 14);
		panel_2.add(lblKerusakan);
		
		JComboBox comboBox_22 = new JComboBox();
		comboBox_22.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_22.setModel(new DefaultComboBoxModel(new String[] {"Rusak", "Tidak Rusak"}));
		comboBox_22.setBounds(473, 123, 110, 29);
		panel_2.add(comboBox_22);
		
		JLabel lblKeausan = new JLabel("Keausan");
		lblKeausan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKeausan.setBounds(334, 166, 141, 14);
		panel_2.add(lblKeausan);
		
		JComboBox comboBox_23 = new JComboBox();
		comboBox_23.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_23.setModel(new DefaultComboBoxModel(new String[] {"Aus", "Tidak Aus"}));
		comboBox_23.setBounds(473, 161, 110, 29);
		panel_2.add(comboBox_23);
		
		JLabel lblKekokohan = new JLabel("Kekokohan");
		lblKekokohan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKekokohan.setBounds(334, 219, 141, 14);
		panel_2.add(lblKekokohan);
		
		JComboBox comboBox_24 = new JComboBox();
		comboBox_24.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_24.setModel(new DefaultComboBoxModel(new String[] {"Ya", "Tidak"}));
		comboBox_24.setBounds(473, 214, 110, 29);
		panel_2.add(comboBox_24);
		
		JLabel lblKunciPintuDan = new JLabel("Kunci Pintu dan Jendela");
		lblKunciPintuDan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKunciPintuDan.setBounds(334, 255, 141, 14);
		panel_2.add(lblKunciPintuDan);
		
		JComboBox comboBox_25 = new JComboBox();
		comboBox_25.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_25.setModel(new DefaultComboBoxModel(new String[] {"Ya", "Tidak"}));
		comboBox_25.setBounds(473, 250, 110, 29);
		panel_2.add(comboBox_25);
		
		JLabel lblBahaya = new JLabel("Bahaya");
		lblBahaya.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBahaya.setBounds(334, 291, 141, 14);
		panel_2.add(lblBahaya);
		
		JComboBox comboBox_26 = new JComboBox();
		comboBox_26.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_26.setModel(new DefaultComboBoxModel(new String[] {"Ya", "Tidak"}));
		comboBox_26.setBounds(473, 286, 110, 29);
		panel_2.add(comboBox_26);
		
		JButton btnFinsishAnalyze = new JButton("Save & Analyze");
		btnFinsishAnalyze.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					in1 = new identitasRuangKelas();
					in2 = new kondisiKelas();
					in3 = new jmlKondisiPosisiSarana();
					in4 = new LingkunganRK();
					in5 = new KebersihanRK();
					in6 = new KenyamananRuangKelas();
					in7 = new KeamananRuangKelas();
					
					in1.setNamaR(txtContoh.getText());
					in1.setLokasiR(comboBox.getSelectedItem()+"");
					in1.setProgStudi(textField_2.getText());
					
					in2.setPanjangruang(Integer.parseInt(textField.getText()));
					in2.setLebarruang(Integer.parseInt(textField_1.getText()));
					in2.setJumlahkursi(Integer.parseInt(textField_3.getText()));
					in2.setJumlahpintu(Integer.parseInt(textField_4.getText()));
					in2.setJumlahjendela(Integer.parseInt(textField_5.getText()));
					
					in3.setJmlStopkontak(Integer.parseInt(textField_6.getText()));
					in3.setJmlKabelLCD(Integer.parseInt(textField_7.getText()));
					in3.setJmlLampu(Integer.parseInt(textField_9.getText()));
					in3.setPosisiLampu(comboBox_6.getSelectedItem()+"");
					in3.setJmlKipas(Integer.parseInt(textField_8.getText()));
					in3.setPosisiKipas(comboBox_8.getSelectedItem()+"");
					in3.setJmlAC(Integer.parseInt(textField_12.getText()));
					in3.setSSID(textField_10.getText());
					in3.setBandwidth(comboBox_11.getSelectedItem()+"");
					in3.setJmlCCTV(Integer.parseInt(textField_11.getText()));
					//Combo Box
					in3.setKondisiStopKontak(comboBox_1.getSelectedItem()+"");
					in3.setPosisiStopKontak(comboBox_2.getSelectedItem()+"");
					in3.setKondisiKabelLCD(comboBox_4.getSelectedItem()+"");
					in3.setPosisiKabelLCD(comboBox_3.getSelectedItem()+"");
					in3.setKondisiKipas(comboBox_7.getSelectedItem()+"");
					in3.setKondisiAC(comboBox_9.getSelectedItem()+"");
					in3.setKondisiCCTV(comboBox_12.getSelectedItem()+"");
					in3.setPosisiAC(comboBox_10.getSelectedItem()+"");
					in3.setKondisiLampu(comboBox_5.getSelectedItem()+"");
					classBaca.write1_3(in3);
					
					in4.setKondLantai(comboBox_14.getSelectedItem()+"");
					in4.setKonDinding(comboBox_15.getSelectedItem()+"");
					in4.setKonAtap(comboBox_16.getSelectedItem()+"");
					in4.setKonPintu(comboBox_17.getSelectedItem()+"");
					in4.setKonJendela(comboBox_18.getSelectedItem()+"");
					
					in5.setSirkulUdara(textField.getText());
					in5.setNilaiCahaya(Integer.parseInt(textField.getText()));
					in5.setKelembapan(Integer.parseInt(textField.getText()));
					in5.setSuhu(Integer.parseInt(textField.getText()));
					
					in6.setKebisingan(comboBox_19.getSelectedItem()+"");
					in6.setBau(comboBox_20.getSelectedItem()+"");
					in6.setKebocoran(comboBox_21.getSelectedItem()+"");
					in6.setKerusakan(comboBox_22.getSelectedItem()+"");
					in6.setKeausan(comboBox_23.getSelectedItem()+"");
					
					in7.setKekokohan(comboBox_24.getSelectedItem()+"");
					in7.setKuncipintudanjendela(comboBox_25.getSelectedItem()+"");
					in7.setBahaya(comboBox_26.getSelectedItem()+"");
					
					classBaca.write1_1(in1);
					classBaca.write1_2(in2);
					classBaca.write1_3(in3);
					classBaca.write2_1(in4);
					classBaca.write2_2(in5);
					classBaca.write3_1(in6);
					classBaca.write3_2(in7);
					new classBaca();
					
					data1.analisis1();
					data1.analisis2();
					data2.analisis1();
					data2.analisis2();
					data3.analisis1();
					data3.analisis2();
				}catch(Exception ex){
					
				}
				JOptionPane.showMessageDialog(null, "Success");
				//dispose(); 
			}
		});
		
		btnFinsishAnalyze.setBounds(639, 357, 154, 72);
		panel_2.add(btnFinsishAnalyze);
		
		JButton button_2 = new JButton("<");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		button_2.setBounds(10, 402, 127, 27);
		panel_2.add(button_2);
	}
}
