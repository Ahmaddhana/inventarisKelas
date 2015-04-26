import java.util.Scanner;
public class control2 {

	Scanner input = new Scanner(System.in);
	identitasRuangKelas in1 = new identitasRuangKelas();
	jmlKondisiPosisiSarana in3 = new jmlKondisiPosisiSarana();
	kondisiKelas in2 = new kondisiKelas();

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
		String kondisiStopKontak = input.nextLine();
		in3.setKondisiStopKontak(kondisiStopKontak);
		System.out.println("posisi stop kontak :\n(pojok ruang / dekat dosen)");
		String posisiStopKontak = input.nextLine();
		in3.setPosisiStopKontak(posisiStopKontak);
		System.out.println("Masukan jumlah kabel LCD : ");
		int jmlKabelLCD = input.nextInt();
		in3.setJmlKabelLCD(jmlKabelLCD);
		System.out.println("Masukan Posisi Kabel LCD :");
		String posisiKabelLCD = input.nextLine();  
		in3.setPosisiKabelLCD(posisiKabelLCD);
		System.out.println("jumlah Lampu dalam Ruangan :");
		int jmlLampu = input.nextInt() ;
		in3.setJmlLampu(jmlLampu);
		System.out.println("Kondisi Lampu :");
		String kondisiLampu = input.nextLine();
		in3.setKondisiLampu(kondisiLampu);
		System.out.println("Posisi Lampu dalam Ruangan :");
		String posisiLampu = input.nextLine();
		in3.setPosisiLampu(posisiLampu);
		System.out.println("Jumlah kipas dalam Ruangan :");
		int jmlKipas = input.nextInt();
		in3.setJmlKipas(jmlKipas);
		System.out.println("Kondisi Kipas :");
		String kondisiKipas = input.nextLine();
		in3.setKondisiKipas(kondisiKipas);
		System.out.println("Posisi Kipas tersebut :");
		String posisiKipas = input.nextLine();
		in3.setPosisiKipas(posisiKipas);
		System.out.println("Masukan jumlah AC :");
		int jmlAC = input.nextInt();
		in3.setJmlAC(jmlAC);
		System.out.println("Kondisi AC dalam Ruangan :");
		String kondisiAC = input.nextLine();
		in3.setKondisiAC(kondisiAC);
		System.out.println("Posisi AC dalam Ruangan :");
		String posisiAC = input.nextLine();
		in3.setPosisiAC(posisiAC);
		System.out.println("Apakah ada SSID :");
		String SSID = input.nextLine();
		in3.setSSID(SSID);
		System.out.println("Bandwith yang tersedia dalam Ruangan tersebut :");
		String bandwidth = input.nextLine();
		in3.setBandwidth(bandwidth);
		System.out.println("Jumlah CCTV yang terdapat dalam Ruangan :");
		int jmlCCTV = input.nextInt();
		in3.setBandwidth(bandwidth);
		System.out.println("Kondisi CCTV :");
		String kondisiCCTV = input.nextLine();
		in3.setKondisiCCTV(kondisiCCTV);
		System.out.println("Posisi CCTV dalam Ruangan ");
		String posisiCCTV = input.nextLine();
		in3.setPosisiCCTV(posisiCCTV);
	}

	//Metod Analisis
	
void hitungLuas(){
	double hasil = in2.getPanjangruang() * in2.getLebarruang();
	in2.setHasil(hasil);
	
	double rasio = in2.getHasil() / in2.getJumlahkursi();
	
	System.out.println("Luas Ruang : " + in2.getHasil());
	if(in2.getPanjangruang() != in2.getHasil()){
		System.out.println("Sesuai");
	}
	else{
		System.out.println("Tidak Sesuai");
	}
	System.out.println("Rasio Ruang : " + rasio);
	if(rasio >= 0.5){
		System.out.println("Sesuai");
	}
	else{
		System.out.println("Tidak Sesuai");
	}
}

	
	void AnalisisKelistrikan(){ 
	System.out.println("Analisis Kelistrikan : ");
	System.out.println("Jumlah : " + in3.getJmlStopkontak() + "\t" + "Kondisi : " + in3.getKondisiStopKontak() + "\t" + "Posisi : " + in3.getPosisiStopKontak());
	if(in3.getJmlStopkontak()>=4 && in3.getKondisiStopKontak().equals("baik") && in3.getPosisiStopKontak().equalsIgnoreCase("pojok ruang")||in3.getPosisiStopKontak().equalsIgnoreCase("dekat dosen")){
		System.out.println("Sesuai");
	} else System.out.println("tidak sesuai");
}

void AnalisisLCD(){
	System.out.println("Analisis LCD : ");
	System.out.println("Jumlah : " + in3.getJmlKabelLCD() + "\t" + "Kondisi : " + in3.getKondisiKabelLCD() + "\t" + "Posisi : " + in3.getPosisiKabelLCD());
	if(in3.getJmlKabelLCD()>=1 && in3.getKondisiKabelLCD().equals("berfungsi") && in3.getPosisiKabelLCD().equalsIgnoreCase("dekat dosen")){
		System.out.println("Sesuai");
	} else System.out.println("tidak sesuai");
}

void AnalisisLampu(){ 
	System.out.println("Analisis Lampu : ");
	System.out.println("Jumlah : " + in3.getJmlLampu() + "\t" + "Kondisi : " + in3.getKondisiLampu() + "\t" + "Posisi : " + in3.getPosisiLampu());
	if(in3.getJmlLampu()>=18 && in3.getKondisiLampu().equals("baik") && in3.getPosisiLampu().equalsIgnoreCase("atap ruangan")){
		System.out.println("Sesuai");
	} else System.out.println("tidak sesuai");
}

void AnalisisKipasAngin(){ 
	System.out.println("Analisis Kipas Angin : ");
	System.out.println("Jumlah : " + in3.getJmlKipas() + "\t" + "Kondisi : " + in3.getKondisiKipas() + "\t" + "Posisi : " + in3.getPosisiKipas());
	if(in3.getJmlKipas()>=2 && in3.getKondisiKipas().equals("baik") && in3.getPosisiKipas().equalsIgnoreCase("atap ruangan")){
		System.out.println("Sesuai");
	} else System.out.println("tidak sesuai");
}

void AnalisisAC(){ 
	System.out.println("Analisis AC : ");
	System.out.println("Jumlah : " + in3.getJmlAC() + "\t" + "Kondisi : " + in3.getKondisiAC() + "\t" + "Posisi : " + in3.getPosisiAC());
	if(in3.getJmlAC()>=1 && in3.getKondisiAC().equals("baik") && in3.getPosisiAC().equalsIgnoreCase("belakang")||in3.getPosisiAC().equalsIgnoreCase("depan")){
		System.out.println("Sesuai");
	} else System.out.println("tidak sesuai");		
}

void AnalisisInternet(){ 
	System.out.println("Analisis Internet : ");
	System.out.println("SSID :"+in3.getSSID()+"bandwith :"+in3.getBandwidth());
	if(in3.getSSID().equals("UMM Hotspot") && in3.getBandwidth().equalsIgnoreCase("bisa login")){
		System.out.println("Sesuai");
	} else System.out.println("tidak sesuai");
}

void AnalisisCCTV(){ 
	System.out.println("Analisis CCTV : ");
	System.out.println("Jumlah : " + in3.getJmlCCTV() + "\t" + "Kondisi : " + in3.getKondisiCCTV() + "\t" + "Posisi : " + in3.getPosisiCCTV());
	if(in3.getJmlCCTV()>=2 && in3.getKondisiCCTV().equals("baik") && in3.getPosisiCCTV().equalsIgnoreCase("belakang") || in3.getPosisiCCTV().equalsIgnoreCase("depan")){
		System.out.println("Sesuai");
	} else System.out.println("tidak sesuai");
}


}
