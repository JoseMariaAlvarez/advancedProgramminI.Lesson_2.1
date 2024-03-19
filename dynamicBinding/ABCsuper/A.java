package dynamicBinding.ABCsuper;

class B {							
	public void m() {							
		System.out.println("In B.");					
	} 											
} 												


class C extends B {
	public void m() {
		System.out.println("In C.");
		super.m();
	}
}

public class A {
	public static void main(String[] args) {
		B obj = new B();   
		B obj2 = new C();
		obj.m();
		obj2.m();
	}	
}