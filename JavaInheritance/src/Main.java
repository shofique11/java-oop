//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(); // create object of child class
        dog.name = "Buddy"; // child class object get super class properties
        dog.eat(); //child class object get super class method
        dog.sound();
        // create object multi level inheritance
        Puppy puppy = new Puppy(); // last level child class object
        puppy.name = "Puddy"; // access parent of super class properties
        puppy.play(); // access own class method
        puppy.eat();// access parent of super class method
        puppy.sound();// access super class method

    }
}