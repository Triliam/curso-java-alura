package javaExcecoes;

public class CalculadoraDeImpostos {

    private double totalEmImpostos;

    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalEmImpostos = totalEmImpostos + valor;
    }

    public double getTotalEmImposto() {

        return totalEmImpostos;
    }
}
