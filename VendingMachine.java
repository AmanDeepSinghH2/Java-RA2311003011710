import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for juice or 2 for soda:");
        int choice = sc.nextInt();
        if(choice == 1) {
            System.out.println("Dispensing Juice");
        }
        else if(choice == 2) {
            System.out.println("Dispensing Soda");
            }
        sc.close();           
}
}