package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<Float>listObj = new ArrayList<Float>();

		listObj.add(12.31f);
		listObj.add(43.43f);
		listObj.add(1312.43f);
		listObj.add(43.54f);
		listObj.add(76.76f);
		listObj.add(54.65f);
		listObj.add(1312.43f);
		listObj.add(43.54f);
		Iterator<Float> itr =	listObj.iterator();
		
		while(itr.hasNext()) 
		{
			Float per= itr.next();
			System.out.println(per);
		}
	}
}
