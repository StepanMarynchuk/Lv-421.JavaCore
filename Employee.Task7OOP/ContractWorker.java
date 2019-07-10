public class ContractWorker extends Employee implements PaymentCalculation {
    private int rate;
    private int hours;
    private int federalTaxIdNr;

    public int getFederalTaxIdNr() {
        return federalTaxIdNr;
    }

    public void setFederalTaxIdNr(int federalTaxIdNr) {
        this.federalTaxIdNr = federalTaxIdNr;
    }

    public ContractWorker(String name, int ID, int hours, int rate, int federalTaxIdNr) {
        super(name, ID);
        this.hours=hours;
        this.rate=rate;
        this.federalTaxIdNr=federalTaxIdNr;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public int calculateMethod() {
        return rate*hours;
    }

    @Override
    public String toString() {
        return "ContractWorker{" +
                "rate=" + rate +
                ", hours=" + hours +
                ", federalTaxIdNr=" + federalTaxIdNr +
                ", " + '\'' +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }

    @Override
    public int getSalary() {
        return calculateMethod();
    }
}
