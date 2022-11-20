//Reverso do número. Faça uma função que retorne o reverso de um número inteiro informado. Por exemplo: 127 -> 721.
import java.util.Scanner;

class App {
	public void reverse(String number) {
		System.out.println(number + " -> " + new StringBuilder(number).reverse().toString());
	}
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
            App e = new App();
            
            System.out.print("Digite o numero inteiro: ");
            e.reverse(scan.next());
        }
	}		
}
