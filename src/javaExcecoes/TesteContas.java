package javaExcecoes;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {

        //ArithmeticException
//        int a = 3;
//        int b = a / 0;

//        ContaCorrente outra = null;
//        outra.deposita(200);

        ContaCorrente cc = new ContaCorrente(11, 22);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(12, 23);
        cp.deposita(100);

        cc.tranfere(25, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
    }
}
