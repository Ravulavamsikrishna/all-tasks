package packager.serilization.java;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class task1  implements java.io.Serializable{




	public int a;
	public String b;


	public task1(int i, String string) {
		
	}


	public void Demo(int a, String b)
	{
		this.a = a;
		this.b = b;
	}

}

class Test
{
	public static void main(String[] args)
	{   
		task1 object = new task1(1, "geeksforgeeks");
		String filename = "file.ser";


		try
		{   

			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);


			out.writeObject(object);

			out.close();
			file.close();

			System.out.println("Object has been serialized");

		}

		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}


		Demo object1 = null;


		try
		{   

			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);


			object1 = (task1)in.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			System.out.println("a = " + object1.a);
			System.out.println("b = " + object1.b);
		}

		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}

		catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException is caught");
		}

	}
}
