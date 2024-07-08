package informacao;

public class Aluno {
	private String nome;
	private int idade;
	private double nota;
	
	public Aluno(String nome, int idade, double nota) {
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getNota() {
		return nota;
	}
	
	@Override
    public String toString() {
		return String.format("Nome: %s, Idade: %d, Nota: %.2f", nome, idade, nota);
	}
	
}
