package collectiontopic.listtopic;

import java.util.Scanner;

public class Student 
{
	private int rno;
	private String name;
	private int std;
	
	public Student() {
	}
	
	public Student(int rno, String name, int std) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
	}

	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

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
	public void update() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}




	public int getStd() {
		return std;
	}






	public void setStd(int std) {
		this.std = std;
	}


	public void disp() 
	{
		System.out.println(rno + " " + name + " " + std);
	}

	@Override
	public String toString() 
	{
		return rno + " " +name + "  "+ std;
	}
}
