package Task1;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<FullTimeEmployee> fullTimeEmployees = new ArrayList<>();
        fullTimeEmployees.add(new FullTimeEmployee("Shahin", 4, 3500));
        fullTimeEmployees.add(new FullTimeEmployee("Natiq", 3, 1500));
        fullTimeEmployees.add(new FullTimeEmployee("Aslan", 1, 800));
        fullTimeEmployees.add(new FullTimeEmployee("Tofiq", 1, 900));

        ArrayList<PartTimeEmployee> partTimeEmployees = new ArrayList<>();
        partTimeEmployees.add(new PartTimeEmployee("Vaqif", 3, 12, 30));
        partTimeEmployees.add(new PartTimeEmployee("Nigar", 1, 15, 20));
        partTimeEmployees.add(new PartTimeEmployee("Aydan", 2, 10, 50));
        partTimeEmployees.add(new PartTimeEmployee("Cavad", 3, 12, 60));

        ArrayList<FullTimeEmployee> filteredFullTimeEmployees  = new ArrayList<>();
        for (FullTimeEmployee employee : fullTimeEmployees){
            if(employee.getExperience()>2){
                filteredFullTimeEmployees .add(employee);
            }
        }

        ArrayList<PartTimeEmployee> filteredPartTimeEmployees = new ArrayList<>();
        for (PartTimeEmployee employee : partTimeEmployees){
            if(employee.getExperience()>2){
                filteredPartTimeEmployees.add(employee);
            }
        }

        Collections.sort(filteredFullTimeEmployees, Comparator.comparingDouble(FullTimeEmployee::getSalary));

        Collections.sort(filteredPartTimeEmployees, Comparator.comparingDouble(PartTimeEmployee::getSalary));

        for (FullTimeEmployee employee : filteredFullTimeEmployees) {
            System.out.println("Full Time Employee - Name: " + employee.getName() + ", Salary: " + employee.getSalary());
        }

        for (PartTimeEmployee employee : filteredPartTimeEmployees) {
            System.out.println("Part Time Employee - Name: " + employee.getName() + ", Salary: " + employee.getSalary());
        }
        
        Map<String, Double> salaryMap = new HashMap<>();
        if (!filteredFullTimeEmployees.isEmpty()) {
            FullTimeEmployee maxFullTimeEmployee = filteredFullTimeEmployees.get(filteredFullTimeEmployees.size() - 1);
            FullTimeEmployee minFullTimeEmployee = filteredFullTimeEmployees.get(0);
            salaryMap.put("Max FullTime Salary", maxFullTimeEmployee.getSalary());
            salaryMap.put("Min FullTime Salary", minFullTimeEmployee.getSalary());
        }
        if (!filteredPartTimeEmployees.isEmpty()) {
            PartTimeEmployee maxPartTimeEmployee = filteredPartTimeEmployees.get(filteredPartTimeEmployees.size() - 1);
            PartTimeEmployee minPartTimeEmployee = filteredPartTimeEmployees.get(0);
            salaryMap.put("Max PartTime Salary", maxPartTimeEmployee.getSalary());
            salaryMap.put("Min PartTime Salary", minPartTimeEmployee.getSalary());
        }

        System.out.println("Maksimum ve minimum maaşlar:");
        for (Map.Entry<String, Double> entry : salaryMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}