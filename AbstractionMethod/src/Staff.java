public class Staff extends Employee{

    public Staff(Integer id, String name){
        super(id, name);
    }
    public void event(){
        System.out.println("Id No: "+ this.id + ",Name: "+this.name +" can attend the staff party");
    }
}
