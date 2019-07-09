public class Employee {
    /*Create Console Application project in Java.
Add class Employee to the project.
Class Employee should consist of
	three private fields: name, rate and hours;
	static field totalSum
	properties for access to these fields;
	default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
	methods:
getSalary() - to calculate the salary of person (rate * hours)
toString() - to output information about employee
changeRate(int rate) - to change the rate of some employee and recalculate his salary
getBonuses() – to calculate 10% from salary
In the method main() create 3 objects of Employee type. Input information about them.
}*/
    private String name;
    private int rate;
    private int hours;
    private double salary;
    private double bonus;
    private double totalSalaryPerWorker;
    private static double sum = 0;
    private static double count = 0;

    public Employee() {
        count++;
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
        count++;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;

    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    private double getSalary() {

        return rate * hours;
    }

    private double getBonus() {
        return getSalary() * 0.10;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                ", bonus=" + getBonus() +
                '}';
    }

    public static double getCount() {
        return count;
    }
    public double getTotalSalaryPerWorker(){
        return getSalary() + getBonus();
    }

    public void setTotalSalaryPerWorker(double totalSalaryPerWorker) {
        this.totalSalaryPerWorker = totalSalaryPerWorker;
        sum = totalSalaryPerWorker + sum;
    }

    public static double gettotalSum (){
        return sum*count;
    }
}












