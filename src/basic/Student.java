package basic;

import java.util.Scanner;

public class Student 
{
	// class Properties = 1) Dm's	+ 2) Mf's
	// 1) Data Members
	int rno;
	String name;
	int std;
	public void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void disp() 
	{
		System.out.println(rno +" " + name + " " + std);
	}
	public static void main(String[] args) 
	{
		Student s[] = new Student[500];
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scan();
		}
		for (int i = 0; i < s.length; i++) 
		{
			s[i].disp();
		}
	}
}
