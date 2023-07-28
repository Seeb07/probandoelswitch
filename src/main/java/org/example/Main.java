package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);

        Double temperaturaAmbiente;

        System.out.print("Digite la temperatura del ambiente");
        temperaturaAmbiente=teclado.nextDouble();

        if (temperaturaAmbiente == 20.0){
            temperaturaAmbiente=25.0;
            System.out.print("Apreciado usuario ingrese la temperatura actual");

        } else if (temperaturaAmbiente == 30.0) {
            temperaturaAmbiente=20.0;

        } else if (temperaturaAmbiente==40.0) {
            temperaturaAmbiente=20.0;

        }else{
            System.out.print("Señor usuario ingrese la temperatura deseada");
            temperaturaAmbiente=teclado.nextDouble();

        }


    }
}
