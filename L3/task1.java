import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub


BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
System.out.println ("a:");
int a =Integer.parseInt (br.readLine());
System.out.println ("b:");
int b =Integer.parseInt (br.readLine());
int c=a+b;
System.out.println ("Answer1=" + c);
int c1=a-b;
System.out.println ("Answer2=" + c1);
int c2= a*b;
System.out.println ("Answer3=" + c2);
int c3= a/b;
System.out.println ("Answer4=" + c3);
	}

}

