package constructoruse;

public class CS1 {
	
	//default constructor  
	public static void main(String[] args) {

	CS1 c=new CS1();// step2,here we create object of class
				c.display(); //step 3 ,here we called non static method
		display1(); // we can call static method directly.
		
	}
	
	public  void display() //step1,non static method ,not able to call in main method for that we have to create object of class
	{
		System.out.println("i am from display method i am non static");
	}
	public static void display1()//static method 
	{
	System.out.println("i am from display01 method static method");	
	}
}
