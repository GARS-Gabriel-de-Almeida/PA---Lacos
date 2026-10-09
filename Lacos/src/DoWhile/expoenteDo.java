import java.util.Scanner;

public class expoenteDo {

	public expoenteDo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	    Scanner leia = new Scanner(System.in);
		
		int base, expo, i;
		
		System.out.println("Insira o valor da base: ");
		base = leia.nextInt();
		
		System.out.println("Insira o valor do expoente: ");
		expo = leia.nextInt();
		
		i = 1;
		
	do {		
			i = i *base;
			
			expo = expo -1;
		
	

	}while (expo > 0);
	System.out.println(i);
	}

}
