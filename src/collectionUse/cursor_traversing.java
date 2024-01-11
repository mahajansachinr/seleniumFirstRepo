package collectionUse;

import java.util.ArrayList;
import java.util.Iterator;

public class cursor_traversing {

	public static void main(String[] args) {
		
		 ArrayList<Integer> al=new ArrayList<>();
	
			al.add(1);
			al.add(2);
			al.add(4);
			al.add(3);
			al.add(3);
			al.add(5);
			
			//System.out.println(al);
			
//			for (int i=0;i<=al.size()-1;i++)
//			{
//				System.out.println(al.get(i));
//			
//			}
//			
			for ( Integer a:al) 
			{
				System.out.println(a);
				
			}
			System.out.println("===========================");
			Iterator<Integer> it = al.iterator();
			
			Integer a1 = it.next();
			System.out.println(a1);
			System.out.println(it.next());
			System.out.println(it.next());
			System.out.println(it.next());
			System.out.println(it.next());
			System.out.println(it.next());
			System.out.println(it.next());
			
			
			

	}

}
