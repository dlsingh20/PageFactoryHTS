package TuesdayExe;

public class ThisExe 
{
	int a=5;
	int b=6;
	
	
	
	public  void test(int a, int b) 
	{
		this.a=a;
		b=b;
		System.out.println(a+b);
	}
	public void test2()
	{
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		ThisExe te = new ThisExe();
		te.test(10,15);
		te.test2();

	}

}
