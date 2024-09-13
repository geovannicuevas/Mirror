import java.util.Scanner;

public class SkincareRoutineCategorizer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for budget
        System.out.println("Enter your budget for skincare products (in USD): ");
        double budget = scanner.nextDouble();

        // Take user input for level of routine
        System.out.println("Enter your routine level (beginner, intermediate, advanced): ");
        String routineLevel = scanner.next().toLowerCase();

        // Categorize based on budget and routine level
        String category = categorizeRoutine(budget, routineLevel);
        System.out.println("Your routine category: " + category);

        scanner.close();
    }

    // Function to categorize based on budget and routine level
    public static String categorizeRoutine(double budget, String routineLevel) {
        String category = "";

        if (budget <= 50) {
            category += "Low Budget, ";
        } else if (budget <= 150) {
            category += "Moderate Budget, ";
        } else {
            category += "High Budget, ";
        }

        switch (routineLevel) {
            case "beginner":
                category += "Beginner Routine";
                break;
            case "intermediate":
                category += "Intermediate Routine";
                break;
            case "advanced":
                category += "Advanced Routine";
                break;
            default:
                category += "Unknown Routine Level";
                break;
        }

        return category;
    }
}
