package musicfy;

import java.util.Scanner;

public class TelaMusica {
	
		
	static Scanner entrada = new Scanner(System.in);
	static Musica musica = new Musica();
	
	
	static void opcoes() {
		int opcao;
		
		do {
			System.out.println("=================================");
			System.out.println("Escolha uma opção abaixo:");
			System.out.println("*********************************");
			System.out.println("0 - Voltar ao menu principal");
			System.out.println("1 - Incluir música");
			System.out.println("2 - Alterar música");
			System.out.println("3 - Consultar música");
			System.out.println("4 - Excluir música");
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
			
			
			System.out.println("Cadastrar música. Entre com os dados da musica");
			System.out.println("=================================\n");
			System.out.println("Informe o nome da música");
			entrada.nextLine();
			musica.nomeMusica = entrada.nextLine();
			System.out.println("Informe o genero da música");
			musica.generoMusica = entrada.nextLine();
			System.out.println("Informe a duração da música");
			musica.duracaoMusica = entrada.nextDouble();
			System.out.println("Informe o artista da música");
			entrada.nextLine();
			musica.artistaMusica = entrada.nextLine();
			System.out.println("Informe a nota que você dá para a música");
			musica.pontuacaoMusica = entrada.nextByte();
			
			System.out.println("\nMusica cadastrada com sucesso: ");
			System.out.println("Nome     : " + musica.nomeMusica);
			System.out.println("Genero   : " + musica.generoMusica);
			System.out.println("Duração  : " + musica.duracaoMusica);
			System.out.println("Artista  : " + musica.artistaMusica);
			System.out.println("Pontuação: " + musica.pontuacaoMusica);
					
		}
			
		static void alterarMusica () {
				System.out.println("Alterar dados da música. Digite o que exatamente o quer alterar:");
				System.out.println("1-Nome\n2-Gênero\n3-Duração\n4-Artista\n5-Pontuação");
				
				int opcao = entrada.nextInt();
				
				if (opcao == 1) {
					System.out.println("Informe o novo nome da música");
					entrada.nextLine();
					musica.nomeMusica = entrada.nextLine();
				
				} else if (opcao == 2) {
					System.out.println("Informe o novo genero da música");
					entrada.nextLine();
					musica.generoMusica = entrada.nextLine();
				} else if (opcao == 3) {
					System.out.println("Informe a nova duração da música");
					entrada.nextLine();
					musica.duracaoMusica = entrada.nextDouble();
				} else if (opcao == 4) {
					System.out.println("Informe o novo artista da música");
					entrada.nextLine();
					musica.artistaMusica = entrada.nextLine();
				} else if (opcao == 5) {
					System.out.println("Informe a nota que você dá para a música");
					entrada.nextLine();
					musica.pontuacaoMusica = entrada.nextByte();
				} else {
					System.out.println("OPÇÃO INVÁLIDA");
					opcao = entrada.nextInt();
				}
				
				System.out.println("\nMusica alterada com sucesso");
				System.out.println("Nome     : " + musica.nomeMusica);
				System.out.println("Genero   : " + musica.generoMusica);
				System.out.println("Duração  : " + musica.duracaoMusica);
				System.out.println("Artista  : " + musica.artistaMusica);
				System.out.println("Pontuação: " + musica.pontuacaoMusica);
				
		}

			
		static void consultarMusica() {
				System.out.println("Consulta da música");
				System.out.println("=================================\n");
				System.out.println("Nome     : " + musica.nomeMusica);
				System.out.println("Genero   : " + musica.generoMusica);
				System.out.println("Duração  : " + musica.duracaoMusica);
				System.out.println("Artista  : " + musica.artistaMusica);
				System.out.println("Pontuação: " + musica.pontuacaoMusica);
			}
			
		static void exlcuirMusica() {
				musica.nomeMusica = "";
				musica.generoMusica = "";
				musica.artistaMusica = "";
				musica.duracaoMusica = 0;
				musica.pontuacaoMusica = 0;
				System.out.println("Dados do Artista excluído");
				System.out.println("=================================\n");
				
		}
			

				

			
}
	
	
	

