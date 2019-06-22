package less1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork1c {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
int c1;
int c2;
int c3;
int t1;
int t2;
int t3;
c1=1;
c2=2;
c3=3;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("¬вед≥ть t1");
 t1 = Integer.parseInt(br.readLine());
 System.out.println("¬вед≥ть t2");
 t2 = Integer.parseInt(br.readLine());
 System.out.println("¬вед≥ть t3");
 t3 = Integer.parseInt(br.readLine());
 System.out.println("Time 1 = "+ (c1*t1));
 System.out.println("Time 2 = "+ (c2*t2));
 System.out.println("Time 3 = "+ (c3*t3));
 System.out.println("Time oll = "+ (c1*t1+c2*t2+c3*t3));
	}

}
