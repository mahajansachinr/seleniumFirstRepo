package polymorphism;

public class PolymorphismStudy {

	public static void main(String[] args) {

		PolymorphismStudy pt=new PolymorphismStudy();
		pt.addition();
		pt.addition(100, 200);
	}
	
	public void addition() 
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Addition is " +sum );
		
	}
	
	public void addition(int a,int b)
	{
	int sum=a+b;
	System.out.println("summation with parameter is "+sum);
	}

}
