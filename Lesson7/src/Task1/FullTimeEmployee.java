package Task1;
public class FullTimeEmployee {
    private String name;
    private int experience;
    private double salary;

    public FullTimeEmployee(String name, int experience, double salary){
        this.name=name;
        this.experience=experience;
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public int getExperience(){
        return experience;
    }
}
