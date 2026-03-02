package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Pessoa[] vect = new Pessoa[n];
        double somaAltura = 0;
        double mediaAltura = 0;
        double contador = 0;

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Pessoa(nome, idade, altura);
        }

        for (int i = 0; i < n; i++){
            somaAltura += vect[i].getAltura();
            mediaAltura = somaAltura / n;
            if(vect[i].getIdade() < 16){
                contador++;
            }
        }

        System.out.printf("Altura media: %.2f%n", mediaAltura);
        System.out.println("Pessoas com menos de 16 anos: " + (contador / n) * 100 + " %");

        for (int i = 0; i < n; i++){
            if (vect[i].getIdade() < 16){
                System.out.println(vect[i].getNome());
            }
        }


        sc.close();
    }
}
