package control_statement;

public class Nested_if_else {

	public static void main(String[] args) {

		String UN="Velocity";
		String PWD="123";
		
		if (UN=="elocity") 
		{
			
			System.out.println("Correct Username plz enter password ");
			
			if (PWD=="1234")
			{
				
				System.out.println("Login successful");
				
			} 
			else
			{
				System.out.println("Wrong password, plz check password");

			}
		}
		 else 
		 {
			System.out.println("Incorrect username, unable to login");

		}
		

	}



		
		
	}


