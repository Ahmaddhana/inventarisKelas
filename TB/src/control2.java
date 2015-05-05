import java.util.Scanner;
public class control2 {

	Scanner input = new Scanner(System.in);
	identitasRuangKelas in1 = new identitasRuangKelas();
	jmlKondisiPosisiSarana in3 = new jmlKondisiPosisiSarana();
	kondisiKelas in2 = new kondisiKelas();
	double a=0,b=0;

	void masukan(){

		System.out.println("Identitas Ruang Kelas : ");
		System.out.println("---------------------------");
		
		System.out.println("Masukan nama Ruangan :");
		String NamaR = input.nextLine();
		in1.setNamaR(NamaR);
		System.out.println("Masukan lokasi Ruangan tersebut :");
		String lokasiR = input.nextLine();
		in1.setLokasiR(lokasiR);
		System.out.println("Masukan Program Studi :");
		String progStudi = input.nextLine();
		in1.setProgStudi(progStudi);

		System.out.println("Jumlah Kondisi Posisi Sarana Kelas");
		System.out.println("-------------------------------------");
		
		System.out.println("Masukan panjang Ruang :");
		double panjangruang = input.nextDouble();
		in2.setPanjangruang(panjangruang);
		System.out.println("Lebar ruangan tersebut :");
		double lebarruang = input.nextDouble();
		in2.setLebarruang(lebarruang);
		System.out.println("Masukan jumlah kursi :");
		int jumlahkursi = input.nextInt();
		in2.setJumlahkursi(jumlahkursi);
		System.out.println("Masukan jumlah pintu :");
		int jumlahpintu = input.nextInt();
		in2.setJumlahpintu(jumlahpintu);
		System.out.println("Masukan jumlah jendela :");
		int jumlahjendela = input.nextInt();
		in2.setJumlahjendela(jumlahjendela);

		System.out.println("Kondisi Kelas");
		System.out.println("--------------");
		
		System.out.println("Masukan jumlah stop kontak :");
		int jmlStopkontak = input.nextInt();
		in3.setJmlStopkontak(jmlStopkontak);
		System.out.println("Kondisi stop kontak :\n(baik / tidak)");
		String kondisiStopKontak = input.next();
		in3.setKondisiStopKontak(kondisiStopKontak);
		System.out.println("posisi stop kontak :\n(pojok ruang / dekat dosen)");
		String posisiStopKontak = input.next();
		in3.setPosisiStopKontak(posisiStopKontak);
		System.out.println("Masukan jumlah kabel LCD : ");
		int jmlKabelLCD = input.nextInt();
		in3.setJmlKabelLCD(jmlKabelLCD);
		System.out.println("Masukan Posisi Kabel LCD :");
		String posisiKabelLCD = input.next();  
		in3.setPosisiKabelLCD(posisiKabelLCD);
		System.out.println("jumlah Lampu dalam Ruangan :");
		int jmlLampu = input.nextInt() ;
		in3.setJmlLampu(jmlLampu);
		System.out.println("Kondisi Lampu :");
		String kondisiLampu = input.next();
		in3.setKondisiLampu(kondisiLampu);
		System.out.println("Posisi Lampu dalam Ruangan :");
		String posisiLampu = input.next();
		in3.setPosisiLampu(posisiLampu);
		System.out.println("Jumlah kipas dalam Ruangan :");
		int jmlKipas = input.nextInt();
		in3.setJmlKipas(jmlKipas);
		System.out.println("Kondisi Kipas :");
		String kondisiKipas = input.next();
		in3.setKondisiKipas(kondisiKipas);
		System.out.println("Posisi Kipas tersebut :");
		String posisiKipas = input.next();
		in3.setPosisiKipas(posisiKipas);
		System.out.println("Masukan jumlah AC :");
		int jmlAC = input.nextInt();
		in3.setJmlAC(jmlAC);
		System.out.println("Kondisi AC dalam Ruangan :");
		String kondisiAC = input.next();
		in3.setKondisiAC(kondisiAC);
		System.out.println("Posisi AC dalam Ruangan :");
		String posisiAC = input.next();
		in3.setPosisiAC(posisiAC);
		System.out.println("Apakah ada SSID :");
		String SSID = input.next();
		in3.setSSID(SSID);
		System.out.println("Bandwith yang tersedia dalam Ruangan tersebut :");
		String bandwidth = input.next();
		in3.setBandwidth(bandwidth);
		System.out.println("Jumlah CCTV yang terdapat dalam Ruangan :");
		int jmlCCTV = input.nextInt();
		in3.setBandwidth(bandwidth);
		System.out.println("Kondisi CCTV :");
		String kondisiCCTV = input.next();
		in3.setKondisiCCTV(kondisiCCTV);
		System.out.println("Posisi CCTV dalam Ruangan ");
		String posisiCCTV = input.next();
		in3.setPosisiCCTV(posisiCCTV);
	}

	//Metod Analisis
	
double hitungLuas(){
	
	double hasil = in2.getPanjangruang() * in2.getLebarruang();
	in2.setHasil(hasil);
	double rasio = in2.getHasil() / in2.getJumlahkursi();
	if(in2.getPanjangruang()!=hasil){
		String Persegi="Persegi panjang";
		if(Persegi.equals("Persegi panjang")){
			a=a+1;
		}
	}
	if(in2.getPanjangruang() != in2.getHasil()){
		a=a+1;
	}
	if(rasio >= 0.5){
		a=a+1;
	}
	return rasio;
}

double proses1(){
	return a/3*100;
}


	
String AnalisisJKPSarana(){
	String Hasil="Sesuai";
	if(in3.getJmlStopkontak()>=4){
		b=b+1;
	}
	if(in3.getKondisiStopKontak().equals("baik")){
		b=b+1;
	}
	if(in3.getPosisiStopKontak().equalsIgnoreCase("pojok ruang")||in3.getPosisiStopKontak().equalsIgnoreCase("dekat dosen")){
		b=b+1; 
	}

	if(in3.getJmlKabelLCD()>=1){
		b=b+1;
	}
	if(in3.getKondisiKabelLCD().equals("berfungsi")){
		b=b+1;
	}
	if(in3.getPosisiKabelLCD().equalsIgnoreCase("dekat dosen")){
		b=b+1;
	}
	
	if(in3.getJmlLampu()>=18){
		b=b+1;
	}
	if(in3.getKondisiLampu().equals("baik")){
		b=b+1;
	}
	if(in3.getPosisiLampu().equalsIgnoreCase("atap ruangan")){
		b=b+1;
	}

	if(in3.getJmlKipas()>=2){
		b=b+1;
	}
	if(in3.getKondisiKipas().equals("baik")){
		b=b+1;
	}
	if(in3.getPosisiKipas().equalsIgnoreCase("atap ruangan")){
		b=b+1;
	}
	
	if(in3.getJmlAC()>=1){
		b=b+1;
	}
	if(in3.getKondisiAC().equals("baik")){
		b=b+1;
	}
	if(in3.getPosisiAC().equalsIgnoreCase("belakang")||in3.getPosisiAC().equalsIgnoreCase("depan")){
		b=b+1;
	}
	
	if(in3.getSSID().equals("UMM Hotspot")){
		b=b+1;
	}
	if(in3.getBandwidth().equalsIgnoreCase("bisa login")){
		b=b+1;
	}

	if(in3.getJmlCCTV()>=2){
		b=b+1;
	}
	if(in3.getKondisiCCTV().equals("baik")){
		b=b+1;
	}
	if(in3.getPosisiCCTV().equalsIgnoreCase("belakang") || in3.getPosisiCCTV().equalsIgnoreCase("depan")){
		b=b+1;
	}
	return Hasil;
}

double proses2(){
	return b/7*100;
}

void view (){
	
	System.out.println("Nama Ruang : "+in1.getNamaR());
	System.out.println("Lokasi Ruang : "+in1.getLokasiR());
	System.out.println("Program Studi : "+in1.getProgStudi());
	
	System.out.println("------------------------------------------------");

	System.out.println("Luas Ruang : " + in2.getHasil());
	System.out.println("Rasio Ruang : " +hitungLuas());
	System.out.println("Nilai Sesuai : "+a);
	System.out.println("Kesesuaian : "+proses1());
	System.out.println(hitungLuas());
	
	System.out.println("------------------------------------------------");

	System.out.println("Analisis Kelistrikan : ");
	System.out.println("Jumlah : " + in3.getJmlStopkontak() + "\t" + "Kondisi : " + in3.getKondisiStopKontak() + "\t" + "Posisi : " + in3.getPosisiStopKontak());
	System.out.println("Analisis LCD : ");
	System.out.println("Jumlah : " + in3.getJmlKabelLCD() + "\t" + "Kondisi : " + in3.getKondisiKabelLCD() + "\t" + "Posisi : " + in3.getPosisiKabelLCD());
	System.out.println("Analisis Lampu : ");
	System.out.println("Jumlah : " + in3.getJmlLampu() + "\t" + "Kondisi : " + in3.getKondisiLampu() + "\t" + "Posisi : " + in3.getPosisiLampu());
	System.out.println("Analisis Kipas Angin : ");
	System.out.println("Jumlah : " + in3.getJmlKipas() + "\t" + "Kondisi : " + in3.getKondisiKipas() + "\t" + "Posisi : " + in3.getPosisiKipas());
	System.out.println("Analisis AC : ");
	System.out.println("Jumlah : " + in3.getJmlAC() + "\t" + "Kondisi : " + in3.getKondisiAC() + "\t" + "Posisi : " + in3.getPosisiAC());
	System.out.println("Analisis Internet : ");
	System.out.println("SSID :"+in3.getSSID()+"bandwith :"+in3.getBandwidth());
	System.out.println("Analisis CCTV : ");
	System.out.println("Jumlah : " + in3.getJmlCCTV() + "\t" + "Kondisi : " + in3.getKondisiCCTV() + "\t" + "Posisi : " + in3.getPosisiCCTV());
	System.out.println("Nilai Sesuai : "+b);
	System.out.println("Kesesuaian : "+proses2());
	System.out.println(AnalisisJKPSarana());
	System.out.println("-----------------------------------------------");	
	
}


}
