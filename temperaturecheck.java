import java.util.Scanner;
public class temperaturecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature (celsius): ");
        int temp = sc.nextInt();
        if (temp > 30) {
            System.out.println("It's hot!");
            } else if (temp > 10 && temp < 20) {
                System.out.println("It's cool");
                } else if (temp > 20 && temp < 30) {
                    System.out.println("It's warm");
                    } else {
                        System.out.println("It's cold");
                        }
                        sc.close();
}
}
