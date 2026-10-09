import java.util.Scanner;

public class FaixaEtaria {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade, i;
		int q1, q2, q3, q4, q5;
		double p1, p2, p3, p4, p5;
		
		q1 = 0;
		q2 = 0;
		q3 = 0;
		q4 = 0;
		q5 = 0;
		
		i = 1;
		
		while (i <= 10) {
			
			System.out.println("Insira a idade: ");
			idade = leia.nextInt();
			
			if (idade <= 15) {
				q1 = q1 + 1;
			}
			else if (idade <= 30) {
				q2 = q2 + 1;
			}
			else if (idade <= 45) {
				q3 = q3 + 1;
			}
			else if (idade <= 60) {
				q4 = q4 + 1;
			}
			else {
				q5 = q5 + 1;
			}
			
			i++;
		}
		
		p1 = q1 * 100.0 / 10;
		p2 = q2 * 100.0 / 10;
		p3 = q3 * 100.0 / 10;
		p4 = q4 * 100.0 / 10;
		p5 = q5 * 100.0 / 10;

		System.out.println("Faixa 1 - Quantidade: " + q1 + " - " + p1 + "%");
		System.out.println("Faixa 2 - Quantidade: " + q2 + " - " + p2 + "%");
		System.out.println("Faixa 3 - Quantidade: " + q3 + " - " + p3 + "%");
		System.out.println("Faixa 4 - Quantidade: " + q4 + " - " + p4 + "%");
		System.out.println("Faixa 5 - Quantidade: " + q5 + " - " + p5 + "%");
		
	}
}
