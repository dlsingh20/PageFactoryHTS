package TuesdayExe;

public class Exe3 extends Exe2 {
	int cgst = 18;
	public void cgst()
	{
		System.out.println(cgst);
		//System.out.println(sgst);
		System.out.println(gst);
	}

	public static void main(String[] args) {
		Exe3 e3 = new Exe3();
		e3.printGst();
		//e3.sgst();
		e3.cgst();

	}

}
