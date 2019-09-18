package multithread;

class Demo implements Runnable
{
	/*synchronized public void run()
	{ 
		
		for(int i=0;i<6;i++)
			{
				System.out.println("Exec"+i);
			}
		*/
	
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<6;i++)
			{
				System.out.println("Exec"+i);
			}
		}
	}

	
		
	
	
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		Thread t1=new Thread(d);
		Thread t2=new Thread(d);
		Thread t3=new Thread(d);
		t1.start();
		t2.start();
		t3.start();
	}

}
