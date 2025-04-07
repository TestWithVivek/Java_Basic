package Java;

public class Java_Methods {
	
	
	public static void main(String[]args) {
		
		System.out.println("This is my Main Method");
		
		MyStaticMethod();
		
		Java_Methods js= new Java_Methods();
		
		js.MyNonStaticMethod();
		
		
	}
	
	
	public static void MyStaticMethod() {
		
		System.out.println("This is Static Method");
			
			
		
	}
	
	
	public void MyNonStaticMethod() {
		
		System.out.println("This is my Non-static method");
		
	}
	

}
