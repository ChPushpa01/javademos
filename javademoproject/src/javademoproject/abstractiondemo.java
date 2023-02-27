package javademoproject;

public class abstractiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     N m=new N();
      m.start();
      m.acce();
      }

}
abstract class M{
	void start() {
		System.out.println("Ms Started..");
	}
	abstract void acce();
	
}
class N extends M{
	void acce() {
		System.out.println("Ms acc.");
	}
}

