package exceptiontopic;
public class MyOperation 
{
	public void getAnsByDivision(int no1,int no2)  throws DivideByZeroException
	{
		if (no2 == 0) 
		{
			// raise UserDefined Exception
			throw new DivideByZeroException("'Divide by Zero'");
		} else 
		{
			int ans = no1 / no2;
			System.out.println("Addition : " + ans);
		}
	}
	public static void main(String[] args) 
	{
		String name = null;
		MyOperation obj1 = new MyOperation();
		try 
		{
			obj1.getAnsByDivision(10, 0);
			
			
			System.out.println(name.length());// NullPointerException 
			
			
		} catch (DivideByZeroException e) 
		{
			e.printStackTrace();
		} catch (NullPointerException e) 
		{
			e.printStackTrace();
		}finally 
		{
			System.out.println("i am Finally Block");
		}
		System.out.println("success");
	}
}