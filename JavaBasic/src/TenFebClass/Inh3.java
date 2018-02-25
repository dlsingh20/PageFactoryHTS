package TenFebClass;

public class Inh3 extends Inh2 {
int i=25;

public void test()
{
	
}
public void t2()
{
	System.out.println(super.i);
}
	public static void main(String[] args) {
	Inh3 i3 = new Inh3();
	Inh1 i = new Inh1();
			
	//i3.t();
	//i3.test();
		//i.t2();
	}

}
