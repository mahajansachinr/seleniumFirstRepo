package collectionUse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorUse {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(3);
		al.add(4);
		al.add(5);
		
		System.out.println(al);
		
		
		 Iterator<Integer> it = al.iterator();
		 
		//Integer net = it.next();
//		System.out.println("==" +it.next());
//		System.out.println("=="  +it.next());
//		System.out.println("==" +it.next());
//		System.out.println("=="  +it.next());
//		System.out.println("==" +it.next());
//		System.out.println("=="  +it.next());
//		//System.out.println("==" +it.next());
//		//System.out.println("=="  +it.next());
//		
//		
//		
//		System.out.println(it.hasNext());
		 
		 while(it.hasNext()) 
		 
		 {
			 
			 System.out.println(it.next());
			 
		 }
		 
		
		System.out.println("============Using ListIterator============"); 
		 
		 ListIterator<Integer> li = al.listIterator();
		 
		 while(li.hasNext()) {
			 
			 System.out.println(li.next());
			 
		 }
		 System.out.println("previous list "+li.previous());
		 System.out.println("previous list "+li.previous());
		 System.out.println("previous list "+li.previous());
		 
		 while(li.hasPrevious()) {
			 
			 System.out.println("reverse list : " +li.previous());
			 
		 }
		 
		 
		
	}

}
