import java.util.Scanner;

public class Calculadora {

	public int som(int num1, int num2) {
		return num1 + num2;
	}  

	public static void main(String[] args) {
		Calculadora c = new Calculadora();

		int opcao = 5;  
		int num1;  
		int num2;  

		Scanner input = new Scanner(System.in);
		System.out.println("-Escolha uma opção-");  
		System.out.println("1. Soma");  	
		System.out.println("0. Sair");    
        System.out.println("Operação: ");    
          
        opcao = input.nextInt();  

		while (opcao != 0) {
			Scanner input1 = new Scanner(System.in);    

			System.out.println("Qual o primeiro numero: ");  
			num1 = input1.nextInt();  
			System.out.println("Qual o segundo numero: ");  
			num2 = input1.nextInt();

			if ( opcao == 1 ) {
				int operacao = c.som(num1, num2);
				System.out.printf("\nO resultado da soma é: %d\n", operacao);  
				break;  
			}else{  
				System.out.println("????");  
				break;  
			}      
		}

	}
}
