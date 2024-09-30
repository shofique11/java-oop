public abstract class Employee {
    protected Integer id;
    protected String name;
    abstract void event();
    public Employee(Integer id, String name){
        this.id=id;
        this.name = name;
    }
}
