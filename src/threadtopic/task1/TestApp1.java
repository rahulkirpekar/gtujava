package threadtopic.task1;

public class TestApp1 extends Thread
{
	Table t = new Table();
	@Override
	public void run() 
	{
		t.printTable();
	}
	public static void main(String[] args) 
	{
		TestApp1 t1 = new TestApp1();
		TestApp1 t2 = new TestApp1();
		TestApp1 t3 = new TestApp1();
		TestApp1 t4 = new TestApp1();
		TestApp1 t5 = new TestApp1();
		
		t1.start();
		t2.start();		
		t3.start();		
		t4.start();		
		t5.start();
	}
}
