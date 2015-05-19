
public class mainprog {

	public static void main(String args[]) {
	
		control1 data1 = new control1();
		control2 data2 = new control2();
		control3 data3 = new control3();
		
		data1.masukan();
		data1.hitungLuas();
		data1.analisis1();
		data1.analisis2();
		data1.View();
		
		data2.masukan();
		data2.analisis1();
		data2.analisis2();
		data2.View();
		
		data3.masukan();
		data3.analisis1();
		data3.analisis2();
		data3.View();
	}
}
