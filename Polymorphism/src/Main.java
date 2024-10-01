//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("addition of 56 and 60 = "+calculator.add(56,60));
        System.out.println("addition of 30 and 45 and 70 = "+calculator.add(30,45,70));
        System.out.println("addition of 63.7 and 20.8 = "+calculator.add(63.7,20.8));
        Parent parent = new Parent();
        parent.printState();
        SubClass1 subClass1 = new SubClass1();
        subClass1.printState();
        Subclass2 subclass2 = new Subclass2();
        subclass2.printState();

    }
}