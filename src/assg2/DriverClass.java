package assg2;

import java.util.Arrays;
import java.util.Scanner;


public class DriverClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of currency notes in your country");
		int size=sc.nextInt();
		
		int currency[]=new int[size];
		System.out.println("Please enter the Note denominations");
		for (int i = 0; i < currency.length; i++) {
			currency[i] = sc.nextInt();
		}
		
		System.out.println("Before Sorting "+Arrays.toString(currency));
		
		InsertionSort is=new InsertionSort();
		is.sort(currency);
		System.out.println("After Sorting : "+Arrays.toString(currency));
		
		System.out.println("Enter Amount you wish to exchange");
		int amount=sc.nextInt();
		
		NoteCount nc=new NoteCount();
		nc.counting(currency,amount);
				
		

	}

}
