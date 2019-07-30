package com.softserve;

public class ContractEmployee extends Employee{
    public ContractEmployee(String employeeId) {
        super (employeeId);
    }
    private int federalTaxIdmember;
    int fixedMonthlyPayment;

    public int calculatePay (){
        return fixedMonthlyPayment;
    }

    public ContractEmployee(String employeeId, int federalTaxIdmember, int fixedMonthlyPayment) {
        super (employeeId);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdmember=" + federalTaxIdmember +
                ", fixedMonthlyPayment=" + fixedMonthlyPayment +
                '}';
    }
}