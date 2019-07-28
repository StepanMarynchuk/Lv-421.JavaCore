import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import sun.util.resources.LocaleData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Period;
import java.util.*;

public class Adults extends Person {
    private VisitContent visitContent;

    public Adults(String name, String surName, int id, int dateOfBirth) {
        super(name, surName, id, dateOfBirth);

    }
 public Adults(BufferedReader bufferedReader){};


    @Override
    public void visitDiscription() {
    }


    public void visitDiscription(BufferedReader br) throws IOException {
        System.out.println("input target and conclusion");
        String s = br.readLine();
        System.out.println(s);// here I want to add VisitContent at once with the referral
        //add output Stream Writer!!!!!!!! to save on the disk

    }

    @Override
    public int addVisit() {
        int count = 0;
        return count++;
    }

    public static int countVisit() {
        int count = 0;
        return count++;
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    /////dubbling list????????/
//    public VisitContent referral() {
//        SortedMap<String, VisitContent> referralList = new TreeMap<>();
//        referralList.put("Dhyptheria", VisitContent.Vaccination);
//        referralList.put("Hepatitis", VisitContent.Vaccination);
//        referralList.put("Measles", VisitContent.Vaccination);
//        referralList.put("Allergists", VisitContent.ReferralToASpecialist);
//        referralList.put("Cardiologists", VisitContent.ReferralToASpecialist);
//        referralList.put("Dermatologists", VisitContent.ReferralToASpecialist);
//        referralList.put("Endocrinologists", VisitContent.ReferralToASpecialist);
//        referralList.put("Blood Count", VisitContent.ReferralForAnalysis);
//        referralList.put("Cardiogram", VisitContent.ReferralForAnalysis);
//        return VisitContent.Vaccination;
    //  я б хотіла значиння мати в протилежному порядку, типу спочатку вибирати VisitContent направлення,
    // а потім значення. Is  it correct to use list for this kind of data? or is it better to create switch case?

    // public  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//public class AgeCalculator {
//
//    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
//        if ((birthDate != null) && (currentDate != null)) {
//            return Period.between(birthDate, currentDate).getYears();
//        } else {
//            return 0;
//        }
//    }
//}


}




