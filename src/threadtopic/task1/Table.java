package threadtopic.task1;

// resource class
public class Table 
{
	// resource class--Method
	public void printTable() 
	{
		for (int i = 1; i <=10; i++) 
		{
			System.out.println( Thread.currentThread().getName() + " - "+  5 + " * " + i + " = "+(5*i));
		}
	}
}
