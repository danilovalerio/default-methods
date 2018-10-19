package services;

import java.security.InvalidParameterException;

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
	
	@Override
	public double pagamento(double valor, int meses) {
		if(meses < 1) {
			throw new InvalidParameterException("Meses tem que ser maior que zero");
		}
		
		return valor * Math.pow(1.0 + taxaJuros / 100.0, meses);//Math.pow potencia valor^meses
	}
	

}
