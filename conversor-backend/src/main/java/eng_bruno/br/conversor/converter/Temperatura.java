package converter;

/**
 * Esta classe serve para fazer as conversões de Temperatura
 * @author igor/Bruno
 * @version 1.0 (27/04/2021)
 *
 */
public class Temperatura {
	private double celsius;
	private double fahrenheit;
	private double kelvin;
	private double rankine;
	private double reaumur;
	
	/**
	 * Este método faz todos os cálculos referentes a Temperatura
	 * @param valor
	 * @param unidadeMedida
	 * @return void, não retorna nada
	 */
	
public void converteTemperatura(double valor, int unidadeMedida) {
		
		switch (unidadeMedida)
		{
		
	// Caso o usuário escolha celcius
		case 0:
			this.celsius = valor;
			this.fahrenheit = (valor * (9/5)) + 32;
			this.kelvin = valor + 273.15;                   // Em cada caso é calculado todos os 
			this.rankine = (valor * (9/5)) + 497.07;        //         valores possíveis
			this.reaumur = valor * (4/5);
			break;
			
			
	// Caso o usuário escolha fahrenheit
		case 1:
			this.fahrenheit = valor;
			this.celsius = (valor - 32) * (5/9);
			this.kelvin = (valor - 32) * (5/9) + 273.15;
			this.rankine = valor + 459.67;
			this.reaumur = (valor - 32) * (4/9);
			break;
			
			
	// Caso o usuários escolha kelvin
		case 2:
			this.kelvin = valor;
			this.celsius = valor - 273.15;
			this.fahrenheit = (valor - 273.15) * (9/5) + 32;
			this.rankine = valor * 1.8;
			this.reaumur = (valor - 273.15) * (4/5);
			break;
			
			
	// Caso o usuário escolha rankine
		case 3:
			this.rankine = valor;
			this.celsius = (valor - 491.67) * (5/9);
			this.fahrenheit = valor - 459.67;
			this.kelvin = valor *(5/9);
			this.reaumur = (valor - 491.67) * (4/9);
			break;
			
			
	// Caso o usuário escolha reamur
		case 4:
			this.reaumur = valor;
			this.celsius = valor * (5/4);
			this.fahrenheit = (valor * (9/4)) + 32;
			this.kelvin = (valor * 5/4) + 273.15;
			this.rankine = (valor * 9/4) + 491.67;
			break;
		}
	
}	
	

  // Abaixo constam os getters e setters

	
	public double getCelsius() {
		return celsius;
	}
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	public double getFahrenheit() {
		return fahrenheit;
	}
	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	public double getKelvin() {
		return kelvin;
	}
	public void setKelvin(double kelvin) {
		this.kelvin = kelvin;
	}
	public double getRankine() {
		return rankine;
	}
	public void setRankine(double rankine) {
		this.rankine = rankine;
	}
	public double getReaumur() {
		return reaumur;
	}
	public void setReaumur(double reaumur) {
		this.reaumur = reaumur;
	}
	
	
	/**
	 * Este método serve para mandar as informações para o pacote view
	 * Ele transforma o resultado da conta em uma string e usa o
	 * switch para alternar entre as opçoes escolhidas
	 * @param n
	 * @return string, retorna o valor da conta em forma de string
	 */
	
	public String getTemperatura(int n)
	{
		String str = null;
		switch (n)
		{
		case 0:
			str = Double.toString(this.celsius);
			break;
		case 1:
			str = Double.toString(this.fahrenheit);
			break;
		case 2:
			str = Double.toString(this.kelvin);
			break;
		case 3:
			str = Double.toString(this.rankine);
			break;
		case 4:
			str = Double.toString(this.reaumur);
			break;
		
		}
		return str;
	}

}