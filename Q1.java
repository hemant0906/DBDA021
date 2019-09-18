package multithread;

class TH1 extends Thread
{
	
	public void run()
	{
		for(char ch ='A';ch<='J';ch++)
		{
			System.out.println(ch);
		}
	}
}



public class Q1
{
	public static void main(String args[])
	{
		TH1 t1=new TH1();
		TH1 t2=new TH1();
		t1.start();
		t2.start();
	}

}
