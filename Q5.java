package multithread;


class demo1 implements Runnable

{	
	public void run()
	{
	
		synchronized(this)
		{
	      for(int i=0;i<=50;i++)
	      {
	    	  System.out.println(i);
	      }
		}
	}
}
class demo2 implements Runnable

{	public void run()
	{
	
		synchronized(this)
		{
	      for(int j=50;j>=0;j--)
	      {
	    	  System.out.println(j);
	      }
		}
	}
}
public class Q5 {

	public static void main(String args[])
	{
		demo1 d=new demo1();
		demo2 d1=new demo2();
		Thread t1=new Thread(d);
		Thread t2=new Thread(d1);
		t1.start();
		t2.start();
		
		
		
	}
}
