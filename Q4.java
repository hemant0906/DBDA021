package multithread;


class Core implements Runnable
{
	public void run()
	{
		synchronized(Core.class)
		{
			for (int i=1;i<=10;i++)
			{
				System.out.println(i);
			}
		}
	}
}
	

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Core c=new Core();
	Thread t1=new Thread(c);
	Thread t2=new Thread(c);
	t1.start();
	t2.start();
	}

}
