import java.util.Scanner;

public class doFac {

	public doFac() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leia = new Scanner(System.in);
		
		int num, fat, i;
		
		i=1;
		
	
		
		System.out.println("Insira um número: " );
		fat = leia.nextInt();
	
		num = fat; 
	do {
		num = num - 1;
		fat = fat * num;
		
	}while (num>i);
		System.out.println(fat);
		
		
		
	

		}
	}
