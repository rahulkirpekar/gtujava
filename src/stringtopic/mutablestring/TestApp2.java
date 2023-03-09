package stringtopic.mutablestring;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb1 = new StringBuilder("rahul");

		System.out.println(sb1 + " " + sb1.hashCode());
		
		sb1.append(" Kirpekar"); 
		
		System.out.println(sb1 + " " + sb1.hashCode());
	}
}
