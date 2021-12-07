package Company;

public class CommercialEmloyee extends Employee {

    protected float salary;
    protected float tunrOver;

    public CommercialEmloyee(String name) {
        super(name);
    }
    public CommercialEmloyee(String name, float salary, float tunrOver){
        super(name);
        this.salary = salary;
        this.tunrOver = tunrOver;
    }

    public void setInfosSalary(float salary, float tunrOver){
        this.salary = salary;
        this.tunrOver = tunrOver;
    }

    public float getSalary(){

        return this.salary;
    }
}
