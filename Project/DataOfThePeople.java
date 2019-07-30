import sun.util.resources.LocaleData;

import java.io.*;
import java.text.Format;
import java.util.*;
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

//Adults visitor1 = adultsList.get(Integer.parseInt(br1.readLine()));

        for (int visits = 0; visits < 20; visits++) {

            for (int addingVisitor = 0; addingVisitor < 20; addingVisitor++) {
                System.out.println("Do you want to add new visitor? Enter yes or no");

                if (br1.readLine().equals("yes")) {
                    System.out.println("Add information about the visitor");
                    System.out.println("ADD VISITOR'S NAME");
                    addedVisitor.setName(br1.readLine());
                    System.out.println("Visitor;s name is " + addedVisitor.getName());
                    System.out.println("Enter visitor's Surname");
                    addedVisitor.setSurName(br1.readLine());

                    System.out.println("Visitors surName is " + addedVisitor.getSurName());
                    System.out.println("Enter visitor's id");
                    try {
                        addedVisitor.setId(Integer.parseInt(br1.readLine()));
                        System.out.println("Visitor's id is " + addedVisitor.getId());
                        System.out.println("Enter visitor's date of Birth");
                        addedVisitor.setDateOfBirth(Integer.parseInt(br1.readLine()));
                    } catch (NumberFormatException e) {
                        System.out.println("Not a number");
                    }
                    System.out.println("Visitor's date of Birth is " + addedVisitor.getDateOfBirth());
                    System.out.println(addedVisitor);
                    adultsList.add(addedVisitor);
                }
//                if(!(br1.readLine().equals("yes")&&br1.readLine().equals("no")))
//                    System.out.println("Enter yes or no");

                 if (br1.readLine().equals("no")){break;}
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
            // ((Adults)adultsList).getName(br1.readLine()); I want to choose visitor from names ir ID

            try {
                Adults visitor1 = adultsList.get(Integer.parseInt(br1.readLine()));

                System.out.println(visitor1);
                System.out.println("ADD REFERRAL FOR THE VISITOR");

                visitor1.setVisitContent(Person.VisitContent.valueOf(br1.readLine()));
                System.out.println(visitor1 + " " + visitor1.getVisitContent());
                System.out.println("printing referral...");
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("not a number or entered not apropriate index");
            }

            //how should I use count method instead of this?
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

//           }
//           for (int i = 0; i < 20; i++) {
//               System.out.println("Do you want to add new visitor?");
//               if (br1.readLine().equals("no")) {
//                   System.out.println("choose visitor from the list");
//                   continue;
//               }
//               if (br1.readLine().equals("yes")) break;
//               System.out.println("Add information about the visitor");
//               if (br1.readLine().equals(addedVisitor))
//                   adultsList.add(addedVisitor);

//            FileOutputStream fw = new FileOutputStream("adultslList");
//            try{
//                ObjectOutputStream stream = new ObjectOutputStream(fw);
//                stream.writeObject(adultsList);
//                stream.close();
//            }catch (IOException e){
//                System.out.println(e);}

//            try {
//                ObjectInputStream istream = new ObjectInputStream(new ByteArrayInputStream());
//                adultsList unknown = (adultsList) istream.readObject();
//                istream.close();
//                System.out.println(unknown);
//            } catch (ClassNotFoundException | IOException e) {
//                System.err.println(e.getMessage());
//            }

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






