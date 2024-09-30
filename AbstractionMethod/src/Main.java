//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Lalu");
        cow.sound();
        cow.sleep();
        cow.eat();
        System.out.println("Name: "+cow.getName());
        Dog dog = new Dog("Pommy");
        dog.sound();
        dog.sleep();
        dog.eat();
        System.out.println("Name: "+dog.getName());
       Staff staff = new Staff(4533, "Shofique");
       staff.event();
       Worker worker = new Worker(5633,"Md Naim");
       worker.event();
    }
}