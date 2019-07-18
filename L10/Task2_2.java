package newpackage;

public class Task2_2 {

	public static void main(String[] args) throws Exception {
		
		Thread t1 = new Task2_1 ("Hello, world", 1000);
	      Thread t2 = new Task2_1  ("Peace in the peace", 3000);
	      t1.start();
	      t2.start();
	      
	      t1.join();
	      t2.join();
	        
	      System.out.println("My name is Stepan");

	}

}
