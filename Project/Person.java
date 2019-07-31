
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Person {
    private String name;
    private String surName;
    private int id;
    private int dateOfBirth;

    public Person() {}

    public Person(String name, String surName, int id, int dateOfBirth) {
        this.name = name;
        this.surName = surName;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
    }


    /**this methos checks validation for fields name and surName*/
    public void checkInfo(String name) throws DataException {
        String pattern = "[a-z]{1,10}";
        String text = name;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        if (m.matches() == false) throw new DataException();
    }

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

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public VisitContent getVisitContent() {
        return visitContent;
    }

    public void setVisitContent(VisitContent visitContent) {
        this.visitContent = visitContent;
    }


    private VisitContent visitContent = VisitContent.Vaccination;


    public enum VisitContent {
        Vaccination(" "),
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
}







