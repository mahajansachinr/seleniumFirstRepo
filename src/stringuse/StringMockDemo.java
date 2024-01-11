package stringuse;

public class StringMockDemo {
	public static void main(String[] args) {

		String s = "Velocity";
		String s1 = "Velocity";
		String s2 = "velocity";
		String s3 = new String("Velcoity");
		String s4 = new String("Velocity");
		String s6 = new String("   ");
		
		boolean sm1 =s6.isEmpty();
		System.out.println("op is:: " +sm1);
		

		int lngth = s.length(); // 1) length()
		System.out.println("1) The length of  string Velcity is = " + lngth);

		String u = s.toUpperCase(); // 2) upperCase()
		System.out.println("2) Upper case string for Velocity is = " + u);

		String l = s.toLowerCase(); // 3) lowerCase()
		System.out.println("3) Lower case for Velocity is =" + l);

		Boolean eql = s.equals(s1); // 4) equals() --here we check/compare the contains of two different string
								// variables
		System.out.println("4) is String 1 is equal to string 2 ? =" + eql);

		boolean b1 = (s == s1);// 5) equal(==) operator --here we checked the memory location of two different
							// strings and if both have same memory location then o/p is true otherwise it is false.
							// String s and s1 have same contain and both point to constant pool area memory
							// location there fore o/P is true

		System.out.println("5) checked s == s1 is :-  " + b1);
		boolean b2 = (s == s3); // here contain of both string is same but both point to different memory
								// location therefore o/p is false.

		System.out.println(" - checked string s ==s3  is:- " + b2);

		boolean b3 = s.equalsIgnoreCase(s2); // here it will ignore the case sensitivity only but contains of both
											// string should be matched (Except small/capital letters)
		System.out.println("6) Equal ignorecase  method o/p is :-  " + b3);

		boolean b4 = s3.equalsIgnoreCase(s4); // here both string have different memory location there for o/p is false
		System.out.println("--equalIgnorecase o/p is :-" + b4);

		boolean b5 = s.contains("Vel");// here we checked provided sequence or character is present in String or not.
		System.out.println("7) contains method o/p is :- " + b5);

		boolean empt = s1.isEmpty();// here we checked the given sequence is empty or not here space also consider
									// means if space or _ is present in string then o/p is false.
		System.out.println("8) Empty method use :-" + empt);

		boolean blnk = s6.isBlank();// here we checked that given string is blank or not.here space is also consider as
									// blank.
		System.out.println("9) Blank method use :- " + blnk);

	String sm = "India is my country";

		char charat = sm.charAt(6); // this method returns the character for provided index
	System.out.println("10) charAt method use :- " + charat);

		boolean end = sm.endsWith("my country");// it checks the what ever sequence or character we have provided if it
												// is matched or not
		System.out.println("11) endsWith method use :- " + end);

		boolean str = sm.startsWith("India"); // here starting char/ string sequence is only checked if matched then
												// return true
												// this method is case sensitive.
		System.out.println("12) startWith method use :- " + str);

		boolean stroffset = sm.startsWith("y", 10);// in startWith offset method it will start to check from provided
													// index sequence.
		System.out.println("13) start with method use :-" + stroffset);

	String substr = sm.substring(5);// this method will return the string sequence from provided index
		System.out.println("14) substring method use :-" + substr);

		String a = "FirstName";
		String b = "LastName";
		String conct = a.concat(b);// add/join two or more sequence in one string
		String concat1 = a + " middle name ".concat(b);
		System.out.println("15) add two string using concat method :- " + concat1);
		System.out.println("  --" + a.concat(" ").concat("Middle name ").concat(b));
		
		String m="i am in tension";
		int indx = m.indexOf("am");// it will return the index of provided string/character
		int ind=m.indexOf('i', 6);// ya made i cha index value to 5th position/index nanter count karnar. 
		System.out.println("16) indexOf Method use : "+indx);
		System.out.println(" ---indexOf Method use with starting index number  : "+ind);
		
		String prn ="i am engineer";
		String repl=prn.replace("engineer", "software Test engineer");
		
		System.out.println("17) replace use : " +repl );
	
		String sp = "I_love_my_India";    //18) split method
		
		System.out.println("18) Split method use");
		String st[] = sp.split("_");
		for (int i = 0; i <= sp.length()-1; i++) {
			
		System.out.println( st[i]);
	}

	}}

