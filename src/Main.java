import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> technologies=new ArrayList<>();
        technologies.add("java");
        technologies.add("html");

        Task t1=new Task();
        t1.bonus=4500;
        t1.name="Implement fb login";
        t1.description="aaa";


        SeniorDev sd=new SeniorDev("John", "Doe", "1234", "doe@wp.pl", 10);
        JunioerDev jd=new JunioerDev("Anna", "Smith", "3333", "Anna@wp.pl", technologies);
        Manager md=new Manager("Andrew", "Smith", "12333", "smith@wp.pl");
       // md.addCompletedTask(t1);

        System.out.println(sd);

        Company c=new Company();
        c.name="abc";
        c.employees=new ArrayList<>();
        c.employees.add(sd);
        c.employees.add(jd);
        c.employees.add(md);


    }
}