package p2;
public class ChildDemo2 extends Demo2{
    public int id;

    public ChildDemo2(String department) {
        super(department);
    }

    public void display4()
    {
        ChildDemo2 childDemo2 = new ChildDemo2("Software engineering");
        childDemo2.getDepartment(); // protected access in child class
        System.out.println("Object Oriented programming protected Access modifier");
    }
}
