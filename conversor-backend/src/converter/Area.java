package converter;

/**
 * Esta classe serve para fazer as convers�es de Area
 * @author igor/Bruno
 * @version 1.0 (27/04/2021)
 *
 */
public class Area {

	private double milimetroQuadrado;
	private double centimetroQuadrado;
	private double decimetroQuadrado;
	private double metroQuadrado;
	private double kilometroQuadrado;
	private double milhaQuadrado;
	private double pesQuadrado;
	private long dezElevado12 = 1000000000000L;         // Representa o n�mero 10 elevado a 12 
	private long dois59Elevado12 = 2590000000000L;      // Representa n�mero 2,59 x 10 elevado a 12
	private long dezElevado10 = 10000000000L;           // Representa o n�mero 10 elevado a 10
	private long dois59Elevado10 = 25900000000L;        // Representa o n�mero 2,59 x 10 elevado a 10 
	
	
	/**
	 * Este m�todo faz todos os c�lculos referentes a Area
	 * @param valor
	 * @param unidadeMedida
	 * @return void, n�o retorna nada
	 */
	
	public void converteArea(double valor, int unidadeMedida)
	{
	/* Esses longs armazenam valores grandes utilizados em algumas convers�es  */
		
	  
		
	   switch (unidadeMedida) 
		{
		// Caso o usu�rio escolha mil�metros quadrados
		case 0:
			this.milimetroQuadrado = valor;
			this.milhaQuadrado = valor;
			this.centimetroQuadrado = valor / 100;
			this.decimetroQuadrado = valor / 10000;
			this.metroQuadrado = valor / 1000000;
			this.kilometroQuadrado = valor / dezElevado12;
			this.milhaQuadrado = valor / dois59Elevado12;
			this.pesQuadrado = valor / 92903.04;
			break;
			
			
		// Caso o usu�rio escolha cent�metros quadrados
		case 1:
			this.centimetroQuadrado = valor;
			this.centimetroQuadrado = valor;
			this.milimetroQuadrado = valor * 100;
			this.decimetroQuadrado = valor / 100;
			this.metroQuadrado = valor / 10000;
			this.kilometroQuadrado = valor / dezElevado10;
			this.milhaQuadrado = valor / dois59Elevado10;
			this.pesQuadrado = valor / 929;
			break;
			
			
		// Caso o usu�rio escolha dec�metros quadrados
		case 2:
			this.decimetroQuadrado = valor;
			this.decimetroQuadrado = valor;
			this.milimetroQuadrado = valor * 10000;
			this.centimetroQuadrado = valor * 100;
			this.metroQuadrado = valor / 100;
			this.kilometroQuadrado = valor / 100000000;
			this.milhaQuadrado = valor / 259000000;
			this.pesQuadrado = valor / 9.29;
			break;
			
			
		// Caso o usu�rio escolha metros quadrados
		case 3:
			this.metroQuadrado = valor;
			this.milimetroQuadrado = valor * 1000000;
			this.centimetroQuadrado = valor * 10000;
			this.decimetroQuadrado = valor * 100;
			this.kilometroQuadrado = valor / 1000000;
			this.milhaQuadrado = valor / 2590000;
			this.pesQuadrado = valor * 10.764;
			break;
			
			
		// Caso o usu�rio escolha quil�metros quadrados
		case 4:
			this.kilometroQuadrado = valor;
			this.milimetroQuadrado = valor * dezElevado12;
			this.centimetroQuadrado = valor * dezElevado10;
			this.decimetroQuadrado = valor * 100000000;
			this.metroQuadrado = valor * 1000000;
			this.milhaQuadrado = valor / 2.59;
			this.pesQuadrado = valor * 10760000;
			break;
			
			
		// Caso o usu�rio escolha milhas quadradas
		case 5:
			this.milhaQuadrado = valor;
			this.milimetroQuadrado = valor * dois59Elevado12;
			this.centimetroQuadrado = valor * dois59Elevado10;
			this.decimetroQuadrado = valor * 259000000;
			this.metroQuadrado = valor * 2590000;
			this.kilometroQuadrado = valor * 2.59;
			this.pesQuadrado = valor = 27880000;
			break;
			
			
		// Caso o usu�rio escolha p�s quadrados
		case 6:
			this.pesQuadrado = valor;
			this.milimetroQuadrado = valor * 92903;
			this.centimetroQuadrado = valor * 929.03;
			this.decimetroQuadrado = valor * 9.2902;
			this.metroQuadrado = valor / 10.764;
			this.kilometroQuadrado = valor / 10760000;
			this.milhaQuadrado = valor / 27880000;
			break;
		}
	}
	
	
	
	
	public double getMilimetroQuadrado() {
		return milimetroQuadrado;
	}
	public void setMilimetroQuadrado(double milimetroQuadrado) {
		this.milimetroQuadrado = milimetroQuadrado;
	}
	public double getCentimetroQuadrado() {
		return centimetroQuadrado;
	}
	public void setCentimetroQuadrado(double centimetroQuadrado) {
		this.centimetroQuadrado = centimetroQuadrado;
	}
	public double getDecimetroQuadrado() {
		return decimetroQuadrado;
	}
	public void setDecimetroQuadrado(double decimetroQuadrado) {
		this.decimetroQuadrado = decimetroQuadrado;
	}
	public double getMetroQuadradoQuadrado() {
		return metroQuadrado;
	}
	public void setMetroQuadradoQuadrado(double metroQuadradoQuadrado) {
		this.metroQuadrado = metroQuadradoQuadrado;
	}
	public double getKilometroQuadrado() {
		return kilometroQuadrado;
	}
	public void setKilometroQuadrado(double kilometroQuadrado) {
		this.kilometroQuadrado = kilometroQuadrado;
	}
	public double getMilhaQuadrado() {
		return milhaQuadrado;
	}
	public void setMilhaQuadrado(double milhaQuadrado) {
		this.milhaQuadrado = milhaQuadrado;
	}
	public double getPesQuadrado() {
		return pesQuadrado;
	}
	public void setPesQuadrado(double pesQuadrado) {
		this.pesQuadrado = pesQuadrado;
	}
	
	
	
	// Este m�todo serve para mandar as informa��es para o pacote view
	// Ele transforma o resultado da conta em uma string e usa o switch para alternar entre as op�oes escolhidas
	
	/**
	 * Este m�todo serve para mandar as informa��es para o pacote view
	 * Ele transforma o resultado da conta em uma string e usa o
	 * switch para alternar entre as op�oes escolhidas
	 * @param n
	 * @return string, retorna o valor da conta em forma de string
	 */
	public String getArea(int n)
	{
		String str = null;
		switch (n)
		{
		case 0:
			str = Double.toString(this.milimetroQuadrado);
			break;
		case 1:
			str = Double.toString(this.centimetroQuadrado);
			break;
		case 2:
			str = Double.toString(this.decimetroQuadrado);
			break;
		case 3:
			str = Double.toString(this.metroQuadrado);
			break;
		case 4:
			str = Double.toString(this.kilometroQuadrado);
			break;
		case 5:
			str = Double.toString(this.milhaQuadrado);
			break;
		case 6:
			str = Double.toString(this.pesQuadrado);
			break;
		}
		return str;
	}
	
	
}

