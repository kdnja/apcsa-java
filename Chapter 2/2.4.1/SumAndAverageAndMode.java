
/*
 * Activity 2.4.1
 */

import java.util.Scanner;

public class SumAndAverageAndMode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a series of numbers, separated by spaces: ");
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        int sum = 0;
        int mode = 0;
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
            count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (Integer.parseInt(numbers[i]) == Integer.parseInt(numbers[j])) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = Integer.parseInt(numbers[i]);
            }
        }
        
        double average = (double) sum / numbers.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Mode: " + mode);
    }
}