
public class mainprog {

	public static void main(String args[]) {
	
		control2 data1 = new control2();
		control1 data2 = new control1();
		control3 data3 = new control3();
		
		data1.masukan();
		data1.prosesLingkungan();
		data1.prosesKebersihan();
		data1.proses1();
		data1.proses2();
		
		data2.masukan();
		
		data2.view();
		data1.View();
		
		data2.AnalisisJKPSarana();
		data2.hitungLuas();
		data2.proses1();
		data2.proses2();
		
		data3.view();
		data3.masukan();
		data3.analisiskemanan();
		data3.analisiskenyamanan();
		data3.proses1();
		data3.proses2();
	}
}
