package newpackage;

public class Task2_1 extends Thread {
	private String sentence;
	private int pause;

	public Task2_1 (String sentence, int pause) {
	 this.sentence=sentence;
	 this.pause=pause;}

	public void run () {
		for (int i = 0; i < 5; i++) {
			try {
				sleep(pause);
			} catch (InterruptedException e) {
			}
			System.out.println("Thread " + sentence);
		}
	}
}


