package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12);
		Student s2 = new Student(2, "ramesh", 12);
		Student s3 = new Student(3, "rakesh", 12);
		Student s4 = new Student(4, "sagar", 12);
		Student s5 = new Student(5, "krunal", 12);
		
		ArrayList<Student> list = new ArrayList<Student>(); 
		list.add(s1);//0
		list.add(s2);//1
		list.add(s3);//2
		list.add(s4);//3
		list.add(s5);//4

		Iterator<Student> itr = list.iterator();
		while(itr.hasNext()) 
		{
			Student s = itr.next();
			s.disp();
		}
		
		// remove 
//		list.remove(2);
//		System.out.println("After remove student Object : ");
//		itr = list.iterator();
//		while(itr.hasNext()) 
//		{
//			Student s = itr.next();
//			s.disp();
//		}
		// update 
		Student s = new Student(3, "Dr Ankur Barot", 12);
		list.set(3, s);
		
		System.out.println("After Update student Object at 4 : ");
		itr = list.iterator();
		while(itr.hasNext()) 
		{
			s = itr.next();
			s.disp();
		}
	}
}
