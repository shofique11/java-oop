public class Employee {
    private Integer id;
    private String name;
    private  double salary;
    public void setId(Integer id) // method
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    public Integer getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
}
