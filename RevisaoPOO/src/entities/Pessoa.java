package entities;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	private String email;
	
	public Pessoa(String nome, int idade, double altura) {
		this.altura = altura;
		this.idade = idade;
		this.nome = nome;
	}
	

	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}


	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return nome + ", " + email;
	}
	

}
