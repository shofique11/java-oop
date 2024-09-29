public class Calculator {
    //Polymorphism example
    public  int add(int a, int b)
    {
        return a + b;
    }
    public double add(double a, double b)
    {
        return  a + b;
    }
    public int add(int x, int y, int z)
    {
        return x + y + z;
    }
    public String add(String s1, String s2)
    {
        return s1.concat(s2);
    }
}
