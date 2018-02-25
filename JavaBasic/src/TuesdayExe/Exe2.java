package TuesdayExe;

public class Exe2 extends InheritanceExe {

	int agst = 12;
	
	public void printGst()
	{
		System.out.println(agst);
		
	}
	
	public static void main(String[] args) {
		Exe2 e2 = new Exe2();
		e2.printGst();
		
		StaticTest st = new StaticTest();
		st.test();
		
					
	}
	
	
	

}
