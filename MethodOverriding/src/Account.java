public class Account extends Calculator{
    private double overtimeBill;

    public void setOvertimeBill(double overtimeBill) {
        this.overtimeBill = overtimeBill;
    }

    public double total() // method overriding
    {
        return this.salary + this.insentive + this.overtimeBill;
    }
}
