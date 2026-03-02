package application;

import entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos vão ser alugados? ");
        int n = sc.nextInt();

        Estudante[] vect = new Estudante[10];

        for (int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Aluguel #" + i);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();

            vect[quarto] = new Estudante(nome, email);
        }

        System.out.println();
        System.out.println("Quartos alugados: ");

        for (int i = 0; i < 10; i++){
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
