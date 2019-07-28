package less10;

public class MyThread extends Thread{
	private String message;
	private int mSek;
	
	public MyThread(String message, int mSek) {
		this.message = message;
		this.mSek = mSek;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getmSek() {
		return mSek;
	}

	public void setmSek(int mSek) {
		this.mSek = mSek;
	}
	
	public void run() {
		for (int i = 0; i<5; i++) {
			try {
				sleep(mSek);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(message);
		}
	}	
}
