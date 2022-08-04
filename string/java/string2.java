package packager.string.java;
import java.io.*;
public class string2 {






	public static void main(String[] args)
	{



		StringBuffer s = new StringBuffer("hello world");

		int p = s.length();

		int q = s.capacity();


		System.out.println("Length of string is="
				+ p);
		System.out.println(
				"Capacity of string bye=" + q);
	}
}

