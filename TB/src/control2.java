
public class control2 extends control1 {
	
	LingkunganRK data1 = new LingkunganRK();
	KebersihanRK data2 = new KebersihanRK();
	
	String sesuai = "Sesuai", tidak = "Tidak Sesuai";
	double a=0, b=0, hsl;
	
	void masukan(){
		
			System.out.println("\nLingkungan Ruang Kelas");
			System.out.println("Bersih/ Tidak");
			System.out.println("------------------------------");
			
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
			System.out.println("-----------------------------");
			
			System.out.print("Sirkulasi Udara (Lancar / Tidak) : ");
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
	}
	
	double prosesLingkungan(){
		if (data1.getKondLantai().equals("bersih")){
			b=b+1;
		}
		if (data1.getKonDinding().equals("bersih")){
			b=b+1;
		}
		if (data1.getKonAtap().equals("bersih")){
			b=b+1;
		}
		if (data1.getKonPintu().equals("bersih")){
			b=b+1;
		}
		if (data1.getKonJendela().equals("bersih")){
			b=b+1;
		}
		return b;
	}
	double proses1(){
		return b/5 * 100/2;
	}
	
	double prosesKebersihan(){
		if(data2.getSirkulUdara().equalsIgnoreCase("lancar")){
			a = a+1;
		}
		if (data2.getNilaiCahaya() >= 250 && data2.getNilaiCahaya() <=350){
			a = a+1;
		}
		if(data2.getKelembapan() >= 70 && data2.getKelembapan() <= 80){
			a = a+1;
		}
		if(data2.getSuhu() >= 25 && data2.getSuhu() <= 35){
			a = a+1;
		}
		else{
			a=a+0;
		}
		return a;
	}
	double proses2(){
		return a/4 * 100/2;
	}
	
	void View(){
		System.out.println("\n--------------------------------------\n");
		//Lingkungan Ruang Kelas
		System.out.println("Lantai  : " + data1.getKondLantai());
		System.out.println("Dinding : " + data1.getKonDinding());
		System.out.println("Atap    : " + data1.getKonAtap());
		System.out.println("Pintu   : " + data1.getKonPintu());
		System.out.println("Jendela : " + data1.getKonJendela());
		System.out.println("Nilai Sesuai : " + prosesLingkungan()/2);
		System.out.println("Kesesuaian   : "+ proses1()+"%");
		
		//Kebersihan Ruang Kelas
		System.out.println("Kebersihan Ruang Kelas");
		System.out.println("\n-----------------------");
		System.out.println("Sirkulasi Udara    : " + data2.getSirkulUdara());
		System.out.println("Tingkat Cahaya     : " + data2.getNilaiCahaya());
		System.out.println("Tingkat Kelembapan : " + data2.getKelembapan());
		System.out.println("Tingkat Suhu       : " + data2.getSuhu() +" derajat");
		System.out.println("Nilai Sesuai : " + prosesKebersihan()/2);
		System.out.println("Kesesuaian   : "+ proses2()+"%");
	}
}
