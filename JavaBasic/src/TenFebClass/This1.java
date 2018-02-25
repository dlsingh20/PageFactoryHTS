package TenFebClass;

public class This1 
{
	/*
	 * Final: 
	 * Variable: Value can't be changed
	 * Method: Method can't be Override
	 * Class: Class can't be inherited
	 * 
	 *  Finally:
	 *  Part of Try/Catch/Finally
	 *  
	 *  Finalize:
	 *  Finalize is used to perform clean up processing just before object is garbage collected.
	 */
	
	int a, b;
	public void test(int a, int b)
	{
	try {
	//ssssssssssssss	
		///ddddddddd
		//ddddddddddddddd
	} catch (Exception e) {
		//ddddd
	}finally {
		
	}
		this.a=a;
		this.b=b;
	}
	
	public void show()
	{
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
		This1 t1 = new This1();
		t1.test(10, 20);
		
		t1.show();

	}

}
