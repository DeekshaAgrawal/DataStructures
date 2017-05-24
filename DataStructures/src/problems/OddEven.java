package problems;

public class OddEven {
	
	public static void main(String[] a)
	{
		Printer p= new Printer(false);
		Thread t1= new Thread(new Task(p));
		Thread t2= new Thread(new Task(p));
		t1.start();
		t2.start();
	}

}
class Task implements Runnable{
	int num= 1;
	Printer print;
	Task(Printer p)
	{
		print=p;
	}
	public void run(){
		while(num<10)
		{
			if(num%2==0)
			{
				print.printEven(num);
				num+=1;
			}
			else
			{
				print.printOdd(num);
				num+=1;
			}
		}
		
	}
}
class Printer{
	boolean isOdd;
	Printer(boolean b)
	{
		isOdd=b;
	}
	synchronized void printEven(int num)
	{
		while(!isOdd)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("even "+num);
		isOdd=false;
		notifyAll();
	}
	synchronized void printOdd(int num)
	{
		while(isOdd)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Odd "+num);
		isOdd=true;
		notifyAll();
		
	}
}
