public class SalariedEmployee extends Employee implements PaymentCalculation {
   // private int salary;
    private int socialSecurityNumber;
    public SalariedEmployee(String name,int ID, int socialSecurityNumber){
        super(name,ID);
        this.socialSecurityNumber=socialSecurityNumber;
       // this.salary=salary;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public int calculateMethod() {
        return (2000);
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber=" + socialSecurityNumber +
                 + '\'' +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                '}';

    }

    @Override
    public int getSalary() {
        return calculateMethod();
    }
}
