package threadtopic;

public class MyThead1 implements Runnable
{
	public static void main(String[] args) 
	{
		MyThead1 th1 = new MyThead1();
		MyThead1 th2 = new MyThead1();
		MyThead1 th3 = new MyThead1();
		MyThead1 th4 = new MyThead1();
		MyThead1 th5 = new MyThead1();

		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		Thread t3 = new Thread(th3);
		Thread t4 = new Thread(th4);
		Thread t5 = new Thread(th5);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
	@Override
	public void run() 
	{
		System.out.println("Hi I am Thread : " + Thread.currentThread().getName());
	}
}
