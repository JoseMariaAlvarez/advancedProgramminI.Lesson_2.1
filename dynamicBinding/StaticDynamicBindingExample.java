// Static of dynamic binding for
// instance and class variables and methods
package dynamicBinding;

class A {
	static String sV = "SA"; // class variable
	char iV = 'A'; // instance variable
	static String sM() {  // class method
		return "SA()";
	}
	String lM() {  // instance method
		return "A()";
	}
}
class B extends A {
	static String sc = "SB"; // class variable
	char c = 'B'; // instance variable
	static String sc() {  // class method
		return "SB()";
	}
	String lM() {  // instance method
		return "B()";
	}
}
public class StaticDynamicBindingExample {
	public static void main(String[] args) {
		A p = new A();
		B s = new B();
		A t = s;
// Class variables should be accessed using the class (A.sv)
		System.out.println("Class variables: " + p.sV + " " + s.sc + " " + t.sV);
		System.out.println("Instance variables: " + p.iV + " " + s.c + " " + t.iV);
// Class methods should be accessed using the class (A.sM())
		System.out.println("Class methods: " + p.sM() + " " + s.sc() + " " + t.sM());
		System.out.println("Instance Methods: " + p.lM() + " " + s.lM() + " " + t.lM());
	}
}