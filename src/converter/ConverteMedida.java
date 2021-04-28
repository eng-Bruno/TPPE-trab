package converter;

/**
 * Classe abstrata para ser utilizado o conceito de herança
 * @author igor/Bruno
 * @version 1.0 (27/04/2021)
 */
public abstract class ConverteMedida {
	
	/**
	 * Método abstrato para ser sobreescrito
	 * @param valor
	 * @param unidadeMedida
	 */
	public abstract void converteComp(double valor, int unidadeMedida);

}
