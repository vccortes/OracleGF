package musicfy;

import java.util.Scanner;

public class TelaMusica {
	
		
	static Scanner entrada = new Scanner(System.in);
	static Musica musica = new Musica();
	
	
	static void opcoes() {
		int opcao;
		
		do {
			System.out.println("=================================");
			System.out.println("Escolha uma op��o abaixo:");
			System.out.println("*********************************");
			System.out.println("0 - Voltar ao menu principal");
			System.out.println("1 - Incluir m�sica");
			System.out.println("2 - Alterar m�sica");
			System.out.println("3 - Consultar m�sica");
			System.out.println("4 - Excluir m�sica");
			System.out.println("*********************************");
		
			opcao = entrada.nextInt();
			System.out.println("Voce escolheu a opcao: " + opcao);
			
			switch (opcao) {
			case 1: 
				TelaMusica.incluirMusica();
				break;
			case 2: 
				TelaMusica.alterarMusica();
				break;
			case 3: 
				TelaMusica.consultarMusica();
				break;
			case 4:
				TelaMusica.exlcuirMusica();
				break;
			default:
				System.out.println("Opcao invalida. Opcao digitada foi " + opcao);
				break;
			}
		} while (opcao != 0);
		
	}
	
		static void incluirMusica() {
			
			
			System.out.println("Cadastrar m�sica. Entre com os dados da musica");
			System.out.println("=================================\n");
			System.out.println("Informe o nome da m�sica");
			entrada.nextLine();
			musica.nomeMusica = entrada.nextLine();
			System.out.println("Informe o genero da m�sica");
			musica.generoMusica = entrada.nextLine();
			System.out.println("Informe a dura��o da m�sica");
			musica.duracaoMusica = entrada.nextDouble();
			System.out.println("Informe o artista da m�sica");
			entrada.nextLine();
			musica.artistaMusica = entrada.nextLine();
			System.out.println("Informe a nota que voc� d� para a m�sica");
			musica.pontuacaoMusica = entrada.nextByte();
			
			System.out.println("\nMusica cadastrada com sucesso: ");
			System.out.println("Nome     : " + musica.nomeMusica);
			System.out.println("Genero   : " + musica.generoMusica);
			System.out.println("Dura��o  : " + musica.duracaoMusica);
			System.out.println("Artista  : " + musica.artistaMusica);
			System.out.println("Pontua��o: " + musica.pontuacaoMusica);
					
		}
			
		static void alterarMusica () {
				System.out.println("Alterar dados da m�sica. Digite o que exatamente o quer alterar:");
				System.out.println("1-Nome\n2-G�nero\n3-Dura��o\n4-Artista\n5-Pontua��o");
				
				int opcao = entrada.nextInt();
				
				if (opcao == 1) {
					System.out.println("Informe o novo nome da m�sica");
					entrada.nextLine();
					musica.nomeMusica = entrada.nextLine();
				
				} else if (opcao == 2) {
					System.out.println("Informe o novo genero da m�sica");
					entrada.nextLine();
					musica.generoMusica = entrada.nextLine();
				} else if (opcao == 3) {
					System.out.println("Informe a nova dura��o da m�sica");
					entrada.nextLine();
					musica.duracaoMusica = entrada.nextDouble();
				} else if (opcao == 4) {
					System.out.println("Informe o novo artista da m�sica");
					entrada.nextLine();
					musica.artistaMusica = entrada.nextLine();
				} else if (opcao == 5) {
					System.out.println("Informe a nota que voc� d� para a m�sica");
					entrada.nextLine();
					musica.pontuacaoMusica = entrada.nextByte();
				} else {
					System.out.println("OP��O INV�LIDA");
					opcao = entrada.nextInt();
				}
				
				System.out.println("\nMusica alterada com sucesso");
				System.out.println("Nome     : " + musica.nomeMusica);
				System.out.println("Genero   : " + musica.generoMusica);
				System.out.println("Dura��o  : " + musica.duracaoMusica);
				System.out.println("Artista  : " + musica.artistaMusica);
				System.out.println("Pontua��o: " + musica.pontuacaoMusica);
				
		}

			
		static void consultarMusica() {
				System.out.println("Consulta da m�sica");
				System.out.println("=================================\n");
				System.out.println("Nome     : " + musica.nomeMusica);
				System.out.println("Genero   : " + musica.generoMusica);
				System.out.println("Dura��o  : " + musica.duracaoMusica);
				System.out.println("Artista  : " + musica.artistaMusica);
				System.out.println("Pontua��o: " + musica.pontuacaoMusica);
			}
			
		static void exlcuirMusica() {
				musica.nomeMusica = "";
				musica.generoMusica = "";
				musica.artistaMusica = "";
				musica.duracaoMusica = 0;
				musica.pontuacaoMusica = 0;
				System.out.println("Dados do Artista exclu�do");
				System.out.println("=================================\n");
				
		}
			

				

			
}
	
	
	

