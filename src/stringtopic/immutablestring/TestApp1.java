package stringtopic.immutablestring;

// 1) ImmutableWay ---> String
public class TestApp1
{
	public static void main(String[] args) 
	{
		String clgName1 = "SSIT";
		System.out.println(clgName1 + " - " + clgName1.hashCode());
		
		String clgName2 = "ABC";
		System.out.println(clgName2 + " - " + clgName2.hashCode());
		
		
		String clgName3 = "SSIT";
		System.out.println(clgName3 + " - " + clgName3.hashCode());
		
		
		String clgName4 = clgName2;
		System.out.println(clgName4 + " - " + clgName4.hashCode());
		
		
		String clgName7 = clgName1 + " Engineering Clg";// "SSIT Engineering Clg"
		
		System.out.println(clgName7 + " "+ clgName7.hashCode());
		
		String clgName5 = new String("SSIT");
		System.out.println(clgName5 );
		
//		String Objects Equality check---[==]

		System.out.println("(clgName1==clgName2) - " + (clgName1==clgName2));// false
		System.out.println("(clgName1==clgName3) - " + (clgName1==clgName3));// true
		System.out.println("(clgName1==clgName4) - " + (clgName1==clgName4));// false
		
		System.out.println("(clgName1==clgName5) - " + (clgName1==clgName5));// false
		
		System.out.println("clgName1.hashCode() : " + clgName1.hashCode());
		System.out.println("clgName5.hashCode() : " + clgName5.hashCode());
		
		
		

	}
}
