package TuesdayExe;

public class StaticTest 
{
	
	public static void main(String[] args) {
	
		test();
	}
	
	public  static void test() 
	{
		try {
			int i=10/0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
/*
 
	 •	Exception Handling (try catch)
Checked Exception:Complile Time
UnChecked Exception: Run Time
•	Inheritance
•	Method Overriding
this keyword
Super, 
Static, 
static 

*/

}
