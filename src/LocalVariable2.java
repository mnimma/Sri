
public class LocalVariable2 {

	public void m1() {
		int a = 10;
		System.out.println("It is M1 Method");
		System.out.println(a);
	}

	public void m2() {
		System.out.println("It is M2 Method");
		// System.out.println(a);
	}

	public void m3()

	{
		System.out.println("It is M3 Method");
	}

	public static void main(String args[])

	{
		LocalVariable2 r = new LocalVariable2();

		System.out.println("Hai");
		r.m1();
		r.m2();
		r.m3();
	}

}
