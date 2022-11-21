package logicalPrograms;

import java.util.Scanner;

public class PerfectNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int num = s.nextInt();
		int sum = 0;
		for(int i=1; i<num; i++) {
			
			if(num%i==0) {
				sum = sum+i;
				System.out.print(i+",");
				
			}
		}
			if(sum == num) {
				System.out.println(num+" is a Perfect Number");
			}
			else {
				System.out.println(num+" is not a Perfect Number");
			}
		

	}

}
