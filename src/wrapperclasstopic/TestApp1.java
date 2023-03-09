package wrapperclasstopic;
import java.util.Scanner;
// WrapperClass
public class TestApp1 
{
	public static void main(String args[]) 
	{
//		int a1[][] = new int[5][4];
//		int []a2[] = new int[5][4];
//		int[][]a3 = new int[5][4];
//		int[][]a4 = new int[5][4];

		
		
		
		int no1,no2,ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		no1 = sc.nextInt();//20
		System.out.println("Enter No2 : ");
		no2 = sc.nextInt();//10
		ans = no1+no2;
		System.out.println("Addition : " + ans);
		// AutoBoxing---primitive values----"Wrapper class object"
		Integer objNo1 = no1;// Integer objNo1 = Integer.valueOf(no1)---AutoBoxing
		
		// UnBoxing----WrapperClass Object---Primitive Values Convertion
		int tempNo1 = objNo1; // int tempNo1 = objNo1.intValue();
		
//		float no3 = 20.3240f;
//		Float objNo3 = no3; // Float object --- Float.valueof(no3);
//		Integer objNo1 = Integer.valueOf(no1);
		
		Integer objNo2 = no2;
		Integer ansObj = ans;

		System.out.println("objNo1 : " + objNo1);
		System.out.println("objNo2 : " + objNo2);
		System.out.println("ansObj : " + ansObj);

		//		Integer objNo1 = new Integer(no1);//20
//		Integer objNo2 = new Integer(no2);//10
//		Integer ansObj = new Integer(ans);//30
	}
}