package newpackage;

public class TaskS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "Marynchuk Stepan Romanovych";
		String[] s = p.split(" ");
	
		char n = s[1].charAt(0);
		char n2 = s[2].charAt(0);

		System.out.println(s[0] + " " + s[1].charAt(0) + "." + s[2].charAt(0) + ".");
		System.out.println(s[1]);
		System.out.println(s[0] + " " + s[1] + " " + s[2]);


	}

}
