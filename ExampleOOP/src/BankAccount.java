public class BankAccount {
    //Encapsulation example
    private double balance;
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }
    public double getBalance()
    {
        return balance;
    }
    public double deposit(double amount)
    {
        if(amount > 0)
        {
            return  balance+=amount;
        }
      return  balance;
    }
    public  double withdraw(double amount)
    {
        if(balance > amount && amount > 0)
        {
            return balance -=amount;
        }
        return balance;
    }
}
