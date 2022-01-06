public class TesteExceptionDeSaldo {

    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(1234,11112);
        ContaPoupanca cc2 = new ContaPoupanca(5678,22223);


        cc1.deposita(1000);
        cc1.saca(1001); //testar saque com valor maior que o saldo.


    }
}
