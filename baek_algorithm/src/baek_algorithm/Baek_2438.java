package baek_algorithm;

import java.util.Scanner;

public class Baek_2438 {
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;i>j;j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		sc.close();
	}
}
