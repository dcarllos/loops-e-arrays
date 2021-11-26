package br.com.dio.exercicios.loops.comentado;

import java.util.Scanner;

public class meuFatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número para descobrir o fatorial dele: ");
        int numero = scan.nextInt();
        int fatorial = 0;
        System.out.print(numero + " X ");
        for (int i = numero -1; i >=1; i--){
            fatorial += (numero * i);
            System.out.print(i + " X ");
        }
    }
}

