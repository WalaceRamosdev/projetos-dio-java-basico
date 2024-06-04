import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) throws Exception {

		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			
			contar(parametroUm, parametroDois);

		}catch (InputMismatchException e) {
			
            System.out.println("O segundo número selecionado dever ser maior que o primeiro.");
		}
		
	}

	static void contar(int parametroUm, int parametroDois ) throws InputMismatchException {
		
		if(parametroUm > parametroDois) {
            throw new InputMismatchException("O segundo parametro deve ser maior que o primeiro.");
        }
		
        for(int count = parametroUm; count <= parametroDois; count++ ){
            System.out.println("Imprimindo número " + count);
        }
	}
}