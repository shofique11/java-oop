abstract class Vehicle {
    // Example abstract class
    abstract void start();
    public void stop()
    {
        System.out.println("Vehicle car is stopped");
    }
}
class Car extends Vehicle {
    void start(){
        System.out.println("Vehicle car is started");
    }
}
