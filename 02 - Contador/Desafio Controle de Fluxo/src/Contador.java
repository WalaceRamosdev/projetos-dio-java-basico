import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) throws Exception {

		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

            if (parametroUm < parametroDois) {  
                int contar = parametroDois - parametroUm;
                for(int contar = )
            }
		
		}catch (InputMismatchException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo número selecionado dever ser maior que o primeiro.");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws InputMismatchException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois) {
            
        }
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for(int i = contagem; contagem < parametroUm; i++ );
	}
}