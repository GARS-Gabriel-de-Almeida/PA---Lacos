package nivel3For;
import java.util.Scanner;
public class TabuadaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
	
		int i,n;
		
		System.out.println("Insira um número: ");
		n = leia.nextInt();
		
		for (i=1;i<=10;i++) {
			System.out.println(n+" X "+ i +" = "+ n*i);
		}

	}

}
