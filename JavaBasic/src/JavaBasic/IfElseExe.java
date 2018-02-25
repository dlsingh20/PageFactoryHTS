package JavaBasic;

public class IfElseExe {

	public static void main(String[] args) {
		//ifElse();
		ifElseString();
		
	}
	
	public static void ifElse()
	{
		int a=16;
		int b=16;
		
		if(a==b)
		{
			System.out.println("A and B are equal");
		}else if(a>b)
		{
			System.out.println(a-b);
		}		
		else {
			System.out.println(b-a);
		}
		
	}
	
	public static void ifElseString()
	{
		String ExpTitle = "My Name is Deenu";
		String ActTitle = "My Name is Deenu";
		
		String aa = ExpTitle;
		System.out.println(aa);
		
		if(ExpTitle.equalsIgnoreCase(ActTitle))
		{
			System.out.println("Equals");
		}
		
	}
	
	
	
}
