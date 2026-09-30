import java.util.Scanner;
public class fatoracao {

	public fatoracao() {
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
		
		while (i<num) {
		
		num = num - 1;
		fat = fat * num;
		
		}
		System.out.println(fat);

		
		
	}

}
