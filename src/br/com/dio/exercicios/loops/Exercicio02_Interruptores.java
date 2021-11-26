package br.com.dio.exercicios.loops;

public class Exercicio02_Interruptores {
    public static void main(String[] args) {
        for(int i = 1; i <= 14; i++){
            if (i == 12){
                break;
            }
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

        int count = 1;
        while(count <= 14){
            if(count == 12) break;
            if (count % 2 == 0){
                System.out.println(count);
            }
            count++;
        }
    }
}
