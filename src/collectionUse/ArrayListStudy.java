package collectionUse;

import java.util.ArrayList;

public class ArrayListStudy {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		System.out.println("size is :" + al.size());
		al.add("Velocity");
		al.add('@');
		al.add("Pune");
		al.add(123);
		al.add(true);
		al.add(12.12f);
		al.add("  ");
		System.out.println(al);

		System.out.println(al.size());

	}

}
