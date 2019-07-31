import sun.util.resources.LocaleData;

import java.io.*;
import java.text.Format;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DataOfThePeople {
    public static void main(String[] args) throws IOException {

        List<Adults> adultsList = new ArrayList<Adults>();
        adultsList.add(new Adults("Nataliia", "Cherry", 111, 1919));
        adultsList.add(new Adults("Junky", "Jokers", 222, 1987));
        Adults visitor = new Adults("Ivan", "Kaanski", 333, 2000);
        adultsList.add(visitor);

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        Adults addedVisitor = new Adults(br1);

        for (int visits = 0; visits < 20; visits++) {
            System.out.println("Do you want to add new visitor? Enter yes or no");
            String choose = br1.readLine();
            switch (choose.toLowerCase()) {
                case ("yes"):
                    System.out.println("Add information about the visitor");
                    System.out.println("ADD VISITOR'S NAME");
                    try {
                        addedVisitor.setName(br1.readLine());
                        addedVisitor.checkInfo(addedVisitor.getName().toLowerCase());
                        System.out.println("Visitor;s name is " + addedVisitor.getName());
                    } catch (DataException e) {
                        System.err.println("Nor apropriate format ");
                    }
                    System.out.println("Enter visitor's Surname");
                    try {
                        addedVisitor.setSurName(br1.readLine());
                        addedVisitor.checkInfo(addedVisitor.getSurName().toLowerCase());
                        System.out.println("Visitors surName is " + addedVisitor.getSurName());
                    } catch (DataException e) {
                        System.err.println("Not apropriate format ");
                    }
                    System.out.println("Enter visitor's id");
                    try {
                        addedVisitor.setId(Integer.parseInt(br1.readLine()));
                        System.out.println("Visitor's id is " + addedVisitor.getId());
                    } catch (NumberFormatException e) {
                        System.err.println("Not a number");
                    }
                    try {
                        System.out.println("Enter visitor's date of Birth");
                        addedVisitor.setDateOfBirth(Integer.parseInt(br1.readLine()));
                    } catch (NumberFormatException e) {
                        System.err.println("Not a number");
                    }
                    System.out.println("Visitor's date of Birth is " + addedVisitor.getDateOfBirth());
                    System.out.println(addedVisitor);
                    adultsList.add(addedVisitor);
                    break;
                case ("no"):
                    break;
                default:
                    System.out.println("NOT APPROPRIATE RESPONSE");


            }

            System.out.println("CHOOSE VISITOR FROM THE LIST");
            for (int j = 0; j < adultsList.size(); j++) {

                System.out.println(j + " " + adultsList.get(j));
            }


            for (Person.VisitContent visitContent : Person.VisitContent.values()) {
                System.out.println(visitContent);
            }

            System.out.println();
            System.out.println("ENTER VISITOR'S INDEX");
            Adults visitor1 = null;
            try {
                visitor1 = adultsList.get(Integer.parseInt(br1.readLine()));

                System.out.println(visitor1);
            } catch (IndexOutOfBoundsException | NumberFormatException e) {
                System.err.println("entered not appropriate index or not a number");}
                System.out.println("ADD REFERRAL FOR THE VISITOR");
                try {
                    visitor1.setVisitContent(Person.VisitContent.valueOf(br1.readLine()));
                    System.out.println(visitor1 + " " + visitor1.getVisitContent());
                    System.out.println("printing referral...");
                } catch (IllegalArgumentException ee) {
                    System.err.println("entered wrong referral");
                }
            System.out.println("DO YOU WANT TO EXIT?");
            String s = br1.readLine();
            if (s.equals("no")) {
                continue;
            }
            if (s.equals("yes")) {
                System.out.println("THERE WERE " + (visits + 1) + "VISITS TODAY.");
                break;
            }

        }

    }
}








