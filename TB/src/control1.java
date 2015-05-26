import java.io.*;

public class control1 extends supercontrol {

	identitasRuangKelas in1 = new identitasRuangKelas();
	jmlKondisiPosisiSarana in3 = new jmlKondisiPosisiSarana();
	kondisiKelas in2 = new kondisiKelas();
	void masukan(){

		try{
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
		input.nextLine();
		System.out.println("posisi stop kontak :\n(pojok ruang / dekat dosen)");
		String posisiStopKontak = input.nextLine();
		in3.setPosisiStopKontak(posisiStopKontak);
		System.out.println("Masukan jumlah kabel LCD : ");
		int jmlKabelLCD = input.nextInt();
		in3.setJmlKabelLCD(jmlKabelLCD);
		input.nextLine();
		System.out.println("Masukan Posisi Kabel LCD :\n(dekat Dosen)");
		String posisiKabelLCD = input.nextLine();  
		in3.setPosisiKabelLCD(posisiKabelLCD);
		System.out.println("jumlah Lampu dalam Ruangan :");
		int jmlLampu = input.nextInt() ;
		in3.setJmlLampu(jmlLampu);
		System.out.println("Kondisi Lampu :\n(baik)");
		String kondisiLampu = input.next();
		in3.setKondisiLampu(kondisiLampu);
		input.nextLine();
		System.out.println("Posisi Lampu dalam Ruangan :\n(atap ruangan)");
		String posisiLampu = input.nextLine();
		in3.setPosisiLampu(posisiLampu);
		System.out.println("Jumlah kipas dalam Ruangan :");
		int jmlKipas = input.nextInt();
		in3.setJmlKipas(jmlKipas);
		System.out.println("Kondisi Kipas :\n(baik)");
		String kondisiKipas = input.next();
		in3.setKondisiKipas(kondisiKipas);
		input.nextLine();
		System.out.println("Posisi Kipas tersebut :\n(atap ruangan)");
		String posisiKipas = input.nextLine();
		in3.setPosisiKipas(posisiKipas);
		System.out.println("Masukan jumlah AC :");
		int jmlAC = input.nextInt();
		in3.setJmlAC(jmlAC);
		System.out.println("Kondisi AC dalam Ruangan :\n(baik)");
		String kondisiAC = input.next();
		in3.setKondisiAC(kondisiAC);
		input.nextLine();
		System.out.println("Posisi AC dalam Ruangan :\n(dibelakang atau disamping)");
		String posisiAC = input.nextLine();
		in3.setPosisiAC(posisiAC);
 		System.out.println("Apakah ada SSID :");
		String SSID = input.next();
		in3.setSSID(SSID);
		input.nextLine();
		System.out.println("Bandwith yang tersedia dalam Ruangan tersebut :");
		String bandwidth = input.nextLine();
		in3.setBandwidth(bandwidth);
		System.out.println("Jumlah CCTV yang terdapat dalam Ruangan :");
		int jmlCCTV = input.nextInt();
		in3.setJmlCCTV(jmlCCTV);
		System.out.println("Kondisi CCTV :");
		String kondisiCCTV = input.next();
		in3.setKondisiCCTV(kondisiCCTV);
		input.nextLine();
		System.out.println("Posisi CCTV dalam Ruangan \n(depan atau belakang)");
		String posisiCCTV = input.next();
		in3.setPosisiCCTV(posisiCCTV);
		}catch(NullPointerException ex){
			System.out.println("error");
		}
	}

//Metod Analisis

double hasil;
double hitungLuas(){
	
	hasil = in2.getPanjangruang() * in2.getLebarruang();
	in2.setHasil(hasil);
	double rasio = in2.getHasil() / in2.getJumlahkursi();
	
	return rasio;
}

@Override
String analisis1() {
	if(in2.getPanjangruang()!=hasil){
		String Persegi="Persegi panjang";
		if(Persegi.equals("Persegi panjang")){
			a=a+1;
		}
	}
	if(in2.getPanjangruang() != in2.getHasil()){
		a=a+1;
	}
	if(hitungLuas() >= 0.5){
		a=a+1;
	}else{
		a=a+0;
	}
	
	if(a<3){
		Result1 = "Tidak Sesuai";
	}else{
		Result1 = "Sesuai";
	}
	return Result1;
}

@Override
String analisis2() {
	if(in3.getJmlStopkontak()>=4){
		b=b+1;
	}
	if(in3.getKondisiStopKontak().equalsIgnoreCase("baik")){
		b=b+1;
	}
	if(in3.getPosisiStopKontak().equalsIgnoreCase("pojok ruang")||in3.getPosisiStopKontak().equalsIgnoreCase("dekat dosen")){
		b=b+1; 
	}

	if(in3.getJmlKabelLCD()>=1){
		b=b+1;
	}
	if(in3.getKondisiKabelLCD().equalsIgnoreCase("berfungsi")){
		b=b+1;
	} //Java.Lang.NullPointerException
	if(in3.getPosisiKabelLCD().equalsIgnoreCase("dekat dosen")){
		b=b+1;
	}
	
	if(in3.getJmlLampu()>=18){
		b=b+1;
	}
	if(in3.getKondisiLampu().equalsIgnoreCase("baik")){
		b=b+1;
	}
	if(in3.getPosisiLampu().equalsIgnoreCase("atap ruangan")){
		b=b+1;
	}

	if(in3.getJmlKipas()>=2){
		b=b+1;
	}
	if(in3.getKondisiKipas().equalsIgnoreCase("baik")){
		b=b+1;
	}
	if(in3.getPosisiKipas().equalsIgnoreCase("atap ruangan")){
		b=b+1;
	}
	
	if(in3.getJmlAC()>=1){
		b=b+1;
	}
	if(in3.getKondisiAC().equalsIgnoreCase("baik")){
		b=b+1;
	}
	if(in3.getPosisiAC().equalsIgnoreCase("belakang")||in3.getPosisiAC().equalsIgnoreCase("depan")){
		b=b+1;
	}
	
	if(in3.getSSID().equalsIgnoreCase("UMM Hotspot")){
		b=b+1;
	}
	if(in3.getBandwidth().equalsIgnoreCase("bisa login")){
		b=b+1;
	}

	if(in3.getJmlCCTV()>=2){
		b=b+1;
	}
	if(in3.getKondisiCCTV().equalsIgnoreCase("baik")){
		b=b+1;
	}
	if(in3.getPosisiCCTV().equalsIgnoreCase("belakang") || in3.getPosisiCCTV().equalsIgnoreCase("depan")){
		b=b+1;
	}else{
		b=b+0;
	}
	
	if(b<20){
		Result2 = "Tidak Seuai";
	}else{
		Result2 = "Sesuai";
	}
	return Result2;
}

void view(){
	
	try{
	PrintStream out = new PrintStream(new FileOutputStream("Database2.adr"));
	System.setOut(out);
	
	out.println("Nama Ruang : "+in1.getNamaR());
	out.println("Lokasi Ruang : "+in1.getLokasiR());
	out.println("Program Studi : "+in1.getProgStudi());
	
	out.println("------------------------------------------------");

	out.println("Luas Ruang : " + in2.getHasil());
	out.println("Rasio Ruang : " +hitungLuas());
	out.println("Nilai Sesuai : "+a);
	out.println("Kesesuaian : "+super.proses1(a, 3) +"%"+" "+analisis1());
	
	out.println("------------------------------------------------");

	out.println("Analisis Kelistrikan : ");
	out.println("Jumlah : " + in3.getJmlStopkontak() + "\t" + "Kondisi : " + in3.getKondisiStopKontak() + "\t" + "Posisi : " + in3.getPosisiStopKontak());
	out.println("Analisis LCD : ");
	out.println("Jumlah : " + in3.getJmlKabelLCD() + "\t" + "Kondisi : " + in3.getKondisiKabelLCD() + "\t" + "Posisi : " + in3.getPosisiKabelLCD());
	out.println("Analisis Lampu : ");
	out.println("Jumlah : " + in3.getJmlLampu() + "\t" + "Kondisi : " + in3.getKondisiLampu() + "\t" + "Posisi : " + in3.getPosisiLampu());
	out.println("Analisis Kipas Angin : ");
	out.println("Jumlah : " + in3.getJmlKipas() + "\t" + "Kondisi : " + in3.getKondisiKipas() + "\t" + "Posisi : " + in3.getPosisiKipas());
	out.println("Analisis AC : ");
	out.println("Jumlah : " + in3.getJmlAC() + "\t" + "Kondisi : " + in3.getKondisiAC() + "\t" + "Posisi : " + in3.getPosisiAC());
	out.println("Analisis Internet : ");
	out.println("SSID :"+in3.getSSID()+"bandwith :"+in3.getBandwidth());
	out.println("Analisis CCTV : ");
	out.println("Jumlah : " + in3.getJmlCCTV() + "\t" + "Kondisi : " + in3.getKondisiCCTV() + "\t" + "Posisi : " + in3.getPosisiCCTV());
	out.println("Nilai Sesuai : "+b);
	out.println("Kesesuaian : "+ super.proses2(b,20)+"%"+" "+analisis2());
	out.println("-----------------------------------------------");
	}catch(IOException ex){
		System.out.println("Error");
	}
	
	
}


}
