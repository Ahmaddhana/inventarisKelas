import java.util.Scanner;

abstract public class supercontrol implements interfaceClass {

	Scanner input = new Scanner(System.in);
	
	//Instance Variable
	String Result1,Result2;
	String val1,val2,val3,val4,val5,val6,val7,val8,val9,val10,val11,val12,val13,val14,val15,val16,val17,val18,val19,val20;
	double a=0,b=0;
	

	//Abstract method
	abstract String analisis1();
	abstract String analisis2();
	
	//Implements from interface class
	
	
	
	public double proses1(double totTrue1,double jmlData1){
		double persen = 0 ;
		persen=totTrue1/jmlData1*100;
		return persen;
	}
	
	public double proses2(double totTrue2,double jmlData2){
		double persen = 0 ;
		persen=totTrue2/jmlData2*100;
		return persen;
	}
}
