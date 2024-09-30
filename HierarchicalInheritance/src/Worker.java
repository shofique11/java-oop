public class Worker extends Management{
    public String department;
    public String position;

    Worker(Integer id, String name, double salary) {
        super(id, name, salary);
    }
    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
