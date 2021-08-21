package musicfy;

import java.util.Scanner;

public class MenuPrincipal {

	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
		selecionarOpcao();
	}

	static void selecionarOpcao() {
		
		int opcao;
		
		System.out.println("Olá! Bem vindo ao sistema musicfy\n");

		do {
			System.out.println("=================================");
			System.out.println("Escolha uma opção abaixo:");
			System.out.println("*********************************");
			System.out.println("0 - Sair");
			System.out.println("1 - Seção música");
			System.out.println("2 - Seção Artista");
			System.out.println("3 - Configurações");
			System.out.println("*********************************");

			opcao = entrada.nextInt();
			System.out.println("Voce escolheu a opcao: " + opcao);

			switch (opcao) {
			case 0: 
				System.out.println("Encerrando programa");
				break;
			case 1:
				TelaMusica.opcoes();
				break;
			case 2:
				TelaArtista.opcoes();
				break;
			case 3:
				//Configuracao.telaCor();
				System.out.println("A ser construído!");
				break;
			default:
				System.out.println("Opcao inválida. Opcao digitada foi " + opcao);
				break;
			}
		} while (opcao != 0);

		entrada.close();
	}
}