package javaExcecoes;

public class TesteTributaveis {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(42, 22);
        cc.deposita(100);

        SeguroDeVida sv = new SeguroDeVida();

        CalculadoraDeImpostos ci = new CalculadoraDeImpostos();
        ci.registra(cc);
        ci.registra(sv);

        System.out.println(ci.getTotalEmImposto());
    }
}
