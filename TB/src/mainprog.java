
public class mainprog {

	public static void main(String args[]) {
	
		control data1 = new control();
		control2 data2 = new control2();
		control3 data3 = new control3();
		
		data1.masukan();
		data2.masukan();
		data3.masukan();
		
		data1.View();
		
		data2.hitungLuas();
		data2.AnalisisKelistrikan();
		data2.AnalisisLCD();
		data2.AnalisisLampu();
		data2.AnalisisKipasAngin();
		data2.AnalisisAC();
		data2.AnalisisInternet();
		data2.AnalisisCCTV();
	
		data3.view();
	}
}
