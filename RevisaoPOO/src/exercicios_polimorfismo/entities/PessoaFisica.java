package exercicios_polimorfismo.entities;

public class PessoaFisica extends TaxPayer {
	
	private Double gastosSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double totalImposto() {
		double total = 0.0;
		
		if (getRendaAnual() < 20000.00) {
			total = getRendaAnual() * 0.15;
		} else {
			total = getRendaAnual() * 0.25;
		}
		
		if(gastosSaude > 0) {
			total -= gastosSaude * 0.50;
		}
		
		return total;
	}
	
	

}
