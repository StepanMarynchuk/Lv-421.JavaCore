import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		 
		try {
			task1();
			task2();
			task3();
			task4();
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
		

	}

	private static void task1() throws InterruptedException {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Hello World");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Peace in the Peace  ");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Hail to you");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		t3.start();
	}

	public static void task2() throws InterruptedException {
		String str1 = "first";
		String str2 = "second";

		Thread t1 = new Thread() {
			public void run() {
				while (true) {
					synchronized (str1) {
						synchronized (str2) {
							System.out.println(str1 + str2);
						}
					}
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				while (true) {
					synchronized (str2) {
						synchronized (str1) {
							System.out.println(str2 + str1);
						}
					}
				}
			}
		};
		t1.start();
		t2.start();
	}

	private static void task3() throws InterruptedException {
		Thread one = new Thread() {
			public void run() {
				Thread two = new Thread() {
					public void run() {
						for (int i = 0; i < 3; i++) {
							System.out.println("Thread number two  ");
						}
						Thread three = new Thread() {
							public void run() {
								for (int i = 0; i < 5; i++) {
									System.out.println("Thread number three ");
								}
							}
						};
						three.start();
					}
				};
				two.start();
			}
		};
		one.start();

	}

	private static void task4() throws IOException {
		List<String> lines = new ArrayList<>();
		File file = new File("D:\\Java study\\Homework10\\src\\file1.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str;
		while ((str = br.readLine()) != null) {
			lines.add(str);
		}
		String longest = lines.get(0);
		for (String num : lines) {
			System.out.println(num.length());
			if (num.length() > longest.length()) {
				longest = num;
			}
		}
		String filename = "file2.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
		writer.write("Amount of strings " + lines.size());
		writer.newLine();
		writer.write("The longest line " + longest + longest.length());
		writer.newLine();
		writer.write("Pavlo Boianovskyi 1999");
		writer.close();
		br.close();
	}

}
