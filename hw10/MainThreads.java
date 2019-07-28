package homeWork10;

public class MainThreads {
	public final static Object object = new Object();
	public static void main(String[] args) {
		
		System.out.println("-------------Task 1--------------");
		
		MyThread1 thread0 = new MyThread1("It is first thread");
		MyThread1 thread1 = new MyThread1("It is second thread");
		MyThread1 thread2 = new MyThread1("It is third thread");
		thread0.start();
		thread1.start();
		try {
			thread0.join();
			thread1.join();
		} catch (InterruptedException e) {e.printStackTrace();}		
		thread2.start();
		try {
			thread2.join();
		} catch (InterruptedException e) {e.printStackTrace();}
		
		System.out.println("-------------Task 2--------------");

		Thread thread3 = new Thread(){
			public void run() {
				synchronized (object) {
					System.out.println("deadlocked not start");
				}				
			}
		};
		synchronized (object) {
			thread3.start();
//			System.out.println("deadlocked start");
//			try {
//				thread3.join();
//			} catch (InterruptedException e) {   // <---Legitimate deadlock
//				e.printStackTrace(); 
//			}
			
			System.out.println("-------------Task 3--------------");
			
			Thread thread4 = new Thread(){
				public void run() {
					Thread thread5 = new Thread(){
						public void run() {
							for (int i = 0; i < 3; i++) {
								System.out.println(Thread.currentThread().getName());
								Thread.yield();
							}
						}
					};
					thread5.start();
				}
			};
			Thread thread6 = new Thread(){
				public void run() {
					for (int i = 0; i < 5; i++) {
						Thread.yield();
						System.out.println(Thread.currentThread().getName());	
					}
				}
			};
			thread4.start();
			thread6.start();
		}
	}
}
