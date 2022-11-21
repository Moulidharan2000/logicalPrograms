package logicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int num = s.nextInt();
		int first = 0;
		int second = 1;
		for (int i=1; i<=num; i++) {
			int next = first+second ;
			first = second;
			second = next;
			
			System.out.print(first+" , ");
			
		}

	}

}
