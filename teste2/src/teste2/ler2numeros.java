package teste2;
import java.util.*;

class ler2numeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
	int num1, num2, soma;
	
	System.out.println("Digite um numero: ");
	num1 = sc.nextInt();
	
	System.out.println("Digite outro numero: ");
	num2 = sc.nextInt();
	
	soma = num1+num2;
	
	System.out.println("A soma dos numeros é: "+soma);
	

	}
}
