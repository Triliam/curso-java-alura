package Testes;

public class TesteProf {
    public static void main(String[] args) {

//        int mostra = Prof.qnt;
//        System.out.println(mostra);


        System.out.println(Prof.qnt); //qtd é um atributo static, no caso para contar quantos Prof serao instanciados

        Prof prof = new Prof("Nomi"); //instancia a classe Prof, para a referencia -prof- poder acessar os metodos criados na classe Prof

        System.out.println(prof); //mostra local na memoria que a referencia -prof- esta apontando

        System.out.println(prof.getNome()); //a referencia chama o metodo que mostra o valor atribuido pro atributo private String nome;

        Prof prof1 = new Prof("Na");
        Prof prof2 = new Prof("Ni");
        Prof prof3 = new Prof("No");
        Prof prof4 = new Prof("Nu");

        System.out.println(Prof.qnt);


    }
}
