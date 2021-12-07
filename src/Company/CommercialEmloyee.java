package Company;

public class CommercialEmloyee extends Employee {

    protected float salary;
    protected float tunrOver;

    public CommercialEmloyee(String name) {
        super(name);
    }

    public void setInfosSalary(float salary, float tunrOver){
        this.salary = salary;
        this.tunrOver = tunrOver;
    }

}
