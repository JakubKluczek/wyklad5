public class Accountant extends Employee {

    public Accountant(String name, String lastName, String pesel, String email) {
        super(name, lastName, pesel, email);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary();
    }
}
