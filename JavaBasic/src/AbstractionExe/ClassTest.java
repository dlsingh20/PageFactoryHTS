package AbstractionExe;

public class ClassTest extends AbClass1 {

	public static void main(String[] args) {
		ClassTest ct = new ClassTest();
		ct.run();

	}
	void run() {
		System.out.println("First Run Method");		
	}
	void ShareUserDetails(String str)
	{
		System.out.println("Testing");
	}
	

}