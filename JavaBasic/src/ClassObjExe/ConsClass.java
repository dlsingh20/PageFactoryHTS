package ClassObjExe;

public class ConsClass 
{
	ConsClass()
	{
		System.out.println("Default Constructor");
		
	}
	
	ConsClass(int basicPay, int hra)
	{
		int totPay = basicPay+hra;
		System.out.println(totPay);
	}
	public static void main(String[] args) {
		ConsClass cc = new ConsClass();
		ConsClass ccc = new ConsClass(2000, 3000);

	}

}
