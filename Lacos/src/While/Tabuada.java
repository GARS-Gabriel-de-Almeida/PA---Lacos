import java.util.Scanner;
public class Tabuada {

	public Tabuada() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner leia = new Scanner (System.in);
			int n, r, i = 0;
			System.out.println("digite um número inteiro");
			n = leia.nextInt();
			while(i<=10) {
				
				r = n*i;
				
				System.out.println(n+"x"+i+"="+r);
				i++;
			}
		 }

	}
