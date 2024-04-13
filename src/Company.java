import java.util.ArrayList;

public class Company {
    public String name;
    public String description;

    public ArrayList<Employee> employees;

    public void displayEmployeesInfo(){
        for(Employee e : employees) {
            e.displayInfo();
        }
    }
    public double calculateMonthlyCost(){
        double cost=0;
        for(Employee e : employees){
            cost+=e.calculateSalary();
        }
        return cost;

    }

}
