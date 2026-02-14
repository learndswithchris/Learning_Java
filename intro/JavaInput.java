// Introduction to input statements in Java



// iMPORT THE SCANNER CLASS

 import java.util.Scanner;

public class JavaInput{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Enter task
        System.out.println("Enter your new task(s): ");
        String task = input.nextLine();


        // Enter task priority
        System.out.println("Enter priority(High / Medium /Low): ");
        String priority = input.nextLine();


        // Enter Estimated hours
        System.out.println("Enter estimated hours to complete the task: ");
        int hours = input.nextInt();

        // Display the task details
        System.out.println("\n======Task Details======");
        System.out.println("This is your new task: " + task);
        System.out.println("Priority: " + priority);
        System.out.println("Estimated hours: " + hours);
        input.close();


    }
}


