package br.com.dio.exercicios.loops.comentado;

import java.util.Objects;
import java.util.Scanner;

public class Ex1_NomeEIdade_Eu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = "";
        int idade;

        while(true){

            System.out.println("Digite o nome: ");
            nome = scan.next();
            if(Objects.equals(nome, "0")){
                break;
            }

            System.out.println("Digite a idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Fim!");
    }
}
