package WorkHome2;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Henrich", "Tifard","red", 1997);
		Person p2 = new Person("Maryan", "Ivanovskiy","green", 2000);
		Person p3 = new Person("Ivan", "Dubovich","blue", 2003);
		Person p4 = new Person("Moris", "Lafarde","yellow", 1995);
		Person p5 = new Person("Michelle", "Yatok","white", 2001);
		System.out.println("Enter Year that is today ,for check all information about next person: "+p1.toString1());
        p1.getAge();
        System.out.println(p1);
        System.out.println("");
        System.out.println("Enter Year that is today ,for check all information about next person: "+p2.toString1());
        p2.getAge();
        System.out.println(p2);
        System.out.println("");
        System.out.println("Enter Year that is today ,for check all information about next person: "+p3.toString1());
        p3.getAge();
        System.out.println(p3);
        System.out.println("");
        System.out.println("Enter Year that is today ,for check all information about next person: "+p4.toString1());
        p4.getAge();
        System.out.println(p4);
        System.out.println("");
        System.out.println("Enter Year that is today ,for check all information about next person: "+p5.toString1());
        p5.getAge();
        System.out.println(p5);
        
	}

}
