package services;

public class UsaTaxaService implements TaxaJurosService {
	
	private double taxaJuros;

	public UsaTaxaService(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	

}
