import java.util.Scanner;
public class Altura {

	public Altura() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		double joao, pedro, i;
		
		joao = 1.34;
		pedro = 1.45;
		i = 1;
		
		while (pedro > joao ) {
			
			joao = joao +  0.25;
			pedro = pedro + 0.2;
			
			System.out.println("Pedro:  " + pedro + " João: " + joao + " em " + i + " anos");
			
			i = i+1;
			
				
			}
		}
		
	}

