package desafioControleFluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Obtenção de valores
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = sc.nextInt();
		
		//Tratamento de exceções
		try {
		
			//Chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			
			//Imprimindo a mensagem de erro customizada que aparecerá no terminal
			System.err.println("O parâmetro UM precisa ser MENOR do que o parâmetro DOIS!!");
			
		}
		
		sc.close();
	}
	
	//	Criação do método que será realizado toda a lógica da contagem, e caso aconteça um erro, volte uma mensagem de erro personalizada.
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

		//Validação, caso contenha o erro esperado, a "Exception" 'ParametrosInvalidosException' será chamada e executada
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		//Criado uma variável para ser realizado a contagem da diferença entre os parâmetros.
		int contagem = parametroDois - parametroUm;
		
		//Execução do laço para impressão da contagem
		System.out.printf("\nSerão %d números na contagem seguinte: \n", contagem);
		for (int i = 1; i <= contagem; i++) {
			System.out.printf("\nImprimindo o nº %d", i);
		}
		
	}
}