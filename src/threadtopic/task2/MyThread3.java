package threadtopic.task2;

public class MyThread3 extends Thread
{
	Table t ;
	public MyThread3(Table t) 
	{
		this.t = t;
	}
	public void run() 
	{
		t.printTable(7);
	}
}
