import java.util.*;
public class Task2 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Lavrova", "Anna");
        map.put("Butko", "Mariia");
        map.put("Danylyshyn", "Roman");
        map.put("Kovaliv", "Yana");
        map.put("Hoshko", "Anna");
        map.put("Tkachenko", "Emiliia");
        map.put("Danylyshyn", "Nazar");
        map.put("Tegza", "Oleh");
        map.put("Svitliak", "Roman");
        map.put("Kozova", "Svitlana");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
        System.out.println();
        if (map.entrySet() == map.entrySet())
            map.remove(map.entrySet());
        System.out.println();

        }

    }


