package p2;

public class Demo2 {
    protected String department;
    Demo2(String department)
    {
        this.department = department;
    }
    protected void getDepartment()
    {
        System.out.println("Department: "+ this.department);
    }
}
