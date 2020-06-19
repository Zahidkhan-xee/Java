import java.util.*;
public class Week8c {
	public static void main(String[] args)
	{
		List<Integer> que = new ArrayList<Integer>();
		Thread producer = new Thread(new Producer(que));
		Thread consumer = new Thread(new Consumer(que));
		System.out.println("");
		producer.start();
		consumer.start();
	}
}
class Producer implements Runnable
{
	List<Integer> que;
	final int SIZE;
	Random data;
	public Producer(List<Integer> que){
		SIZE = 3;
		this.que = que;
		data = new Random();
	}
	public void run(){
		while (true){
			try { produce(); }
			catch(InterruptedException e){ System.out.println("Error: "+e.getMessage()); }
		}
	}
	public void produce() throws InterruptedException
	{
		synchronized (que) {
			while (que.size() == SIZE){
				System.out.println("\t\tWaiting for the consumer to consume...");
				que.wait();
			}
			int randNum = data.nextInt(100);
			que.add(randNum);
			System.out.println("\t\tProducer Produce : "+randNum);
			Thread.sleep(1000);
			que.notify();
		}
	}
}
class Consumer implements Runnable
{
	List<Integer> que;
	final int SIZE;
	public Consumer(List<Integer> que){
		SIZE = 5;
		this.que = que;
	}
	public void run(){
		while (true) {
			try {
				consume();
			}
			catch(InterruptedException e){
				System.out.println("Error: "+e.getMessage());
			}
		}
	}
	public void consume() throws InterruptedException
	{
		synchronized (que) {
			while (que.isEmpty()){
				System.out.println("\t\tWaiting for the producer to produce...");
				que.wait();
			}
			for (int idx = 0; idx < que.size(); idx++){
				System.out.println("\t\tConsumer consumed: "+que.remove(idx));
			}
			Thread.sleep(500);
			que.notify();
		}
	}
}
