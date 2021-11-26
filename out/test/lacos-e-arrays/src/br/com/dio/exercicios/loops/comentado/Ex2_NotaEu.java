package br.com.dio.exercicios.loops.comentado;

import java.util.Scanner;

public class Ex2_NotaEu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        while (true){
            System.out.println("Digite a nota entre 0 e 10: ");
            nota = scan.nextInt();

            if (nota >= 0 && nota <= 10) break;

            System.out.println("Digite um número válido!");
        }
        System.out.println("Nota lançada.");
    }
}
