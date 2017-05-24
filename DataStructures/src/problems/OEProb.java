package problems;

public class OEProb {
	
	public static void main(String[] args) {
		Printer printer= new Printer();
		Thread t1= new Thread(new PrintOddEven(printer,10,false));
		Thread t2= new Thread(new PrintOddEven(printer,10,true));
		t1.start();
		t2.start();
	}
	public static class PrintOddEven implements Runnable{
		Printer p;
		int max;
		boolean isEven;
		public PrintOddEven(Printer printer,int m, boolean isEvenNum) {
			p=printer;
			max=m;
			isEven=isEvenNum;
		}
		public  void run(){
			int num;
			if(isEven)
			{
			num=2;
			}
			else
			{
				num=1;
			}
			while(num<=max){
				if(isEven)
				{
					try {
						p.printEven(num);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else
				{
					try {
						p.printOdd(num);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				num+=2;
			}
		}
	}
	
	public static class Printer{
		boolean isOdd=false;
		synchronized void printEven(int n) throws InterruptedException
		{
			while(!isOdd)
			{
				wait();
			}
			System.out.println("Even "+n);
			isOdd=false;
			notify();
		}
		synchronized void printOdd(int n) throws InterruptedException
		{
			while(isOdd)
			{
				wait();
			}
			System.out.println("odd "+n);
			isOdd=true;
			notify();
		}
		
	}

}

