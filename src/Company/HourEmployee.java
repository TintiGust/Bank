package Company;

public class HourEmployee extends Employee {

    protected int nbHours;
    protected float hourPrice;
    protected int extraTime;
    protected float extraTimePrice;


    public HourEmployee(String name){
        super(name);

    }

    public void setInfosSalary(int nbHours, float hourPrice, int extraTime, float extraTimePrice){
        this.nbHours = nbHours;
        this.hourPrice = hourPrice;
        this.extraTime = extraTime;
        this.extraTimePrice = extraTimePrice;

    }

}
