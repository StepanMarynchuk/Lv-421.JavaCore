package study;

public class Employee {
	public static int sum = 0;
	  public static int count =0;
private String name;
private static int rate;
private int hours;
public Employee() {count++;}
 public String getName() {
	 return this.name;
 }
 public int getRate() {
	 return this.rate;
 }
 public int getHours() {
	 return this.getHours();
 }
public void setName(String name) {
	this.name = name;
}


public void setHours(int hours) {
	this.hours = hours;


}
public Employee(String name, int rate) {
	this.name = name;
	this.rate = rate;
}

public Employee(String name, int rate, int hours) {
	this.name = name;
	this.rate = rate;
	this.hours = hours;
}

public  int getSalary() {
	sum = sum + hours*rate;
	return hours*rate;
}
public String toString() {
	return name + " " + rate + hours;
}
public int changeRate(int rate) {
	
	return rate=rate /hours;
}
public static int getRateAvg() {
	return sum;

}
public double getBonuses() {
	return getSalary()*0.1;
}

		
		//commit
	
	
}
 


