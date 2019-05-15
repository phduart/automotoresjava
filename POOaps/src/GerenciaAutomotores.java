import java.util.*;

public class GerenciaAutomotores {

	ArrayList<Automotor> Automotores = new ArrayList<Automotor>();
	
	public boolean Adicionar(Automotor a)
	{
		Automotores.add(a);
		return true; 
	}
	
	public boolean Remover(String Placa)
	{
		for(Automotor automotor : Automotores)
		{
			if(Placa.intern() == automotor.Placa)
			{
				Automotores.remove(automotor);
				return true;
			}
		}
		
		return false; 
		
	}
	
	public Automotor buscaPorPlaca(String Placa)
	{
		for(Automotor automotor : Automotores)
		{
			if(Placa.intern() == automotor.Placa.intern())
			{
				return automotor;
			}
		}
		
		return null;
	}
	
	public String listarCarros()
	{
		String retorno = "";
		for(Automotor automotor : Automotores)
		{
			if(automotor instanceof Carro)
				retorno += "\n" + automotor.imprimir();			
		}
		
		return retorno;
	}
	
	public String ListarMotocicletas()
	{
		String retorno = "";
		for(Automotor automotor : Automotores)
		{
			if(automotor instanceof Moto)
				retorno += "\n" + automotor.imprimir();			
		}
		
		return retorno;
	}
	
	public String ListarPicapes()
	{
		String retorno = "";
		for(Automotor automotor : Automotores)
		{
			if(automotor instanceof Picape)
				retorno += "\n" + automotor.imprimir();			
		}
		
		return retorno;
	}
	
	public double obetValorImposto(String placa)
	{
		for(Automotor automotor : Automotores)
		{
			if(automotor.Placa.intern() == placa.intern())
			{
				return automotor.calculaImposto();
			}
		}
		
		return -1;
	}
	
	public String ListarCarrosPorCombustivel(String Combustivel)
	{
		String Retorno = " "; 
		for(Automotor automotor : Automotores)
		{
			if(automotor instanceof Carro)
			{
				if(((Carro) automotor).Combustivel == Combustivel)
				{
					Retorno += "\n" + automotor;
				}

			}
		}
		
		return Retorno;
	}
}
