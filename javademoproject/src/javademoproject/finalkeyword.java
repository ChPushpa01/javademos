package javademoproject;

public class finalkeyword {

	public static void main(String[] args) {
		final int z=8;
		// cant change the value of z anymore
		B b=new B();
		b.dosome();
	}
}
class A {
	//final method
	final void dosome() {
		System.out.println("hi");
	}
}
class B extends A{
	// void 
	// gives error cause Class A have final dosome 
}