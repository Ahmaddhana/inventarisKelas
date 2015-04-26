import java.util.*;

public class control {

	Scanner input = new Scanner(System.in);
	LingkunganRK data1 = new LingkunganRK();
	KebersihanRK data2 = new KebersihanRK();
	
	void masukan(){
		
			System.out.println("\nLingkungan Ruang Kelas");
			System.out.println("Input = (bersih) / (tidak)");
			System.out.println("-----------------------------");
			
			System.out.print("Kondisi Lantai : ");
			String lantai = input.next();
			data1.setKondLantai(lantai);
			
			System.out.print("Kondisi Dinding : ");
			String dinding = input.next();
			data1.setKonDinding(dinding);
			
			System.out.print("Kondisi Atap : ");
			String atap = input.next();
			data1.setKonAtap(atap);
			
			System.out.print("Kondisi Pintu : ");
			String pintu = input.next();
			data1.setKonPintu(pintu);
			
			System.out.print("Kondisi Jendela : ");
			String jendela = input.next();
			data1.setKonJendela(jendela);

			System.out.println("\nKebersihan Ruang Kelas");
			System.out.println("Input = (bersih) / (tidak)");
			System.out.println("-----------------------------");
			
			System.out.print("Sirkulasi Udara : ");
			String udara = input.next();
			data2.setSirkulUdara(udara);
			
			System.out.print("Tingkat Cahaya : ");
			double cahaya = input.nextDouble();
			data2.setNilaiCahaya(cahaya);
			
			System.out.print("Tingkat Kelembapan : ");
			double kelembapan = input.nextDouble();
			data2.setKelembapan(kelembapan);
			
			System.out.print("Tingkat Suhu : ");
			double suhu = input.nextDouble();
			data2.setSuhu(suhu);
		//}
	}
	
	void View(){
		if (data1.getKondLantai().equals("bersih") && data1.getKonDinding().equals("bersih") && data1.getKonAtap().equals("bersih") && data1.getKonPintu().equals("bersih") && data1.getKonJendela().equals("bersih")){
			System.out.println("Sesuai");
		}
		else{
			System.out.println("Tidak Sesuai");
		}
		
		
		System.out.println(data2.getSirkulUdara());
		System.out.println(data2.getNilaiCahaya());
		System.out.println(data2.getKelembapan());
		System.out.println(data2.getSuhu() + " Celcius");
	}
}
