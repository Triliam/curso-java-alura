package javaOrientacaoAObjetosPolimorfismoFuncionario;

public class EditorVideo extends Funcionario{
    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do Editor de video");
        return 150;
    }
}
