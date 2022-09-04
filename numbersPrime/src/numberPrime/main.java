package numberPrime;

import java.math.BigInteger;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//Create a Scanner
        Scanner sc = new Scanner(System.in);
        
        //Input User
        System.out.print("Até que numero você quer que vá: ");
        int valFinal = sc.nextInt();
        
        for (int i = 1 ; i < valFinal; i++) {
        	boolean isPrime = BigInteger.valueOf(i).isProbablePrime(1);
            if (isPrime == true) {
            	System.out.println(i);
            }
            else {
            	
            }
        }
	}
}