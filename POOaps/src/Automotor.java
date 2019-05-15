
abstract class Automotor {

	int AnoFabricacao;
	String Modelo;
	String Marca;
	double ValorMercado;
	String Placa; 
	
	
	Automotor(int AnoFabricacao, String Modelo, String Marca, double ValorMercado, String Placa)
	{
		this.AnoFabricacao = AnoFabricacao;
		this.Modelo = Modelo;
		this.Marca = Marca; 
		this.ValorMercado = ValorMercado; 
		this.Placa = Placa; 		
	}
	
	public abstract double calculaImposto();
	
	public String imprimir()
	{
		 String retorno = ("Modelo: " + this.Modelo + ", Marca: " + this.Marca + ", Placa: " + this.Placa 
				 + ", Valor de Mercado: " + this.ValorMercado + ", Ano de Fabrica��o: " + this.AnoFabricacao);
		 return retorno; 
	}
	
	public int getAnoFabricacao()
	{
		return this.AnoFabricacao;
	}
	
	public String getModelo()
	{
		return this.Modelo;
	}
	
	public String getMarca()
	{
		return this.Marca;
	}
	
	public String getPlaca() 
	{
		return this.Placa;
	}
	
	public double getValorMercado()
	{
		return this.ValorMercado;
	}
	
	public void setValorMercado(float Valor)
	{
		this.ValorMercado = Valor;
	}
	
	public String toString() { 
	    return "Modelo '" + this.Modelo + "', Marca: '" + this.Marca + "', Placa: '" + this.Placa + "'";
	}
	
	
	
	
	
}