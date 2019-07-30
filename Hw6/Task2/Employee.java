package com.softserve;

public class Employee implements CalculatePay{
    private String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public int calculatePay() {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                '}';
    }
}
