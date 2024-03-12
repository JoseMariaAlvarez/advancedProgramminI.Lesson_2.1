package dynamicBinding.OneTwoThreeFour2;

class One {
	public int test() { return 1; }
	public int result1() { 
		return this.test(); 
	}
}

class Two extends One {
	public int test() { return 2; }
}

class Three extends Two {
	public int result2() { return this.result1(); }
	public int result3() { return super.test(); }
	public int test() { return 3; }
}

class Four extends Three {
	public int test() { return 4; }
}

class MyTest {
	public static void main(String [] args) {
		Three obj3 = new Three();
		Four  obj4 = new Four();
		System.out.println("obj3.test()    = " + obj3.test());
		System.out.println("obj3.result2() = " + obj3.result2());
		System.out.println("obj3.result3() = " + obj3.result3());
		System.out.println("obj4.result1() = " + obj4.result1());
		System.out.println("obj4.result2() = " + obj4.result2());
		System.out.println("obj4.result3() = " + obj4.result3());
	}
}