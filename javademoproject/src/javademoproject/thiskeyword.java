package javademoproject;

public class thiskeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      university u=new university(0, 0);
      u.cls();
	}

}
class school{
	int a;int b;
	void cls() {
		System.out.println("in sch");
	}
}
class university extends school{
	int c,d;
	university(int c,int d){
		this.c=c;
		this.d=d;
	}
	void cls() {
		super.cls();
		System.out.println("in uni");
	}
}