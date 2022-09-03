package numbersprime;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		//Create a Scanner
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.print("Digite até que numero voce quer numeros primos: ");
        int nFinal = sc.nextInt();
        for (i = 1;i <= nFinal; i++) {
        	for (j = 2; j < i;j++) {
        		if (i % j == 0) {
        			break;
        		}
        	}
        	if (i==j) {
        		System.out.print("numero primo: " + i);
        		System.out.println("");
        	}
        }
	}
}
