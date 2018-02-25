package TenFebClass;

public class Inh2 extends Inh1
{
	int i=15;
	int j=20;
	public void t()
	{
		System.out.println(super.i);
	}
	
	public void test()
	{
		System.out.println("Child Class");
	}
	
	public static void main(String[] args) {
		Inh2 i2 = new Inh2();
		//i2.test();
		i2.t();
	}

}
