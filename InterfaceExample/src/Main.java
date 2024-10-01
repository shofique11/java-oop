//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(5);
        bicycle.applyBreak(2);
        System.out.println("Bicycle present state :");
        bicycle.printStates();

        Bike bike = new Bike();
        bike.changeGear(5);
        bike.speedUp(80);
        bike.applyBreak(50);
        bike.printState();

    }
}