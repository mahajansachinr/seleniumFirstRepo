package collectionUse;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();

		boolean a = al.add("Pune");
		System.out.println(a);
		System.out.println(al);

		al.add("Mumbai");
		al.add("Aurangabad");
		System.out.println(al);
		// al.clear();
		// System.out.println(al);
		Object alnew = al.clone();
		System.out.println("new clone List :" + alnew);

		// contains
		boolean a3 = al.contains("Pune");
		System.out.println(" Contains o/p is: " + a3);
		System.out.println("ArrayList is: " + al);
		// equal
		boolean a4 = al.equals(alnew);
		System.out.println("equal op is : " + a4);

		Object a5 = al.get(2);
		System.out.println("get OP is : " + a5);

		int a6 = al.indexOf("Mumbai");
		System.out.println("index is : " + a6);

		// al.clear();
		boolean a7 = al.isEmpty();
		System.out.println("is empty o/p is : " + a7);

		// Object a8=al.remove(1);
		// System.out.println("remove o/p is :" +a8);

		Object a9 = al.set(1, "Kalyan");
		System.out.println("set o/p is : " + a9);
		System.out.println(al);

		int a10 = al.size();
		System.out.println("ArrayList Size is: " + a10);

	}

}
