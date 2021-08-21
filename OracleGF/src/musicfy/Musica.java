package musicfy;

public class Musica {
			
		String nomeMusica, generoMusica, artistaMusica;
		double duracaoMusica;
		byte pontuacaoMusica;
		
		void tocar() {
		}
		
		void parar() {
			System.out.println("deveria parar a musica");
		}
		
		void darNota(byte nota) {
			pontuacaoMusica = nota;
		}
}
