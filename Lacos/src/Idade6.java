import java.util.Scanner;
public class Idade6 {

	public Idade6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		int idade, i = 1;
		while(i<7) {
			System.out.println("digite a idade da "+i+"a. pessoa");
			idade = leia.nextInt();
			if (idade<18) {
				System.out.println("Menor de idade");
			} else {
				System.out.println("Maior de idade");
			}
			i++;

	}

	}
	}