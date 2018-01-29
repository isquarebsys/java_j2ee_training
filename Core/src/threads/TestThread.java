package threads;

public class TestThread {

	   public static void main(String args[]) {
		   
		  // Method 1
	      RunnableDemo R1 = new RunnableDemo("Thread using implements");
	      R1.start();
	      
	      //Method 1
	      ThreadDemo T1 = new ThreadDemo("Thread using extends");
	      T1.start();
	   }   
	}
