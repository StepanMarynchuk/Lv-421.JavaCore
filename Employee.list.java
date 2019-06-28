import java.util.EnumMap;

public class List {
    public static void main (String[] args) {
        Employee w1 = new Employee("Oleh", 34, 160);
        Employee w2 = new Employee("Kolia", 32, 160);
        Employee w3 = new Employee("Halia", 38, 160);
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(Employee.getCount());
        w1.setHours(180);
        System.out.println(w1);
        System.out.println(w1.getHours());
        System.out.println(w1.getTotalSalaryPerWorker());
        System.out.println();
    }




}
