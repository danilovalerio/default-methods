package services;

import java.security.InvalidParameterException;

public interface TaxaJurosService {

	//Interface não tem construtor
	double getTaxaJuros(); //esse não pode ser default por conta dos valores passados na taxa
	
	//Adicionado como default na interface,pois a operação é a mesma 
	// tanto para taxaBrasil como para taxaUsa
	default double pagamento(double valor, int meses) {
		if(meses < 1) {
			throw new InvalidParameterException("Meses tem que ser maior que zero");
		}
		return valor * Math.pow(1.0 + getTaxaJuros() / 100.0, meses);//Math.pow potencia valor^meses
	}
	
}
