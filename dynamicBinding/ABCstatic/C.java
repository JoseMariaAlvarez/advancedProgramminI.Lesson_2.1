package dynamicBinding.ABCstatic;

class A {
	static void f() {
		System.out.println("A");
	}
	void g() {
		f(); //call to a static method
	}
}
class B extends A {
	static void f() {
		System.out.println("B");
	}
}
public class C {
	public static void main(String[] args) {
		A a = new B();
		a.g();
		a.f();
	}
}