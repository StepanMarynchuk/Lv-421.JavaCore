import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Task6 {
    public int countWords(String s){

        int count=0;

            if(!(" ").equals(s.substring(0,1))|| !(" ".equals(s.substring(s.length()-1))))
                for(int j=0; j <s.length();j++)
                {
                    if (s.charAt(j) == ' ') {
                        count++;
                    }
            count = count+1;
                }

        return count;
        }

    }

