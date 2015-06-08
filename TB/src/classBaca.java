import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;


public class classBaca {
	
	//Write1 Object Identitas & Kondisi & Kondisi Kelas
	public static void write1_1(identitasRuangKelas in1){
		
		try{
			File folder = new File("Database");
			FileOutputStream save = new FileOutputStream("Database/Database1_1.txt");
			ObjectOutputStream saver = new ObjectOutputStream(save);
			
			folder.mkdir();
			saver.writeObject(in1);
			saver.close();
		}catch(java.lang.NullPointerException er){
			
		}catch(Exception ex){
			
		}
	}
	public static void write1_2(kondisiKelas in2){
		
		try{
			FileOutputStream save = new FileOutputStream("Database/Database1_2.txt");
			ObjectOutputStream saver = new ObjectOutputStream(save);
			
			saver.writeObject(in2);
			saver.close();
		}catch(java.lang.NullPointerException er){
			
		}catch(Exception ex){
			
		}
	}
	public static void write1_3(jmlKondisiPosisiSarana in3){
		
		try{
			FileOutputStream save = new FileOutputStream("Database/Database1_3.txt");
			ObjectOutputStream saver = new ObjectOutputStream(save);
			
			saver.writeObject(in3);
			saver.close();
		}catch(java.lang.NullPointerException er){
			
		}catch(Exception ex){
			
		}
	}
	
	//Write2 Object Lingkungan & Keberssihan
	public static void write2_1(LingkunganRK in4){
		try{
			FileOutputStream save = new FileOutputStream("Database/Database2_1.txt");
			ObjectOutputStream saver = new ObjectOutputStream(save);
			
			saver.writeObject(in4);
			saver.close();
		}catch(Exception err){
			
		}
	}
	public static void write2_2(KebersihanRK in5){
		try{
			FileOutputStream save = new FileOutputStream("Database/Database2_2.txt");
			ObjectOutputStream saver = new ObjectOutputStream(save);
			
			saver.writeObject(in5);
			saver.close();
		}catch(Exception err){
			
		}
	}
	
	//Write3 Object Kenyamanan & Keamanan
	public static void write3_1(KenyamananRuangKelas in6){
		try{
			FileOutputStream save = new FileOutputStream("Database/Database3_1.txt");
			ObjectOutputStream saver = new ObjectOutputStream(save);
			
			saver.writeObject(in6);
			saver.close();
		}catch(Exception err){
			
		}
	}
	public static void write3_2(KeamananRuangKelas in7){
		try{
			FileOutputStream save = new FileOutputStream("Database/Database3_2.txt");
			ObjectOutputStream saver = new ObjectOutputStream(save);
			
			saver.writeObject(in7);
			saver.close();
		}catch(Exception err){
			
		}
	}
	
	//Read Object Identitas & Kondisi & Kondisi Kelas
	public static identitasRuangKelas read1_1(){
		identitasRuangKelas in1 = null;
		try{
			ObjectInputStream load = new ObjectInputStream(new FileInputStream("Database/Database1_1.txt"));
			in1 = (identitasRuangKelas)load.readObject();
			load.close();
			
		}catch(FileNotFoundException err){
			JOptionPane.showMessageDialog(null, "File Not Found!");
		}catch(Exception err){
			JOptionPane.showMessageDialog(null, "Error");
		}
		return in1;
	}
	public static jmlKondisiPosisiSarana read1_2(){
		jmlKondisiPosisiSarana in2 = null;
		try{
			ObjectInputStream load = new ObjectInputStream(new FileInputStream("Database/Database1_2.txt"));
			in2 = (jmlKondisiPosisiSarana)load.readObject();
			load.close();
			
		}catch(FileNotFoundException err){
			JOptionPane.showMessageDialog(null, "File Not Found!");
		}catch(Exception err){
			JOptionPane.showMessageDialog(null, "Error");
		}
		return in2;
	}
	public static kondisiKelas read1_3(){
		kondisiKelas in3 = null;
		try{
			ObjectInputStream load = new ObjectInputStream(new FileInputStream("Database/Database1_3.txt"));
			in3 = (kondisiKelas)load.readObject();
			load.close();
			
		}catch(FileNotFoundException err){
			JOptionPane.showMessageDialog(null, "File Not Found!");
		}catch(Exception err){
			JOptionPane.showMessageDialog(null, "Error");
		}
		return in3;
	}
	
	//Read Object Lingkungan & Kebersihan
	public static LingkunganRK read2_1(){
		LingkunganRK in4 = null;
		try{
			ObjectInputStream load = new ObjectInputStream(new FileInputStream("Database/Database2_1.txt"));
			in4 = (LingkunganRK)load.readObject();
			load.close();
			
		}catch(Exception err){
			
		}
		return in4;
	}
	public static KebersihanRK read2_2(){
		KebersihanRK in5 = null;
		try{
			ObjectInputStream load = new ObjectInputStream(new FileInputStream("Database/Database2_2.txt"));
			in5 = (KebersihanRK)load.readObject();
			load.close();
			
		}catch(Exception err){
			
		}
		return in5;
	}
	
	//
	public static KenyamananRuangKelas read3_1(){
		KenyamananRuangKelas in6 = null;
		KeamananRuangKelas in7 = null;
		try{
			ObjectInputStream load = new ObjectInputStream(new FileInputStream("Database/Database3_1.txt"));
			in6 = (KenyamananRuangKelas)load.readObject();
			in7 = (KeamananRuangKelas)load.readObject();
			load.close();
			
		}catch(Exception err){
			
		}
		return in6;
	}
	public static KeamananRuangKelas read3_2(){
		KeamananRuangKelas in7 = null;
		try{
			ObjectInputStream load = new ObjectInputStream(new FileInputStream("Database/Database3_2.txt"));
			in7 = (KeamananRuangKelas)load.readObject();
			load.close();
			
		}catch(Exception err){
			
		}
		return in7;
	}
}
