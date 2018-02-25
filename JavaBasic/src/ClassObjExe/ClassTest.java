package ClassObjExe;

public class ClassTest 
{
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void add(String fName, String LName)
	{
		System.out.println(fName+LName);
	}
	
	public void add(int a, int b, int c, int d)
	{
		System.out.println(a+b+c+d);
	}
	

	public static void main(String[] args) {
		ClassTest ct = new ClassTest();
		ct.add(2, 3, 5, 7);
		ct.add("Deen", "Singh");
		
	}

}
