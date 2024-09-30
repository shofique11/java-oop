//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.setSalary(40000);
        calculator.setInsentive(22000);
        System.out.println("Total amount: "+ calculator.total());
        Account account = new Account();
        account.setSalary(30000);
        account.setInsentive(18000);
        account.setOvertimeBill(5000);
        System.out.println("Total amount: "+ account.total());
    }
}