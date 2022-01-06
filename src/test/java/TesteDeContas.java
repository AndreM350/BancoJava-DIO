public class TesteDeContas {

    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(1234,11112);
        ContaPoupanca cc2 = new ContaPoupanca(5678,22223);


        cc1.deposita(1000);
        cc2.deposita(2000);

        System.out.println(cc1.getSaldo());
        System.out.println(cc2.getSaldo());

        cc1.transfere(500,cc2);

        System.out.println(cc1.getSaldo());
        System.out.println(cc2.getSaldo());







    }

}
