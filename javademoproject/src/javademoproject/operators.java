package javademoproject;
import java.util.Scanner;
public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
      Integer a=8;
      Integer b=sc.nextInt();
      //arthimatic operators
      System.out.println(a+b);
      System.out.println(a-b);
      System.out.println(a*b);
      System.out.println(a%b);
      //conditional operators
      System.out.println(a>b);
      System.out.println(a<b);
      System.out.println(a!=b);
      System.out.println(a==b);
      //increment and decrement operators 
      //unary operators
      System.out.println(a++);
      System.out.println(++a);
      System.out.println(b--);
      System.out.println(--b);
      //ternary operator
      int r=(a>5)?6:8;
      System.out.println(r);
      //logical operators   && and ||
      int li=18;
      String dr="yes";
      if ( li>=18 && dr=="yes")
      {
    	  System.out.println("License Issused");
      }
      else
      {
    	  System.out.println("come back");
      }
      int f=9;
      int g=7;
      if ( f>=1 || g>=1)
      {
    	  System.out.println("positive number");
      }
      else
      {
    	  System.out.println("none of them are positive");
      }
      //boolean
      boolean isSelected=true;
      if(isSelected == false)
      {
    	  System.out.println("yes");
      }
	}

}
