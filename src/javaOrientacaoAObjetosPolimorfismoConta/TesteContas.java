package javaOrientacaoAObjetosPolimorfismoConta;

public class TesteContas {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(1,23);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(2,33);
        cp.deposita(200.0);

        cc.tranfere(10, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

    }
}
