package javaJREeJDK;

public class TestaLacos2 {

    public static void main(String[] args) {

        //Praticar o comando break imprimindo uma matriz triangular

        for (int linha = 0; linha < 10; linha++){
            for (int coluna = 0; coluna < 10; coluna++){
                if (coluna > linha){
                    break;
                }
                System.out.print("*"); //precisa ser .print e nao .println pra funcionar
            }
            System.out.println();
        }

        // tirando o if

        for (int linha = 0; linha < 10; linha++){
            for (int coluna = 0; coluna <= linha; coluna++){ //com a condicao direto no for
              System.out.print("º"); //precisa ser .print e nao .println pra funcionar
            }
            System.out.println();
        }

    }
}
