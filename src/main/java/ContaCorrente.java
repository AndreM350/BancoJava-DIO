public class ContaCorrente extends Conta {


    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }


    @Override
    public void saca(double valor) {
        double valorASacar = valor;
        super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;

    }

}
