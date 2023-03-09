package iotopic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp8 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileReader fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\gtujava\\test1.txt");
			int temp;
			while(	(temp = fr.read())	!= -1	) 
			{
				System.out.print((char)temp);
			}
			fr.close();
		
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
