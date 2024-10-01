public class Calculator {
    // Compile-time polymorphism
    public int add(int a, int b)
    {
        return  a+b;
    }
    public int add(int a, int b, int c)// method overloading
    {
        return  a+b+c;
    }
    public double add(double a, double b)// method overloading
    {
        return a+b;
    }
}
