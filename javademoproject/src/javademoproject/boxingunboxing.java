package javademoproject;

public class boxingunboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i=1;
       Integer j=8;
       //wrapper type datatype with caps lock
       byte b=6;
       Byte c=9;
       
       // boxing - automatic conversion of primitive to wrapper type
       Integer r=9;
       //unboxing - conversion of the wrapper type to primitive type
       Integer a1=new Integer(30);
       int a2=a1;
       
       System.out.println(a2);
       
       //automatic comparing here
       Integer f=8;
       if (f>5)
       {
    	   System.out.println(f);
       }
	}

}
