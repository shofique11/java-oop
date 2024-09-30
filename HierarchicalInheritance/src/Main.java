//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //HierachicalInhertance
        // create object and access from staff child class and super class properties
        Staff staff = new Staff(11158, "Shofique", 90000);
        staff.setDepartment("Digital team");
        System.out.println("Id: "+staff.id); // parent class properties
        System.out.println("Name: "+staff.name); // parent class properties
        System.out.println("Salary: "+staff.salary); // parent class properties
        System.out.println("Department: "+staff.getDepartment()); // parent class properties

        // create object and access from worker child class super class properties
        Worker worker = new Worker(14558, "Kamruzzaman", 50000);
        worker.setPosition("Line manager");
        worker.setDepartment("Production");
        System.out.println("Id: "+worker.id); // parent class properties
        System.out.println("Name: "+worker.name); // parent class properties
        System.out.println("Position: "+ worker.position);
        System.out.println("Salary: "+worker.salary);// parent class properties
        System.out.println("Department: "+worker.getDepartment());
    }
}