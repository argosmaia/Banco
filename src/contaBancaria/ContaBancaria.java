/**
 * 
 */
package contaBancaria;

/**
 * @author argosmaia
 *
 */
public interface ContaBancaria {
	void sacar(double valor);
    void depositar(double valor);
    double getSaldo();
    void pagarConta(double valor);
}
