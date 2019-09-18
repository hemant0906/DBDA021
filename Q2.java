package multithread;

class TH3 implements Runnable 
{
	
	public void run()
	{
		for(char ch ='A';ch<='J';ch++)
		{
			System.out.println(ch);
		}
	}
}



public class Q2
{
	public static void main(String args[])
	{
		TH3 t=new TH3();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.start();
		t2.start();
	}

}

