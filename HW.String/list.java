

import java.util.ArrayList;
import java.util.List;


public class list {
    public static void main(String[] args) {
        //display the longest word in the sentence
        //determine the number of its letters
        //bring the second word in reverse order


        List<String> list = new ArrayList();
        list.add("JAVA");
        list.add("IS");
        list.add("LOVELY");

        int longest = 0;
        String s;

        String str = null;

        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(str))
                str = list.get(i);


            if (str.length() > longest)
                longest = str.length();
        }
        System.out.println("the longest word in the sentence is " + str + "," + "the number of its letters is " + longest);
        System.out.println("the second word in reverse order is " + list.get(1));

    }
}


