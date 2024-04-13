import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<Task> tasks;
    public Manager(String name, String lastName, String pesel, String email) {
        super(name, lastName, pesel, email);
    }
    public void addCompletedTask(Task task){
        tasks.add(task);
    }
}
