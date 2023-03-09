package threadtopic.task2;

// resource class
public class Table 
{
	// resource class--Method
	public synchronized void printTable(int no) 
	{
		for (int i = 1; i <=10; i++) 
		{
			System.out.println( Thread.currentThread().getName() + " - "+  no + " * " + i + " = "+(no*i));
		}
	}
}
