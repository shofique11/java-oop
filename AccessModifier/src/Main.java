import p1.Test1;
import p2.ChildDemo2;
import p2.Demo2;
import p2.Test2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Test1 test1 = new Test1();
//        test1.getTest1(); // default access modifier not access
        Test2 test2 = new Test2();
        test2.display2();
        Demo1 demo1 = new Demo1();
        demo1.setName("Md Abdullah Jahangir");
       // demo1.getName(); // private modifier not access from out of the class,
        //Demo2 demo2 = new Demo2();
       // demo2.getDepartment(); // never access out the package
        test2.display2();
        ChildDemo2 childDemo2 = new ChildDemo2("Shofique");
        childDemo2.display4();
    }
}