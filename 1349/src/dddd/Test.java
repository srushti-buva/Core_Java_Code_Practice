package dddd;

public class Test {

    public static void main(String[] args) {

        Campany campany = new Campany();

        Employee employee = campany.getEmployee();

        Project project = employee.getProject();

        Module module = project.getModule();

        Task task = module.getTask();

        String name = task.TaskName();

        System.out.println(name);
    }
}