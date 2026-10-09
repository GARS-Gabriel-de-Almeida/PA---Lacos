import java.util.Scanner;

public class fibonacciDo {

	public fibonacciDo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int n, n1, n2, resultado, i;
		System.out.println("Insira o valor ordinal do termo: ");
		n = leia.nextInt();
		
		n1 = 1;
		n2 = 1;
		i = 1;
		
		while(i<=n) {
			System.out.println(n1);
			resultado = n1 + n2;
			n1 = n2;
			n2 = resultado;
			i++;
		}
			

	}

}
