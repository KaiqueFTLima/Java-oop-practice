package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        double soma = 0;
        double media = 0;
        int [] vect = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("VALORES: ");

        for (int i = 0; i < n; i++){
            System.out.print(vect[i] + " ");
            soma += vect[i];
            media = soma / n;
        }

        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);

        sc.close();
    }
}
