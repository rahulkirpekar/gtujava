package quesdoubts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		List<String> listStrings = Arrays.asList("Mamad", "Dipak", "Vipul", "Amit", "Karshan", "Bipin");
		
		System.out.println("Before sorting: " + listStrings);
		
		Collections.sort(listStrings);
		
		System.out.println("After sorting : " + listStrings);
		
		
		Collections.reverse(listStrings);
		
		System.out.println("After reverse sorting : " + listStrings);
		
		
	}

}
