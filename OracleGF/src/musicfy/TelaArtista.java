package musicfy;

import java.util.Scanner;

public class TelaArtista {
		
		static Artista artista = new Artista(); 
		static Scanner entrada = new Scanner(System.in);
		
		static void opcoes() {
			int opcao;
			do {
				System.out.println("Opções para Artista. Entre com a opcao desejada");
				System.out.println("=================================\n");
				System.out.println("0 - Voltar ao menu principal");
				System.out.println("1 - Incluir Artista");
				System.out.println("2 - Alterar Artista");
				System.out.println("3 - Consultar Artista");
				System.out.println("4 - Excluir Artista");

				opcao = entrada.nextInt();
				
				System.out.println("Voce escolheu a opcao: " + opcao);
				
				switch (opcao) {
				case 0:
					System.out.println("Voltar para menu anterior");
					break;
				case 1:
					TelaArtista.incluirArtista();
					break;
				case 2:
					TelaArtista.alterarArtista();
				case 3:
					TelaArtista.consultarArtista();
					break;
				case 4:
					TelaArtista.excluirArtista();
					break;
				default:
					System.out.println("Opcao invalida " + opcao);
					break;
				}
			} while (opcao != 0);
		}
		
		static void incluirArtista() {

			System.out.println("Cadastrar Artista. Entre com os dados do artista");
			System.out.println("=================================\n");
			System.out.println("Informe o nome do artista");
			entrada.nextLine();
			artista.nome = entrada.nextLine();
			System.out.println("Informe o genero musical do artista");
			artista.generoMusical = entrada.nextLine();
		

			System.out.println("\nArtista cadastrado com sucesso: ");
			System.out.println("Nome    : " + artista.nome);
			System.out.println("Genero  : " + artista.generoMusical);
		}
		static void alterarArtista () {
			System.out.println("Alterar dados do(a) artista. Digite o que exatamente quer alterar:");
			System.out.println("1-Nome\n2-Gênero");
			
			int opcao = entrada.nextInt();
			
			if (opcao == 1) {
				System.out.println("Informe o novo nome da música");
				entrada.nextLine();
				artista.nome = entrada.nextLine();
			
			} else if (opcao == 2) {
				System.out.println("Informe o novo genero da música");
				entrada.nextLine();
				artista.generoMusical = entrada.nextLine();
			}  else {
				System.out.println("OPÇÃO INVÁLIDA. Escolha uma das opções abaixo: ");
				System.out.println("1-Nome\n2-Gênero");
				opcao = entrada.nextInt();
			}
			
			System.out.println("\nArtista alterada com sucesso");
			System.out.println("=================================\n");
			System.out.println("Nome     : " + artista.nome);
			System.out.println("Genero Musical  : " + artista.generoMusical);

			}

		
		static void consultarArtista() {
				System.out.println("Consulta do Artista");
				System.out.println("=================================\n");
				System.out.println("Nome     : " + artista.nome);
				System.out.println("Genero Musical  : " + artista.generoMusical);
					
		}
			
		static void excluirArtista() {
				artista.nome = "";
				artista.generoMusical = "";
				System.out.println("Dados do Artista excluído");
				System.out.println("=================================\n");
				
			
		}
}
		


