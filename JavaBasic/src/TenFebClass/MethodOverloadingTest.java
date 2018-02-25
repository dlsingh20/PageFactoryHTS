package TenFebClass;

public class MethodOverloadingTest 
{
	/*
	 * Method Overloading:
Multiple methods having same name but different in parameters, called Method Overloading.

Method Overloading can be performed in two ways:
By changing number of arguments/Parameter
By changing the data type

	 */
	
	public void test(int id1, int id2 )
	{
		System.out.println(id1+id2);
	}
	
	public void test(int id1, int id2, int id3)
	{
		System.out.println(id1+id2+id3);
	}
	

	public static void main(String[] args) {
		MethodOverloadingTest MO = new MethodOverloadingTest();
		MO.test(2, 5, 7);
	}

}
