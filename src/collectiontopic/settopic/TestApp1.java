package collectiontopic.settopic;

import java.util.TreeSet;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TreeSet<String> setObj = new TreeSet<String>();
		
		setObj.add("rahul");
		setObj.add("ankur");
		setObj.add("rahul");
		setObj.add("rohit");
		setObj.add("virat");
		setObj.add("kenil");
		setObj.add("rohit");
		setObj.add("virat");
		
		Iterator<String> itr =	setObj.iterator();
		
		while(itr.hasNext()) 
		{
			String name = itr.next();
			System.out.println(name);
		}
	}
}
