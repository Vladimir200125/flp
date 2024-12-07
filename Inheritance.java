class A {
	int a = 5;
	void showA() {
		System.out.println("Значение a:"+a);
	}
	int addA() {
		a+=1;
		return a;
	}

}

class B extends A {
	int b = 10;
	int addB() {
		b+=1;
		return b;
	}

}
class C extends A {
	int c = 20;
}
class Inheritance {
	public static void main(String[] args) {
		A objA = new A();
		B objB = new B();
		objA.showA();
		objB.showA();
		objA.addA();
		objB.addA();
		objA.showA();
		objB.showA();
		objB.addB();
		System.out.println("Значение b:" + objB.b);
		
				
	}

}
	

