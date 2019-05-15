

public class exec {

	public static void main(String[] args)
	{
	
		GerenciaAutomotores gerencia = new GerenciaAutomotores();
		
		Carro teste = new Carro(2010, "hb20", "hyundai", 32000, "pce-exe", "gás");
		Carro teste2 = new Carro(2011, "hb20s", "Hyundai", 10000, "pxe-99", "gasolina");
		Moto teste3 = new Moto(2011, "XRE", "Honda", 20000, "55fc");
		
		Add(teste, gerencia);
		Add(teste2, gerencia);
		Add(teste3, gerencia);
		
		System.out.println(gerencia.ListarMotocicletas());
		
		
		
	}
	
	public static void Add(Automotor veiculo, GerenciaAutomotores gerenciador)
	{
		gerenciador.Adicionar(veiculo);
	}
}
