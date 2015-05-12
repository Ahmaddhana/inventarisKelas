
public class control2 extends supercontrol {
	
	LingkunganRK data1 = new LingkunganRK();
	KebersihanRK data2 = new KebersihanRK();
	
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
	
	@Override
	String analis2() {
		if (data1.getKondLantai().equals("bersih")){
			b=b+1;
			val1 = "Sesuai";
		}
		if (data1.getKonDinding().equals("bersih")){
			b=b+1;
			val2 = "Sesuai";
		}
		if (data1.getKonAtap().equals("bersih")){
			b=b+1;
			val3 = "Sesuai";
		}
		if (data1.getKonPintu().equals("bersih")){
			b=b+1;
			val4 = "Sesuai";
		}
		if (data1.getKonJendela().equals("bersih")){
			b=b+1;
			val5 = "Sesuai";
		}else{
			b=b+0;
		}
		
		if (b<5){
			Result2 = "Tidak Sesuai";
		}else{
			Result2 = "Sesuai";
		}
		return super.analis2();
	}
	
	@Override
	String analisis1() {
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
		}else{
			a=a+0;
		}
		
		if (a<4){
			Result1 = "Tidak Sesuai";
		}else{
			Result1 = "Sesuai";
		}
		return super.analisis1();
	}

	void View(){
		System.out.println("\n--------------------------------------\n");
		//Lingkungan Ruang Kelas
		System.out.println("Lantai  : " + data1.getKondLantai() + super.val1);
		System.out.println("Dinding : " + data1.getKonDinding() + super.val2);
		System.out.println("Atap    : " + data1.getKonAtap() + super.val3);
		System.out.println("Pintu   : " + data1.getKonPintu() + super.val4);
		System.out.println("Jendela : " + data1.getKonJendela() + super.val5);
		System.out.println("Nilai Sesuai : " + b);
		System.out.println("Kesesuaian   : "+ super.proses1(b,5)+"%" + " " + super.analisis1());
		
		//Kebersihan Ruang Kelas
		System.out.println("Kebersihan Ruang Kelas");
		System.out.println("\n-----------------------");
		System.out.println("Sirkulasi Udara    : " + data2.getSirkulUdara());
		System.out.println("Tingkat Cahaya     : " + data2.getNilaiCahaya());
		System.out.println("Tingkat Kelembapan : " + data2.getKelembapan());
		System.out.println("Tingkat Suhu       : " + data2.getSuhu() +" derajat");
		System.out.println("Nilai Sesuai : " + a);
		System.out.println("Kesesuaian   : "+ super.proses2(a,4)+"%" + " " + super.analis2());
	}
}