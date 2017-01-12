package threading;
public class MultiThreading extends Thread
{ 
	Thread t;
	String Threadname;
	MultiThreading(String name)
	{
		this.Threadname=name;
		
	}
	
	public void run()
	{
		int i;
		try
		
		{
			 for(i=1;i<=10;i++)
			 {
				 System.out.println(Threadname+"-"+i);
				 Thread.sleep(100);
				 if(i == 10 && Threadname == "Thread-2" )
						System.out.println("mainThread exiting");
				 
			 }
			 
		}	 
		catch(Exception e){};
		
		
	}
	
	
	
}
	
