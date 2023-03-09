package collectiontopic.listtopic;
import java.util.ArrayList;
import java.util.Iterator;
public class TestApp1 
{
	public static void main(String[] args) 
	{
//		Student s = new Student();
//		System.out.println(s);//collectiontopic.listtopic.Student@5a07e868
//		System.out.println(s.toString());//collectiontopic.listtopic.Student@5a07e868
		Student s1 = new Student();
		s1.rno=1;
		s1.name="rahul";
		s1.std=12;
		ArrayList listObj = new ArrayList();
		listObj.add(true);// Boolean---0 
		listObj.add('R');//Character---1 <=====itr
		listObj.add(10);// Integer---2
		listObj.add(150L);//Long---3
		listObj.add(5432.21345f);// Float---4
		listObj.add(12.34);// Double---5
		listObj.add(s1);// StudentObject---6
		System.out.println("listObj.size() - " + listObj.size());
		System.out.println(listObj.get(4));
		
//		for(int i=0;i<listObj.size();i++) 
//		{
//			Object obj = listObj.get(i);
//			System.out.println(obj);
//		}
//-------------------------------------------------		
//		for( Object obj   : listObj) 
//		{
//			System.out.println(obj);			
//		}
//-------------------------------------------------		
		Iterator itr =	listObj.iterator();
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			System.out.println(obj);
		}
	}
}
