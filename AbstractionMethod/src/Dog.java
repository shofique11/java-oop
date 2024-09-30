public class Dog extends Animal{

    public Dog(String name)
    {
        super(name);
    }
    public void sound(){
        System.out.println(this.name+" Dog is barking");
    }
    public void eat()
    {
        System.out.println("Dog is eating meat");
    }
}
