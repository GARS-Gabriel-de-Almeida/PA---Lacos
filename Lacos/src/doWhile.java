import java.util.Scanner;
public class doWhile {

	public doWhile() {
		
	} public static void main(String[] args)
	
	{
		Scanner in = new Scanner (System.in);
		
		int i = 2;
		double n1, n2, media;
		do {
			System.out.println("Entre com a nota 1: ");
			n1 = in.nextDouble();
			System.out.println("Entre com a nota 2: ");
			n2 = in.nextDouble();
			media = (n1+n2)/2;
			System.out.println("Media = "+media);
			System.out.println("\n Deseja continuar? 1-Sim / 1-Não");
			i=in.nextInt();
		} while (i==1);
		in.close();
		}
			
	{
		// TODO Auto-generated constructor st;ub
	}

}