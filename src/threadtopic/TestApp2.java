package threadtopic;

public class TestApp2 extends Thread
{
	@Override
	public void run() 
	{
		for (int i = 1; i <=3; i++) 
		{
			System.out.println(i + " - " + Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) 
	{
		TestApp2 th1 = new TestApp2();
		TestApp2 th2 = new TestApp2();
		
		th1.start();
		th2.start();		
	}
}
