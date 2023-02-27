package javademoproject;

public class methodoverridingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       truck t=new truck();
       t.fuel();
       
       bike b=new bike();
       b.fuel();
	}

}
class vechicle{
	void fuel() {
	
		System.out.println("fuel/petrol");
	}
}
class bus extends vechicle{
	void fuel() {
		System.out.println("petrol");
	}
}
class bike extends vechicle{
	void fuel() {
		System.out.println("petrol");
	}
}
class truck extends vechicle{
	
}
