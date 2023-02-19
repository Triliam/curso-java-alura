package javaOrientacaoAObjetosPolimorfismoFuncionario;

public class TesteGerente {
    public static void main(String[] args) {

//        Autenticavel referencia = new Cliente();
//
//        Gerente gerente1 = new Gerente();
//        gerente1.setNome("Tomas");
//        gerente1.setSalario(2.300);
//        gerente1.getBonificacao();
//
////        gerente1.setSenha(2222);
////        boolean autenticou = gerente1.autentica(2222);
//
//        Gerente g1 = new Gerente();
//
//        g1.setSenha(2222);
//        boolean autenticacao = g1.autentica(2222);
//
//        System.out.println(autenticacao);
//
//        System.out.println(gerente1.getBonificacao());
//      //  System.out.println(autenticou);

        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("235568413");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(2222);
        boolean autenticou = g1.autentica(2222);

        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());

    }

}
