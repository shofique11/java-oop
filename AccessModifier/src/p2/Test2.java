package p2;

public class Test2 {
    Demo2 demo2 = new Demo2("Computer Engineering");
    public void display2() // Public access modifier that can access out of this package
    {
        System.out.println("Python Programming");
        demo2.getDepartment(); // access protected in same package
    }
}
