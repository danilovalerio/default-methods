package services;

public class BrasilTaxaService implements TaxaJurosService {
	
	private double taxaJuros;

	public BrasilTaxaService(double taxaJuros) {
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
