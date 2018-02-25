package TenFebClass;
/*
 * 	Inheritance is a mechanism in which one class acquires the property of another class.
 *  For example, a child inherits the traits of his/her parents.
	Extends Keyword is used.

 */

/*
 *1.Single Inheritance:
In Single Inheritance one class extends another class (one class only).

2. Multiple Inheritance:
In Multiple Inheritance, one class extending more than one class. Java does not support multiple inheritance.
Can he achieve through Interface

3. Multilevel Inheritance:
In Multilevel Inheritance, one class can inherit from a derived class. 
Hence, the derived class becomes the base class for the new class.

Super: Super keyword refers to the object of Parent Class
This: This keyword refers to the current class object

 */
public class Inh1 
{	
	int i=10;
	
	public void test()
	{
		System.out.println("Parent Class");
	}
}
