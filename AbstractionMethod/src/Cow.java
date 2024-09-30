import javafx.scene.Parent;

public class Cow extends Animal{

   public  Cow(String name)
   {
       super(name);
   }
    public void sound()
    {
        System.out.println(this.name+" Cow make sounds Humba");
    }
    public void eat()
    {
        System.out.println("Cow is eating grasses");
    }
}
