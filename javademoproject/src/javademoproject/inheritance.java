package javademoproject;

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     c j=new c();
	}
}
class a{
	a(){
		   System.out.println("a");
	}
}
class b extends a{
	b(){
		System.out.println("b");
	}
}
class c extends b{
	c(){
		System.out.println("c");
	}
}


