package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import services.UsaTaxaService;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informes os dados:");
		System.out.print("Montante> ");
		double montante = sc.nextDouble();
		System.out.print("Meses> ");
		int meses = sc.nextInt();
		
		UsaTaxaService sb = new UsaTaxaService(1.0);
		double pagamento = sb.pagamento(montante, meses);
		
		System.out.println("Pagamento depois de "+ meses + " meses:");
		System.out.println(String.format("R$ %.2f", pagamento));
		
		sc.close();

	}

}
