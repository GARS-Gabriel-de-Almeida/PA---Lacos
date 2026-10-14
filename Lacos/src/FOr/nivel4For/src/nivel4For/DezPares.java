package nivel4For;
import java.util.Scanner;
public class DezPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in) ;
		
		int i, num;
		
		for (i=1;i<=10;i++) {
			System.out.println("Insira o " +i+ "º número: ");
			num = leia.nextInt();
			if(num % 2 == 0) {
				System.out.println(num+ " é par!");
			}
		}
		
		
		
	}

}
