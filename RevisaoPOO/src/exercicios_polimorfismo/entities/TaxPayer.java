package exercicios_polimorfismo.entities;

public abstract class TaxPayer {
	
	private String nome;
	private Double rendaAnual;
	
	public TaxPayer(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}
	
	public abstract Double totalImposto();
	
	@Override
	public String toString() {
		return nome + ": $"
				+ String.format("%.2f", totalImposto());
	}
	

}
