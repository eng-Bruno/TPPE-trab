package converter;

/**
 * Classe abstrata para ser utilizado o conceito de heran�a
 * @author igor/Bruno
 * @version 1.0 (27/04/2021)
 */
public abstract class ConverteMedida {
	
	/**
	 * M�todo abstrato para ser sobreescrito
	 * @param valor
	 * @param unidadeMedida
	 */
	public abstract void converteComp(double valor, int unidadeMedida);

}
