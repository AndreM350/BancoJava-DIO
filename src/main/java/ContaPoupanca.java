
public class ContaPoupanca extends Conta {

    //invocando construtor específico.
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;

    }

}
