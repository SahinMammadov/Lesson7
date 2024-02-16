package Task1;

public class PartTimeEmployee {
    private String name;
    private int experience;
    private int hours;
    private double hourlySalary;

    public PartTimeEmployee(String name, int experience, int hours, double hourlySalary){
        this.name = name;
        this.experience = experience;
        this.hours = hours;
        this.hourlySalary = hourlySalary;
    }

    public double getSalary() {
        return hours * hourlySalary;
    }
    public int getExperience() {
        return experience;
    }

    public String getName(){
        return name;
    }
}
