import java.util.Calendar;

public class Moto extends Automotor {

	Moto(int AnoFabricacao, String Modelo, String Marca, double ValorMercado, String Placa)
	{
		super(AnoFabricacao, Modelo, Marca, ValorMercado, Placa);
	}

	@Override
	public double calculaImposto()
	{
		Calendar hoje = Calendar.getInstance();
		int AnoAtual = hoje.get(Calendar.YEAR);
		if(AnoAtual - this.AnoFabricacao >= 20)
		{
			System.out.println("Isento!");
			return 0;
		}
		else
		{
			System.out.println("Imposto de 2% sobre o valor de mercado");
			return (this.ValorMercado/100) * 2;
		}
	}
	
	

}
