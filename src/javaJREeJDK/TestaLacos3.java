package javaJREeJDK;

import java.util.Scanner;

public class TestaLacos3 {

    public static void main(String[] args) {

        //escolha a tabuada que deseja imprimir

        Scanner scan = new Scanner(System.in);

        int num = 0;
        int multiplica = 0;

        System.out.println("Entre com o numero da tabuada");
        num = scan.nextInt();

        System.out.println("Tabuada de: " + num + "\n");
        for (int i = 0; i <= 10; i ++){
            multiplica = i * num;
            System.out.println(i + " x " + num + " = " + multiplica);
        }
    }

}
