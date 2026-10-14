package nivel4For;
import java.util.Scanner;
public class Somade10Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int i, numProx;
		int resul = 0; 

		for (i = 1; i <= 10; i++) {
		    System.out.println("Insira o " + i + "º número: ");
		    numProx = leia.nextInt();
		    
		    resul = resul + numProx; 
		}

		System.out.println("A soma dos 10 números é: " + resul);

		}
	}

