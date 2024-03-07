package example2;

class B {							
	public void m() {							
		System.out.println("In B.");					
	} 											
}

class C extends B {
	@Override
	public void m() {
		System.out.println("In C.");
		super.m();
	}
}

public class Example2 {
	public static void main(String[] args) {
		B obj = new B();   
		B obj2 = new C();
		obj.m();
		obj2.m();
	}	
}