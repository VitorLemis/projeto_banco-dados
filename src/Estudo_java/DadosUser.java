package Estudo_java;

public class DadosUser {
	private String nome;
	private int idade;
	public DadosUser() {
		nome = null;
		idade = 0;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
