import java.util.ArrayList;

public class JunioerDev extends Employee{

    private ArrayList<String> technologies;

    public JunioerDev(String name, String lastName, String pesel, String email, ArrayList<String> technologies) {
        super(name, lastName, pesel, email);
        this.technologies=technologies;

    }

    @Override
    public void displayInfo() {
        System.out.println("Junior dev: "+name+" "+ lastName+ " " + technologies.size());
    }

    @Override
    public double calculateSalary() {
        double salary=super.calculateSalary();
        salary+=technologies.size()*1000;
        return salary;
    }
}
