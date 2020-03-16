
public class StaticVariable2 {

	static int x = 10; // static variable
	int y = 10;

	public StaticVariable2() {
		x++;
		// y++;

		System.out.println(x);
		// System.out.println(y);
	}

	public static void main(String args[]) {

		StaticVariable2 r1 = new StaticVariable2();

		StaticVariable2 r2 = new StaticVariable2();

		StaticVariable2 r3 = new StaticVariable2();

	}

}
