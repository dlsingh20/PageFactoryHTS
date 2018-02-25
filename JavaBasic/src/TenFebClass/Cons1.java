package TenFebClass;

public class Cons1 {
/*			A constructor doesn’t have a return type.
			* The name of the constructor must be the same as the name of the class.
			* Unlike methods, constructors are not considered members of a class.
			* A constructor is called automatically when a new instance of an object is created.
*/
	/*
	 * If you do not provide a constructor for a class, 
	 * Java will automatically create a default constructor that has no parameters and doesn’t initialize any
	 *  fields. This default constructor is called if you specify the new keyword without passing parameters.
	 *  
	 *  There are two types of constructors in java:
Default constructor (no-arg constructor)
Parameterized constructor
Default Constructor: when it doesn't have any parameter.
Default constructor: provide the default values to the object like 0, null etc. depending on the type.

	 */
	
	Cons1(int id, String name)
	{
		System.out.println(id+" "+name);
	}
	
	public String test()
	{
		System.out.println("Testing Constructor Test");
		return "test";
	}

	public static void main(String[] args) {
		Cons1 c1 = new Cons1(20,"Raj");
		Cons1 c2 = new Cons1(30, "Deep");
		//c1.test();
	}
}