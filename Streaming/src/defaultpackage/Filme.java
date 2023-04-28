package defaultpackage;

public class Filme {
	
	int anoDeLancamento;
	boolean inicluidoNoPlano;
	double somaDasAvaliacoes;
	int totalDeAvaliacoes;
	int duracaoEmMinutos;
	String nome;

	
	void exibeFichaTecnica() {
		System.out.println("Nome: "+nome);

		System.out.println("Ano de Lançamento: "+anoDeLancamento);
	}
	
	void avalia(double nota) {
		somaDasAvaliacoes +=nota;
		totalDeAvaliacoes++;
	}
	
	double cauculaMedia() {
		return somaDasAvaliacoes/totalDeAvaliacoes;
	}
}
