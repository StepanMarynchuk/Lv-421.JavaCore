package WorkHome1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Zavdannya2 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������ ��������� ������� �1 , �2 , �3 :  ");
		int c1= Integer.parseInt(br.readLine());
		int c2= Integer.parseInt(br.readLine());
		int c3= Integer.parseInt(br.readLine());
		System.out.println("������ ��������� ���������� �1 , �2 , �3 :");
		int T1= Integer.parseInt(br.readLine());
		int T2= Integer.parseInt(br.readLine());
		int T3= Integer.parseInt(br.readLine());
		System.out.println("��������� ������ ���������� = "+ (c1*T1) );
		System.out.println("��������� ������ ���������� = "+ (c2*T2) );
		System.out.println("��������� ����� ���������� = "+ (c3*T3) );
		System.out.println("�������� ��������� ���������� = "+ (c1*T1+c2*T2+c3*T3) );
		

        
	}

}
