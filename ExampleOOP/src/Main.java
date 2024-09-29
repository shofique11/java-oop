//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(150000);
        System.out.println("My account balance: "+account.getBalance());
        account.deposit(6000);
        System.out.println("My account balance: "+account.getBalance());
        account.withdraw(20000);
        System.out.println("Mty account balance: "+ account.getBalance());

        Dog dog = new Dog();
        dog.sound();

        Calculator calculator = new Calculator();
        System.out.println("Call integer sum: "+calculator.add(40,60));
        System.out.println("Call double number sum: "+calculator.add(30.70, 65.80));
        System.out.println("Call 3 integer number sum: "+calculator.add(75,50,25));
        System.out.println("Call String: "+ calculator.add("Java ","Programming"));
        Car car = new Car();
        car.start();
        car.stop();
        CampusLibrary campusLibrary = new CampusLibrary();
        campusLibrary.openLibrary();
        campusLibrary.closeLibrary();
    }
}