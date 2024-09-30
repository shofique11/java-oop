abstract class Animal {
    protected String name;
    public Animal(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
    abstract void sound();
    abstract void eat();
    public void sleep()
    {
        System.out.println("This animal is sleeping");
    }
}
