import java.util.*;

public class control {

	Scanner input = new Scanner(System.in);
	kebersihan_lingkunganRK data = new kebersihan_lingkunganRK();
	
	void pilihan(){
		
			System.out.println("\nLingkungan Ruang Kelas");
			System.out.println("Input = (bersih) / (tidak)");
			System.out.println("-----------------------------");
			
			System.out.print("Kondisi Lantai : ");
			String lantai = input.next();
			data.setKondLantai(lantai);
			
			System.out.print("Kondisi Dinding : ");
			String dinding = input.next();
			data.setKonDinding(dinding);
			
			System.out.print("Kondisi Atap : ");
			String atap = input.next();
			data.setKonAtap(atap);
			
			System.out.print("Kondisi Pintu : ");
			String pintu = input.next();
			data.setKonPintu(pintu);
			
			System.out.print("Kondisi Jendela : ");
			String jendela = input.next();
			data.setKonJendela(jendela);

			System.out.println("\nKebersihan Ruang Kelas");
			System.out.println("Input = (bersih) / (tidak)");
			System.out.println("-----------------------------");
			
			System.out.print("Sirkulasi Udara : ");
			String udara = input.next();
			data.setSirkulUdara(udara);
			
			System.out.print("Tingkat Cahaya : ");
			double cahaya = input.nextDouble();
			data.setNilaiCahaya(cahaya);
			
			System.out.print("Tingkat Kelembapan : ");
			double kelembapan = input.nextDouble();
			data.setKelembapan(kelembapan);
			
			System.out.print("Tingkat Suhu : ");
			double suhu = input.nextDouble();
			data.setSuhu(suhu);
		//}
	}
	
	void View(){
		if (data.getKondLantai().equals("bersih") && data.getKonDinding().equals("bersih") && data.getKonAtap().equals("bersih") && data.getKonPintu().equals("bersih") && data.getKonJendela().equals("bersih")){
			System.out.println("Sesuai");
		}
		else{
			System.out.println("Tidak Sesuai");
		}
		System.out.println(data.getSuhu() + " Celcius");
	}
}
