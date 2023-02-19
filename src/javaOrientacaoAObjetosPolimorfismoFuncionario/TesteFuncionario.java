package javaOrientacaoAObjetosPolimorfismoFuncionario;

public class TesteFuncionario {
    public static void main(String[] args) {


        Gerente gerente = new Gerente();
        gerente.setNome("Nico");
        gerente.setCpf("77788899944");
        gerente.setSalario(2.800);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getSalario());
        System.out.println(gerente.getBonificacao());
    }
}
