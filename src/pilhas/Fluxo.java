package pilhas;

import javaOrientacaoAObjetosPolimorfismoConta.Conta;

public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Inicio do metodo main");
        try{
        metodo1();
        } catch (ArithmeticException | NullPointerException ex){
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do metodo main");
    }
        private static void metodo1(){
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("fim do metodo1");
        }

        private static void metodo2(){
        System.out.println("Inicio do metodo2");
        for (int i = 0; i < 5; i++){
            System.out.println(i);

            //testando Exceptions
           // int a = i / 0;
            Conta conta = null;
            conta.deposita(100);
        }
        System.out.println("fim do metodo2");
        }


}
