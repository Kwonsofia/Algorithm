package baek_algorithm;
import java.util.Scanner;
public class Baek_2439 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
            for(int k=0;n-i>k;k++){
                System.out.print(" ");
            }
			for(int j=0;i>j;j++) {
				System.out.print("*");	
			}
			System.out.println();
		}

	}

}
