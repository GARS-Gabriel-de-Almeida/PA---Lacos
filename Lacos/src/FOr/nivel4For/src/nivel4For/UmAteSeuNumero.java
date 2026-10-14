package nivel4For;
import java.util.Scanner;

public class UmAteSeuNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in) ;
		
		int i,num;
		
		System.out.println("Insira um número: ");
		num = leia.nextInt();
		
		if (num>0) {
			for (i=1;i<=num;i++) {
				System.out.println(i);
			}
		}else {
			for (i=1;i>=num;i--) {
				System.out.println(i);
			}
		}
	}

}
