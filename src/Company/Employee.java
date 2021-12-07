package Company;

public class Employee {
    protected final String name;
    protected float salary;

    public Employee(String name){
        this.name = name;

    }

    public float getSalary(){

        return this.salary;
    }
}
