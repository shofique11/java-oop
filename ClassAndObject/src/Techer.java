public class Techer {
     private final int id; //State
     private final String name;
     private final String department;
     Techer(int ide, String namee, String departmentt){ //constructor
         this.department = departmentt;
         this.name = namee;
         this.id = ide;
     }
     public String getName() // method
     {
         return name;
     }
     public String getDepartment()
     {
         return department;
     }
     public int getId()
     {
         return id;
     }
     public void display()// method
     {
         System.out.println("Name: "+ this.name);
         System.out.println("Id: "+ this.id);
         System.out.println("department: "+ this.department);
     }
}
