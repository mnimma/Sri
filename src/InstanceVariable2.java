
public class InstanceVariable2 {

	int a = 50; // instance variable
	int b = 10;

	public void m1() {
		System.out.println("It is M1 Method");
		System.out.println(a);
	}

	public void m2() {
		System.out.println("It is M2 Method");
		System.out.println(b);
	}

	public void m3()

	{
		System.out.println("It is M3 Method");
	}

	public static void main(String[] args) {
		InstanceVariable2 r = new InstanceVariable2();

		r.m1();
		r.m2();
		r.m3();

	}
}
