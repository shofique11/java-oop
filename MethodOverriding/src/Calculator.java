public class Calculator {
    protected double salary;
    protected double insentive;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setInsentive(double insentive) {
        this.insentive = insentive;
    }

    public double total() // method overriding
    {
        return this.salary + this.insentive;
    }

}
