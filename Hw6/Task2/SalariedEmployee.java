package com.softserve;

public class SalariedEmployee extends Employee {

    public SalariedEmployee (String employeeId){
        super (employeeId);
    }

    int hours;
    int rate;
    private int socialSecurityNumber;

    public SalariedEmployee(String employeeId, int hours, int rate, int socialSecurityNumber) {
        super (employeeId);
        this.hours = hours;
        this.rate = rate;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int calculatePay() {
        return rate*hours;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "hours=" + hours +
                ", rate=" + rate +
                ", socialSecurityNumber=" + socialSecurityNumber +
                '}';
    }
}
