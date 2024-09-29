public class Animal {
    // Inheritance Example
    public void sound()
    {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    public void sound() {
        super.sound();
        System.out.println("Dog makes barks");
    }
}
