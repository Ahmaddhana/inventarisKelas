import java.util.*;

public class control3 {

	Scanner input = new Scanner(System.in);
	KenyamananRuangKelas data1 = new KenyamananRuangKelas();
	KeamananRuangKelas data2 = new KeamananRuangKelas();
	
	void masukan(){
		System.out.print("Kenyamanan Ruang Kelas");
		System.out.println("------------------------");
		
		System.out.print("Kebisingan : ");
		String bising = input.nextLine();
		data1.setKebisingan(bising);
		
		System.out.print("Tingkat Ketidak Wangian : ");
		String bau = input.nextLine();
		data1.setBau(bau);
		
		System.out.print("Kebocoran : ");
		String bocor = input.nextLine();
		data1.setKebocoran(bocor);
		
		System.out.print("Kerusakan : ");
		String rusak = input.nextLine();
		data1.setKerusakan(rusak);
		
		System.out.print("Keausan : ");
		String aus = input.nextLine();
		data1.setKeausan(aus);
		
		System.out.print("Keamanan Ruang Kelas");
		System.out.println("-----------------------");
		
		System.out.print("Kekokohan : ");
		String kokoh = input.nextLine();
		data2.setKekokohan(kokoh);
		
		System.out.print("Kunci Pintu dan Jendela : ");
		String kunci = input.nextLine();
		data2.setKuncipintudanjendela(kunci);
		
		System.out.print("Bahaya : ");
		String bahaya = input.nextLine();
		data2.setBahaya(bahaya);
	}
	
	void view(){
		System.out.println("Kenyamanan Ruang Kelas");
		System.out.println("=======================");
		
		System.out.println(data1.getKebisingan());
		System.out.println(data1.getBau());
		System.out.println(data1.getKebocoran());
		System.out.println(data1.getKerusakan());
		System.out.println(data1.getKeausan());
		
		System.out.println("Keamanan Ruang Kelas");
		System.out.println("======================");
		
		System.out.println(data2.getKekokohan());
		System.out.println(data2.getKuncipintudanjendela());
		System.out.println(data2.getBahaya());
	}
}
