package AbstractionExe;

public class Draw implements Showable, Printable {

	public void print() {
		System.out.println("Printing");
	}
	public void show() {
		System.out.println("Showing");
	}
	public static void main(String[] args) {
		Draw d = new Draw();
		d.show();
		d.print();
	}
}