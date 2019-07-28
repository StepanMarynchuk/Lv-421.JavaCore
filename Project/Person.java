import sun.util.resources.LocaleData;

import java.text.Format;
import java.time.Period;
import java.time.Year;
import java.time.temporal.TemporalAdjuster;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Locale;

public abstract class Person implements Visit  {
    private String name;
   private   String surName;
    private int id;
    private int dateOfBirth;//calendar!!!
public Person(){};

    public Person(String name, String surName, int id, int dateOfBirth) {
        this.name = name;
        this.surName = surName;
        this.id = id;
        this.dateOfBirth=dateOfBirth;
    }
//    public static int calculateAge(LocaleData birthDate, LocaleData currentDate) {
//        if((birthDate!=null) && (currentDate!=null)){
//            return Period.between(birthDate, currentDate).getYears();
//}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public VisitContent getVisitContent() {
        return visitContent;
    }

    public void setVisitContent(VisitContent visitContent) {
        this.visitContent = visitContent;
    }

    private    VisitContent visitContent = VisitContent.Vaccination;

/** Method has to add visitor and referral*/

    public abstract int addVisit();

    public enum VisitContent {
        Vaccination(" " ),
        ReferralToASpecialist(" "), ReferralForAnalysis(" ");
        VisitContent(String kind) {
        }
    }
    /**
     * end user has to input information about the target of the visit and conclusion(referral) of the visit and to save it on the disk
     */
    public abstract void visitDiscription();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", id=" + id +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
//    public  LocaleData ageCalculation(LocaleData dateOfBirth, LocaleData now){
//       if((dateOfBirth!=null)&&(now!=null)){
//        return LocaleData(TemporalAdjuster(Period))
//    }


}
