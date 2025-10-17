import java.util.Scanner;

public class NumberTrianglePattern {
    public static void main(String[] args) {
                
        // TODO: Step 1 - Get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int input = sc.nextInt();

        // TODO: Step 2 - Generate the number triangle pattern

        if (input > 0) {
            for (int i = 1; i < input + 1; i++) {
                for (int j = 1; j < i + 1; j++) {
                    if (j == i) {
                        System.out.print(j);
                    }
                    else {
                        System.out.print(j + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}