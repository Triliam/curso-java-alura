package Testes;

public class Prof {

    private String nome;
    public static int qnt;


    public Prof(String nome) {
        this.nome = nome;
        qnt++;
    }

    public Prof() {

    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public static int getQntProf() {
//        return qntProf;
//    }
//
//    public static void setQntProf(int qntProf) {
//        Prof.qntProf = qntProf;
//    }
}
