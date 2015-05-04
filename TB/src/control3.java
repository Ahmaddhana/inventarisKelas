import java.util.*;

public class control3 {

	Scanner input = new Scanner(System.in);
	KenyamananRuangKelas data1 = new KenyamananRuangKelas();
	KeamananRuangKelas data2 = new KeamananRuangKelas();
	String x="sesuai", y="tidak sesuai";
	
	void masukan(){
		System.out.print("Kenyamanan Ruang Kelas");
		System.out.println("------------------------");
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
		
		System.out.print("Keamanan Ruang Kelas");
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
	
	String proses1(){
		if (data1.getKebisingan().equalsIgnoreCase("ya")&&data1.getBau().equalsIgnoreCase("ya")&&data1.getKebocoran().equalsIgnoreCase("ya")
				&&data1.getKerusakan().equalsIgnoreCase("ya")&&data1.getKeausan().equalsIgnoreCase("ya")){
			return y;
		}
		
		else {
			return x;
		}
	}
	
	String proses2(){
		if (data2.getKekokohan().equalsIgnoreCase("ya")&&data2.getKuncipintudanjendela().equalsIgnoreCase("ya")&&data2.getBahaya().equalsIgnoreCase("ya")){
			return x;
		}
		
		else {
			return y;
		}
	}
	
	void view(){
		System.out.println("Kenyamanan Ruang Kelas");
		System.out.println("=======================");
		
		System.out.println(data1.getKebisingan());
		System.out.println(data1.getBau());
		System.out.println(data1.getKebocoran());
		System.out.println(data1.getKerusakan());
		System.out.println(data1.getKeausan());
		System.out.println(proses1());
		
		
		System.out.println("Keamanan Ruang Kelas");
		System.out.println("======================");
		
		System.out.println(data2.getKekokohan());
		System.out.println(data2.getKuncipintudanjendela());
		System.out.println(data2.getBahaya());
		System.out.println(proses2());
	}
}
