package threadtopic;

public class TestApp1 extends Thread
{
	@Override
	public void run() 
	{
//		System.out.println(Thread.currentThread().getId() + " "+ Thread.currentThread().getName());
		for (int i = 1; i <=5; i++) 
		{
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(i + " - " + Thread.currentThread().getId() + " " + Thread.currentThread().getName());
		}
	}
	// main----thread---callstack
	public static void main(String[] args) 
	{
		System.out.println("Thread Name : " + Thread.currentThread().getName());
		
		TestApp1 th1 = new TestApp1();
		TestApp1 th2 = new TestApp1();
		TestApp1 th3 = new TestApp1();
		TestApp1 th4 = new TestApp1();
		TestApp1 th5 = new TestApp1();
		
		th1.setName("C Language");
		th2.setName("C++ Language");
		th3.setName("CoreJava Language");
		th4.setName("Python Language");
		th5.setName("Scala Language");

		
//		th1.setPriority(Thread.MAX_PRIORITY);
//		th2.setPriority(Thread.MAX_PRIORITY);
		

		th1.start();// create Thread---> call run method---and execute task
		try 
		{
			th1.join(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		th2.start();// create Thread---> call run method---and execute task
		th3.start();// create Thread---> call run method---and execute task
		th4.start();// create Thread---> call run method---and execute task
		th5.start();// create Thread---> call run method---and execute task
	}
}
