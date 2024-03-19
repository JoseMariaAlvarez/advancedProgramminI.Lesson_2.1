package dynamicBinding.example1;

class A {
	char c = 'A'; // instance variable
}

class B extends A {
	char c = 'B'; // instance variable
}

public class Example1 {

	public static void main(String[] args) {
		A p = new A();
		B s = new B();
		A t = s;
		System.out.println(p.c);
		System.out.println(s.c);
		System.out.println(t.c);
	}
}