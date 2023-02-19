package javaOrientacaoAObjetosPolimorfismoConta;

public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1, 24);
        cc.deposita(100.0);

        SeguroDeVida sv = new SeguroDeVida();

        CalculadoraDeImposto calcImposto = new CalculadoraDeImposto();
        calcImposto.registra(cc);
        calcImposto.registra(sv);

        System.out.println(calcImposto.getTotalImposto());
    }
}
