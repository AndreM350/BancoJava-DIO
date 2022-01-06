
/**
 * Representa a classe Conta de um cliente.
 *
 * @author Andre
 * @version 1.0
 */


public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total;

    public abstract void deposita(double valor);

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    //Método com validador de saldo do saque.
    public void saca(double valor) {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;

    }

    public void transfere(double valor, Conta destino) {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int novoNumero) {
        if (numero <= 0) {
            System.out.println("Número da conta não pode ter valor negativo");
            return;
        }
        this.numero = novoNumero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Número da agencia não pode ter valor negativo");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

}