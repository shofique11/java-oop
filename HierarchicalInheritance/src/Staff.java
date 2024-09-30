public class Staff extends Management{
    public String department;

    Staff(Integer id, String name, double salary) {
        super(id, name, salary);
    }
    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
