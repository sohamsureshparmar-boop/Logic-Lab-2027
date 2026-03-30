import java.util.Scanner;

public class SpecialNumber {
    // Function to calculate factorial of a digit
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        // Extract digits and sum their factorials
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        // Logic check
        if (sum == num) {
            System.out.println(num + " is a Special Number. Logic compiled.");
        } else {
            System.out.println(num + " is not a Special Number.");
        }
        sc.close();
    }
}
