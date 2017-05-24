package problems;

import java.util.LinkedList;

public class ProducerConsumer {
	
	
	static class PC{
		
		LinkedList<Integer> list= new LinkedList<>();
		int capacity= 2;
		void producer() throws InterruptedException{
			int value=0;
			synchronized(this){
			if(list.size()==capacity)
			{
				wait();
			}
			System.out.println("produced values :"+value);
			list.add(value++);
			notify();
			}
		}
		void consumer() throws InterruptedException{
			synchronized(this){
			if(list.size()==0)
			{
				wait();
			}
			int val=list.removeFirst();
			System.out.println("consumed "+val);
			notify();
			}
		}
	}
	public static void main(String[] a)
	{
		PC pc= new PC();
		Thread t=new Thread(new Runnable(){
			public void run(){
				try {
					pc.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t1= new Thread(new Runnable(){
			public void run(){
				try {
					pc.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t.start();
		t1.start();
	}

}
