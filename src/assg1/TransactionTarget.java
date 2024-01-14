package assg1;

import java.util.Scanner;

public class TransactionTarget {
static int dayAchieved;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Number of Days Shop was open");
		int noOfDays = sc.nextInt();

		int revenue[] = new int[noOfDays];
		System.out.println("Please enter the collection for each day");
		for (int i = 0; i < revenue.length; i++) {
			revenue[i] = sc.nextInt();
		}

		System.out.println("Please enter Number of Targets");
		int totaltargets = sc.nextInt();

		for (int i = 1; i <= totaltargets; i++) {

			System.out.println("Please enter value of Target " + i);
			int target = sc.nextInt();

			if (targetAcheived(revenue, target))
				System.out.println("Target Achieved of Day " + dayAchieved);
			else
				System.out.println("Target Not Achieved");

		}

	}
	//fresher best practices you follow to write clean
//+3 years exp review my peers code
	// remove unecesary == for boleaan
	// use of functions to eliminate repitive code
	// proper naming conventions  for variable name/function name
	// package segregation
	// eliminate multiple returns wherever possible
	
	private static boolean targetAcheived(int[] revenue, int target) {
		int sum = 0;
		boolean flag = false;
		for (int d = 0; d < revenue.length; d++) {
			sum += revenue[d];
			if (sum >= target) {
				dayAchieved=d+1;
				flag = true;
				break;
			}
		}
		return flag;
	}

}
