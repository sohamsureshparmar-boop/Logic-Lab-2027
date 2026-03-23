/**
 * @Project: Logic-Lab-2027
 * @Description: ISC Grade 12 - Digital Manipulation Logic
 * Task: Accept a number and determine if the Sum of its digits equals the Product of its digits.
 */

import java.util.Scanner;

public class DigitSumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int temp = num;
        int sum = 0;
        int product = 1;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        
        if (sum == product) {
            System.out.println(num + " satisfies the Sum-Product logic.");
        } else {
            System.out.println(num + " does not satisfy the Sum-Product logic.");
        }
        
        sc.close();
    }
}
