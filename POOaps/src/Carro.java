import java.util.Calendar;

public class Carro extends Automotor{
	
	String Combustivel;

	Carro(int AnoFabricacao, String Modelo, String Marca, float ValorMercado, String Placa, String Combustivel)
	{
		super(AnoFabricacao, Modelo, Marca, ValorMercado, Placa);
		this.Combustivel = Combustivel;
	}
	
	@Override
	public String imprimir()
	{
		String retorno = super.imprimir() + ", Combustivel: " + this.Combustivel;
		return retorno;
	}

	@Override
	public double calculaImposto() {
		Calendar hoje = Calendar.getInstance();
		int AnoAtual = hoje.get(Calendar.YEAR);
		if(AnoAtual - this.AnoFabricacao >= 20)
		{
			System.out.println("Isento!");
			return 0;
		}
		else
		{
			if(this.Combustivel.intern() == "gasolina" && this.Combustivel.intern() == "diesel" && this.Combustivel.intern() == "flex")
			{
				System.out.println("Imposto de 4% sobre o valor de Mercado");
				return (this.ValorMercado/100) * 4;
			}
			else
			{
				System.out.println("Imposto de 3% sobre o valor de Mercado");
				return (this.ValorMercado/100) * 3;
			}
		}
	}
	
	

}
