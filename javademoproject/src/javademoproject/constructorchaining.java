package javademoproject;

public class constructorchaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      childclass cc=new childclass();
      cc.c();
      parentclass pc=new parentclass(10);
       
	}

}
class parentclass{
	int x;
	 parentclass(){
		    
			System.out.println("pc1");
		
	}
	parentclass(int x){
		
			this.x = x;
			System.out.println("pc2");
		
	}
}
class childclass extends parentclass{
	void c() {
		System.out.println("cc");
	}
}
