package myfirstjavaproject;

public class MyFirstJavaClass {

	static int e; // class level var or global variable or static variable

	public static void main(String a[]) {
		System.out.println("heyyyaaaa folks.....");
		System.out.println("welcome to JAVA programming");
		System.out.println(e);
		/*
		 * Data Types ----------- type size default value byte - 1byte - 0 short
		 * - 2bytes - 0 int - 4bytes - 0 long - 8bytes - 0
		 * 
		 * float - 4bytes - 0.000f double - 8bytes - 0.000d // java reads all
		 * the decimal values as double by default
		 * 
		 * char - 2bytes - '\u0000' -> uni-code character set
		 * 
		 * boolean - 1byte - false
		 */

		int x = 0;
		System.out.println(x);

		float f = 23.5f;

		double d = 23.5;

		/*
		 * Type casting Implicit -> where the smaller type is been converted to
		 * larger by the java automatically explicit -> where the larger type is
		 * been converted to smaller types explicitly by the programmer.
		 */

		char c = 'd';
		System.out.println(c);
		int z = c; // Implicit casting
		System.out.println(z);
		z++;
		c = (char) z;
		System.out.println(c);

		long l = 12333344l;
		System.out.println(l);

	}

	public void hello() {
		System.out.println(e);
	}

}

class A {

}

class B {

}

class C {

}