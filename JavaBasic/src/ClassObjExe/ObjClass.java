package ClassObjExe;

public class ObjClass {

	public static void main(String[] args) {
	
		Class1 deen;
		deen = new Class1();
		deen.name="Deen Dayal Singh";
		deen.BasicPay=5000;
		deen.da=2000;
		deen.hra=2500;
		deen.calPay();
		
		
		System.out.println("Total pay of "+deen.name +": "+deen.totalPay);
		
		Class1 amita = new Class1();
		amita.name="Amita Sharma";
		amita.BasicPay=8000;
		amita.da=3000;
		amita.hra=5000;
		amita.calPay();
		
		System.out.println("Total Pay of "+amita.name+": "+amita.totalPay);
	}
}
