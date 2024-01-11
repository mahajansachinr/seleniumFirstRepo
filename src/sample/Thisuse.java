package sample;

public class Thisuse {

	int a=10;
     int b=20;
     	static int z=30;

	
	public static void main(String[] args) {
		
		Thisuse t=new Thisuse();
		t.display();

	}
	
	public void display()
	{
		int a=100;
		int b=200;
		int z=300;
		System.out.println("value is " +a);
		System.out.println(this.a);
		
         System.out.println(this.z);
}

}