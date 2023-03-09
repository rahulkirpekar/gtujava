package iotopic;

import java.io.FileOutputStream;
import java.util.Scanner;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name :");
		String name = sc.nextLine();// ABCDE
		byte b[] = null;
		try 
		{
			// File Connection open with ssitstring.txt
			FileOutputStream out = new FileOutputStream("ssitstring.txt");
			
			// string data convert intop Byte Array by String's getByte Method
			b = name.getBytes();
			
			// writting process
			out.write(b);
			
			System.out.println("success in wrrting procees");
			// file connection close
			out.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		} 
	}
}
