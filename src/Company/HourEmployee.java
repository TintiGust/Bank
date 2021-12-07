package Company;

public class HourEmployee extends Employee {

    protected int nbHours;
    protected float hourPrice;
    protected int extraTime;
    protected float extraTimePrice;
    protected float salary;


    public HourEmployee(String name){
        super(name);
    }
    public HourEmployee(String name, int nbHours, float hourPrice, int extraTime, float extraTimePrice){
        super(name);
        this.nbHours = nbHours;
        this.hourPrice = hourPrice;
        this.extraTime = extraTime;
        this.extraTimePrice = extraTimePrice;
    }

    public void setInfosSalary(int nbHours, float hourPrice, int extraTime, float extraTimePrice){
        this.nbHours = nbHours;
        this.hourPrice = hourPrice;
        this.extraTime = extraTime;
        this.extraTimePrice = extraTimePrice;
    }

    public float getSalary(){

        return this.salary;
    }
}
