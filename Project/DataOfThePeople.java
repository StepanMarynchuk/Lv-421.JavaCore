import sun.util.resources.LocaleData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Format;
import java.util.*;
import java.util.stream.Collectors;

public class DataOfThePeople {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 20; i++) {
            List<Adults> adultsList = new ArrayList<Adults>();
        adultsList.add(new Adults("Nataliia", "Cherry", 111, 1920));
        adultsList.add(new Adults("Junky", "Jokers", 222, 1987));
        Adults visitor = new Adults("Ivan", "Kaanski", 333, 2000);
        adultsList.add(visitor);
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

            int count = i;
            System.out.println("Do you want to add new visitor?");
            if(br1.readLine().equals("yes")) {
            System.out.println("Add information about the visitor");
        }
            Adults addedVisitor = new Adults(br1);
            if(br1== null) {
            adultsList.add(addedVisitor);
        }
            if(br1.readLine().equals("no")) {
                System.out.println("choose visitor from the list");
            }

                for (int j = 0; j < adultsList.size(); j++) {
                    System.out.println(j + " " + adultsList.get(j));
                }

                for (Person.VisitContent visitContent : Person.VisitContent.values()) {
                    System.out.println(visitContent);
                }


            System.out.println("Enter visitor's index");
            // ((Adults)adultsList).getName(br1.readLine()); I want to choose visitor from names ir ID
            Adults visitor1 = adultsList.get(Integer.parseInt(br1.readLine()));

            System.out.println(visitor1);
            System.out.println("add visit referral");
            visitor1.setVisitContent(Person.VisitContent.valueOf(br1.readLine()));
            System.out.println(visitor1 + " " + visitor1.getVisitContent());
            System.out.println("There were " + (count + 1) + "visits today.");//how should I use count method instead of this?
        }


//        Map<String, Person.VisitContent> referralList = new HashMap<String, Person.VisitContent>();
//
//        referralList.put("Dhyptheria", Person.VisitContent.Vaccination);
//        referralList.put("Hepatitis", Person.VisitContent.Vaccination);
//        referralList.put("Measles", Person.VisitContent.Vaccination);
//        referralList.put("Allergists", Person.VisitContent.ReferralToASpecialist);
//        referralList.put("Cardiologists", Person.VisitContent.ReferralToASpecialist);
//        referralList.put("Dermatologists", Person.VisitContent.ReferralToASpecialist);
//        referralList.put("Endocrinologists", Person.VisitContent.ReferralToASpecialist);
//        referralList.put("Blood Count", Person.VisitContent.ReferralForAnalysis);
//        referralList.put("Cardiogram", Person.VisitContent.ReferralForAnalysis);
//        System.out.println(adultsList);
//        System.out.println(referralList);
//        System.out.println();
//        System.out.println ("enter referal");
//        visitor1.visitContent=referralList.get(br1.readLine());
//        System.out.println(visitor1+ " " + visitor1.visitContent);
        //    Map<List<Adults>, Map<String, Person.VisitContent>> visitors = new HashMap<List<Adults>, Map<String, Person.VisitContent>>();
//        for (int i=0; i< adultsList.size(); i++) {
//            System.out.println(adultsList.get(i));
//        }
//        for (int i=0; i<referralList.size(); i++) {
//            System.out.println(referralList.entrySet());
//        }
//        List<Adults> visitorsList = new ArrayList<Adults>(adultsList);
//        System.out.println(visitorsList.get(0));

//        System.out.println();
//        Map<String, Person.VisitContent> addingRefferal = new HashMap<String, Person.VisitContent>(referralList);

//        for (HashMap.Entry<String, Person.VisitContent> entry : addingRefferal.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//            System.out.println(entry.getValue());
//
//        }
//       visitors.put(visitorsList, addingRefferal);
//        System.out.println(visitors);
//        for( Map.Entry<List<Adults>, Map<String, Person.VisitContent>> entry : visitors.entrySet()) {
//            //I want to connect key and value how I need, not how the list gives.
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

    }


}
