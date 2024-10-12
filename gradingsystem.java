import java.util.Scanner;

public class gradingsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your exam score: ");
        
        if (sc.hasNextInt()) {
            int score = sc.nextInt();
            String grade;
            
            switch (score / 10) {
                case 10:
                case 9:
                    grade = "A (Excellent)";
                    break;
                case 8:
                    grade = "B (Very Good)";
                    break;
                case 7:
                    grade = "C (Good)";
                    break;
                case 6:
                    grade = "D (Satisfactory)";
                    break;
                default:
                    if (score >= 0 && score < 60) {
                        grade = "F (Fail)";
                    } else {
                        grade = "Invalid score";
                    }
                    break;
            }
            
            System.out.println("Your grade is: " + grade);
        } else {
            System.out.println("Invalid input. Please enter a valid integer score.");
        }
        
        sc.close();
    }
}