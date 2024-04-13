import java.util.Date;

public class SeniorDev extends Employee{
    private int hireYear;

    public SeniorDev(String name, String lastName, String pesel, String email, int hireYear) {
        super(name, lastName, pesel, email);
        this.hireYear=hireYear;
    }
    @Override
    public void displayInfo() {
        System.out.println("Junior dev: "+name+" "+ lastName);
    }

    @Override
    public String toString() {
        return this.lastName+" "+ this.name;
    }

    @Override
    public double calculateSalary() {
        double salary=super.calculateSalary();
        int currentYear=new Date().getYear();
        int fullEmploymentYears=currentYear-hireYear;

        salary+=fullEmploymentYears*2000;
        return salary;
    }
}
