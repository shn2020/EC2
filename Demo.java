import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int[] num = new int[5];
		Scanner input = new Scanner(System.in);
		
		// Initialize sum, max, min and median
		int sum = 0;
		int max = -10000000;
		int min = 10000000;
		int median = 0;
		double average = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter value for number " + (i+1) + ": ");
			num[i] = input.nextInt();
			sum += num[i]; // sum up values 
			if (num[i] > max) max = num[i]; // change max to the bigger value
			if (num[i] < min) min = num[i]; // change min to the smaller value
		}
		median = num[3];
		average = sum/5;
		
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		System.out.println("Median = " + median);
	}
}
