package ALLPROGRAM;

class course {
	
	String coursename = "JFS";
	String instructor = "Mohana priya";
	int cerdits = 8;
	
	
	public void display() {
		
		System.out.println("course name : " + coursename + "\n instructor :" + instructor + "\n cerdits : " + cerdits );
	}
}

class onlinecourse extends course{
	
	 String platform = "online";
	 String Duration = "3 month";
	 
	 public void display1() {
		 
		 if(coursename.equals("JFs") && Duration == " 3 month ") {
			 
			 System.out.println("This course is eligible for certificate");
			 
		 }
			 else {
				 
				 System.out.println("this course is not eligible for certificate");
			 }
			 
			 
		 }
		 
		 
	 }


public class inheritancetask2 {
	
	public static void main(String[]args) {
		
		onlinecourse obj = new onlinecourse();
		
		obj.display();
		obj.display1();
	}

}
