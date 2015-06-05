import java.io.*;

public class  control3 extends supercontrol {

	KenyamananRuangKelas data1 = new KenyamananRuangKelas();
	KeamananRuangKelas data2 = new KeamananRuangKelas();
	
	void masukan(){
		System.out.println("Kenyamanan Ruang Kelas");
		System.out.println("----------------------");
		System.out.println("ya atau tidak");
		
		System.out.print(" bising : ");
		String bising = input.nextLine();
		data1.setKebisingan(bising);
		 
		System.out.print(" tidak Wangi : ");
		String bau = input.nextLine();
		data1.setBau(bau);
		
		System.out.print(" bocor : ");
		String bocor = input.nextLine();
		data1.setKebocoran(bocor);
		
		System.out.print(" rusak : ");
		String rusak = input.nextLine();
		data1.setKerusakan(rusak);
		
		System.out.print(" aus : ");
		String aus = input.nextLine();
		data1.setKeausan(aus);
		
		System.out.println("Keamanan Ruang Kelas");
		System.out.println("-----------------------");
		System.out.println("ya atau tidak");
		
		System.out.print(" kokoh : ");
		String kokoh = input.nextLine();
		data2.setKekokohan(kokoh);
		
		System.out.print("Kunci Pintu dan Jendela : ");
		String kunci = input.nextLine();
		data2.setKuncipintudanjendela(kunci);
		
		System.out.print("tidak Bahaya : ");
		String bahaya = input.nextLine();
		data2.setBahaya(bahaya);
	}
	
	@Override
	String analisis1() {
		if (data1.getKebisingan().equalsIgnoreCase("ya")){
		a = a+1;
		}
	if (data1.getBau().equalsIgnoreCase("ya")){
		a = a+1;
	}
	if (data1.getKebocoran().equalsIgnoreCase("ya")){
		a = a+1;
	}
	if (data1.getKerusakan().equalsIgnoreCase("ya")){
		a = a+1;
	}
	if (data1.getKeausan().equalsIgnoreCase("ya")){
		a = a+1;
	}else {
		a=a+0; 
	}
	
	if(a<5){
		Result1="Tidak Sesuai";
	}else{
		Result1="Sesuai";
	}
		return Result1;
	}
	
	@Override
	String analisis2() {
		if (data2.getKekokohan().equalsIgnoreCase("ya")){
			b = b+1;
		}
		if (data2.getKuncipintudanjendela().equalsIgnoreCase("ya")){
			b = b+1;
		}
		if (data2.getBahaya().equalsIgnoreCase("ya")){
			b = b+1;
		}else {
			b=b+0;
		}
		
		if(a<3){
			Result2="Tidak Sesuai";
		}else{
			Result2="Sesuai";
		}
		return Result2;
	}
	
	
	
	void View(){
		
		try{
			PrintStream out = new PrintStream(new FileOutputStream("Database3.adr"));
			System.setOut(out);
		out.println("Kenyamanan Ruang Kelas");
		out.println("=======================");
		
		out.println(data1.getKebisingan());
		out.println(data1.getBau());
		out.println(data1.getKebocoran());
		out.println(data1.getKerusakan());
		out.println(data1.getKeausan());
		out.println("Nilai Sesuai: " + a);
		out.println("Kesesuaian : " +super.proses1(a, 5) + "%" + " " + analisis1());
		
		out.println("Keamanan Ruang Kelas");
		out.println("======================");
		
		out.println(data2.getKekokohan());
		out.println(data2.getKuncipintudanjendela());
		out.println(data2.getBahaya());
		out.println("Nilai Sesuai: " + b);
		out.println("Kesesuaian : " +super.proses2(b, 3)+"%"+" "+ analisis2());
		}catch(IOException ex){
			System.out.println("Error");
		}
	}
}
