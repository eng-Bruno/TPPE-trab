package converter;

/**
 * Esta classe serve para fazer as convers�es de Dados
 * @author igor/Bruno
 * @version 1.0 (27/04/2021)
 *
 */

public class Dados {

	private double bit;
	private double bytes;
	private double kiloByte;
	private double kibByte;
	private double kibBit;
	private double megaBit;
	private double gigaBit;
	
	/**
	 * Este m�todo faz todos os c�lculos referentes a Dados
	 * @param valor
	 * @param unidadeMedida
	 * @return void, n�o retorna nada
	 */
	
	public void converteDado(double valor, int unidadeMedida)
	{
		switch (unidadeMedida)
		{
	// Caso o usu�rio escolha bit
		case 0:
			this.bit = valor;
			this.bytes = valor / 8;
			this.kiloByte = valor / 8000;                // Em cada caso � calculado todos os 
			this.kibByte = valor / 8192;                 //         valores poss�veis
			this.kibBit = valor / 1024;
			this.megaBit = valor / 1000000;
			this.gigaBit = valor / 1000000000;
			break;
			
			
	// Caso o usu�rio escolha byte
		case 1:
			this.bytes = valor;
			this.bit = valor * 8;
			this.kiloByte = valor / 1000;
			this.kibByte = valor / 1024;
			this.kibBit = valor / 128;
			this.megaBit = valor / 125000;
			this.gigaBit = valor / 125000000;
			break;
			
			
	// Caso o usu�rio escolha kilobytes
		case 2:
			this.kiloByte = valor;
			this.bit = valor * 8000;
			this.bytes = valor * 1000;
			this.kibByte = valor / 1.024;
			this.kibBit = valor * 7.812;
			this.megaBit = valor / 125;
			this.gigaBit = valor / 125000;
			break;
			
			
	// Caso o usu�rio escoolha kibibytes
		case 3:
			this.kibByte = valor;
			this.bit = valor * 8192;
			this.bytes = valor * 1024;
			this.kiloByte = valor * 1.024;
			this.kibBit = valor * 8;
			this.megaBit = valor / 122;
			this.gigaBit = valor / 122070;
			break;
			
			
	// Caso o usu�rio escolha kibibit
		case 4:
			this.kibBit = valor;
			this.bit = valor * 1024;
			this.bytes = valor * 128;
			this.kiloByte = valor / 7.812;
			this.kibByte = valor / 8;
			this.megaBit = valor / 977;
			this.gigaBit = valor / 976562;
			break;
			
			
	// Caso o usu�rio escolha megabit
		case 5:
			this.megaBit = valor;
			this.bit = valor * 1000000;
			this.bytes = valor * 125000;
			this.kiloByte = valor * 125;
			this.kibByte = valor * 122;
			this.kibBit = valor * 977;
			this.gigaBit = valor / 1000;
			break;
			
			
	// Caso o usu�rio escolha gigabit
		case 6:
			this.gigaBit = valor;
			this.bit = valor * 1000000000;
			this.bytes = valor * 125000000;
			this.kiloByte = valor * 125000;
			this.kibByte = valor * 122070;
			this.kibBit = valor * 976563;
			this.megaBit = valor * 1000;
			break;
			
		}
	}
	
	// A baixo constam os getters e setters

	public double getBit() {
		return bit;
	}

	public void setBit(double bit) {
		this.bit = bit;
	}

	public double getBytes() {
		return bytes;
	}

	public void setBytes(double bytes) {
		this.bytes = bytes;
	}

	public double getKiloByte() {
		return kiloByte;
	}

	public void setKiloByte(double kiloByte) {
		this.kiloByte = kiloByte;
	}

	public double getKibByte() {
		return kibByte;
	}

	public void setKibByte(double kibByte) {
		this.kibByte = kibByte;
	}

	public double getKibBit() {
		return kibBit;
	}

	public void setKibBit(double kibBit) {
		this.kibBit = kibBit;
	}

	public double getMegaBit() {
		return megaBit;
	}

	public void setMegaBit(double megaBit) {
		this.megaBit = megaBit;
	}

	public double getGigaBit() {
		return gigaBit;
	}

	public void setGigaBit(double gigaBit) {
		this.gigaBit = gigaBit;
	}
	
	
	/**
	 * Este m�todo serve para mandar as informa��es para o pacote view
	 * Ele transforma o resultado da conta em uma string e usa o
	 * switch para alternar entre as op�oes escolhidas
	 * @param n
	 * @return string, retorna o valor da conta em forma de string
	 */
	public String getDados(int n)
	{
		String str = null;
		switch (n)
		{
		case 0:
			str = Double.toString(this.bit);
			break;
		case 1:
			str = Double.toString(this.bytes);
			break;
		case 2:
			str = Double.toString(this.kiloByte);
			break;
		case 3:
			str = Double.toString(this.kibByte);
			break;
		case 4:
			str = Double.toString(this.kibBit);
			break;
		case 5:
			str = Double.toString(this.megaBit);
			break;
		case 6:
			str = Double.toString(this.gigaBit);
			break;
		}
		return str;
	}
	
}
