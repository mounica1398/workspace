package threading;

public class MainThread extends Thread {
	Thread t;
	String Threadname;
	MainThread(String name)
	{
		this.Threadname=name;
		
	}
	public void run()
	{
		System.out.println("mainThread created");
		MultiThreading t1 = new MultiThreading("Thread-1");
		t1.start();
		MultiThreading t2 = new MultiThreading("Thread-2");
		t2.start();
		
	}

}
