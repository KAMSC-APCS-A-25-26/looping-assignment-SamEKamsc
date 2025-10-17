import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {     
        // TODO: Step 1 - Get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int input = sc.nextInt();
        System.out.println();
        // TODO: Step 2 - Validate input
        if (input < 2) {
            System.out.println("Error: Input must be 2 or greater.");
        }
        else {
            int total = 0;
            for (int i = 0; i < input+1; i=i+2) {
                total += i;
            }
            System.out.println("The sum of even numbers between 2 and " + input + " is " + total + ".");
        }
        // TODO: Step 3 - Calculate sum of even numbers
        
        // TODO: Step 4 - Display the result

    }
}
