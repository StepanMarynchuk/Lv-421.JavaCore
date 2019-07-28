package homeWork10;

public class MyThread1 extends Thread{
	private String message;

	public MyThread1(String message) {
		this.message = message;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName() + " - Start - " + message);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " - End");
	}

}
