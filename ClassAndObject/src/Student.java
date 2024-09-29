import java.util.Scanner;
public class Student {
    int id = 234; // data member (also instance variable
    String name ="Shofique"; // data member (also instance variable
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student s1 = new Student(); // create object
        System.out.println(s1.id); // access the data member use object
        System.out.println(s1.name);
        Techer techer = new Techer(456, "Shofique", "Computer engineering");
        System.out.println("Name: "+ techer.getName());
        System.out.println("ID: "+ techer.getId());
        System.out.println("Department: "+ techer.getDepartment());
        techer.display();
        // create object of employee
        Employee employee = new Employee();
        for(int i=1;i<3;i++){
            employee.setId(scanner.nextInt());
            employee.setName(scanner.next());
            employee.setSalary(scanner.nextDouble());
        }
        for(int j =1; j<3; j++)
        {
            System.out.println("Employee id: "+employee.getId());
            System.out.println("Employee name: "+ employee.getName());
            System.out.println("Employee salary: "+employee.getSalary());
        }

    }
}