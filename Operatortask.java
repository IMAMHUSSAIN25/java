package javaproject;

public class Operatortask {
	public static void main(String[] args) {
		int a=20;
	    int b=30;
	    int c=40;
	    //relational operators
	  
	    System.out.println("Relationaloperators: ");
	    
	    System.out.println("a==b: "  +(a==b)); //equal to;
	    
	    System.out.println("a!=c: "  +(a!=b)); //not equal to
	    
	    System.out.println("c>a:  "  +(c>a));  //Greater than
	    
	    System.out.println("a<b: "   +(a<b));  //lesser than
	    
	    System.out.println("a>=c: "  +(a>=c)); //greater then or equal to
	    
	    System.out.println("b<=a: "  +(b<=a)); //lesser than or equal to
	    
	    
	    //logic operators
	    System.out.println("/nlogic operators");
	    System.out.println("(a>b)&&(c>a): " +((a>b)&&(c>a))); //logic And
	   
	    System.out.println("(a<b)||(c>a): " +((a<b)||(c>a))); //logic Or
	    
	    System.out.println("!(a<b): " +!(a<b));        //logic not
		}
	}

