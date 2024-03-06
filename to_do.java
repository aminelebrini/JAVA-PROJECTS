import java.util.Scanner;
import java.util.ArrayList;

public class to_do {

    private ArrayList<String> tasks;

    public to_do()
    {
        tasks = new ArrayList<>();
    }

    public void addTask(String task)
    {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void removeTask(int index)
    {
        if (index >= 0 && index < tasks.size()) {

            String removedTask = tasks.remove(index);
            System.out.println("Task removed: " + removedTask);
        }
        else {
            System.out.println("Invalid index");
        }
    }

    public void displayTasks()
    {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in list");
        }
        else {
            System.out.println("Tasks:");
            for(int i = 0; i < tasks.size(); i++)
            {
                System.out.println((i+1)+". "+ tasks.get(i));
            }
        }
    }
    public static void main(String[] args) {
        to_do todoList = new to_do();
        Scanner scanner= new Scanner(System.in);

        int choice;

        do{
            System.out.println("\nTodo List Menu : ");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Exit");
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Enter task to add : ");
                    String taskToAdd = scanner.nextLine();
                    todoList.addTask(taskToAdd);
                    break;
            
                case 2:
                    System.out.println("Enter index of task to remove : ");
                    int indexToRemove = scanner.nextInt();
                    todoList.removeTask(indexToRemove);
                    break;

                case 3:
                    todoList.displayTasks();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, please enter a number : ");
            }
        } while (choice != 4);
        
        scanner.close();
    }
}
