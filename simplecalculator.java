import java.util.Scanner;
public class simplecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for addition or 2 for subtraction:");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("The sum is: " + (a + b));
            } else if (choice == 2) {
                System.out.println("Enter two numbers:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("The difference is: " + (a - b));
                } else {
                    System.out.println("Invalid choice");
                    sc.close();
        }
}
}