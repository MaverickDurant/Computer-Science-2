//carQueue
import java.util.ArrayDeque;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CarQueue 
{
	ArrayDeque<Integer> queue;
	Random random; 
	ExecutorService executor;

	CarQueue()
	{
		queue = new ArrayDeque<Integer>();
		random = new Random(); 
		for (int i = 0; i < 5; i++) 
		{
			queue.add(random.nextInt(4)); 
		}
		executor = Executors.newSingleThreadExecutor(); 
	}

	public void addToQueue() 
	{
		Runnable task = () -> 
		{
			while(true) 
			{
				queue.add(random.nextInt(4)); 
				try 
				{
					Thread.sleep(500);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		};
		executor.execute(task); 
	}
	
	public int deleteQueue() 
	{
		return queue.remove();
	}
	
	public void shutdown() 
	{ 
		executor.shutdown();
	}
}
