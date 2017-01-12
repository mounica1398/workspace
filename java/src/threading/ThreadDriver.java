package threading;

public class ThreadDriver 
{
	public static void main(String []args)
	{
		/*System.out.println("Main thread created");
		MultiThreading t1=new MultiThreading("Thread_1");
		t1.start();
		MultiThreading t2=new MultiThreading("Thread_2");
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		MainThread m = new MainThread("main");
		m.start();
		
		
		
	}

}
