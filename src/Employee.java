public class Employee {
    protected String name;
    protected String lastName;
    protected String pesel;
    protected String email;

    protected double baseSalary;

    public Employee(String name, String lastName, String pesel, String email) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = pesel;
        this.email = email;
    }
    public void displayInfo(){
        System.out.println("Junior dev: "+name+" "+ lastName);
    }

    public double calculateSalary(){
        return baseSalary;
    }
}
