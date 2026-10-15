package nivel4For;
import java.util.Scanner;
public class MaiorDos10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int i, numProx, resul;
		
		System.out.println("Insira o 1º número: ");
	    resul = leia.nextInt();
	    
		for (i = 2; i <= 10; i++) {
		    System.out.println("Insira o " + i + "º número: ");
		    numProx = leia.nextInt();
		    
		    if (numProx>resul)
		    resul = numProx;
		}
		System.out.println("Maior número: "+resul);
	}

}
