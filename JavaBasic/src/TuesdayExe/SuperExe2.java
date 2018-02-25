package TuesdayExe;

public class SuperExe2 extends SuperExe1 {

	int i=20;
	public void print()
	{
		System.out.println("Child Class");
		System.out.println(super.i);
		
	}
	
	public void p2()
	{
		super.p2();
	}
	
	public static void main(String[] args) {
		SuperExe2 s2 = new SuperExe2();
		s2.print();
		

	}

}
