import java.util.Calendar;

public class Picape extends Automotor{
	
	String Cabine;

	Picape(int AnoFabricacao, String Modelo, String Marca, double ValorMercado, String Placa, String Cabine)
	{
		super(AnoFabricacao, Modelo, Marca, ValorMercado, Placa);
		this.Cabine = Cabine; 
		
	}
	
	@Override
	public String imprimir()
	{
		String retorno = super.imprimir() + ", Combustivel: " + this.Cabine;
		return retorno;
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
			if(this.Cabine.intern() == "simples")
			{
				System.out.println("Imposto de 2% sobre o valor de mercado");
				return (this.ValorMercado/100) * 2;
			}
			else
			{
				System.out.println("Imposto de 4% sobre o valor de mercado");
				return (this.ValorMercado/100) * 4;
			}
		}
	}
	
}
