package control_statement;

public class ifUse {

	public static void main(String[] args) {
		
		int mark=60;
		
		{
			if (mark>60)
			{
			System.out.println("You are pass");
			}
			else if (mark<=40)
			{
				System.out.println("You are fail");
				
			}
			else if(mark <50 && mark > 60)
			{
				System.out.println("enjoy for next year");
			}
			
			else
			{
				System.out.println("do study");
			}
		}
		
	}

}
