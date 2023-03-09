package iotopic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		// try--with resources--->Auto Closable Resourcses
		try(
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\gtujava\\listofstud.txt");
				ObjectInputStream oin = new ObjectInputStream(fin);
			) 
		{
			Student s[] = (Student[])oin.readObject();
		
			for (int i = 0; i < s.length; i++) 
			{
				s[i].disp();
			}
		} catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
