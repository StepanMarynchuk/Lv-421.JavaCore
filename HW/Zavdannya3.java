package WorkHome1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Zavdannya3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Яке ваше імя? ");
        String name= br.readLine();
        System.out.println("Де ви живете " + name+ " ?");
        String adress = br.readLine();
        System.out.println("Вас звати "+name+" і ви живете в "+adress);

	}

}
