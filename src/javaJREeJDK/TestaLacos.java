package javaJREeJDK;

public class TestaLacos {

    public static void main(String[] args) {

        //Escreva um for encadeado que imprima a tabuada de cada número

        int multiplica = 0;

        for (int i = 1; i <= 10; i++){
            for (int j = 0; j <=10; j++){
                multiplica = i * j;
                System.out.println(multiplica);
            }
            System.out.println();
        }

    }
}
