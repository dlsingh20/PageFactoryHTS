
public class ForExe {

	public static void main(String[] args) {
		//ForExe.fortest();
		//ForExe.triangle();
		ForExe.triangle2();
	}
	
	public static void fortest()
	{
		int table = 25;
		for(int i=1;i<=10; i++)
		{
			int tab = table*i;
			System.out.println(tab);
		}
	}
	
	public static void triangle()
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	public static void triangle2()
	{for(int i=1; i<=5; i++)
	{
		for(int j=5; j>=i; j--)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
		
	}
	
	/*
	 1
* * * * *
* * * *
* * * 
* * 
* 
2
*
* *
* * *
* * * *
* * * * *
3
        *
      * *
    * * *
  * * * *
* * * * *
4
* * * * *
  * * * *
    * * *
      * *
        *

5. 

    *
  *   *
 *  *  * 
*  *  *  *


*/
}
