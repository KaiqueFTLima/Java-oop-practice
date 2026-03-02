package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qauntos numeros voce vai digitar?");
        int n = sc.nextInt();
        int [] vect = new int [n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            if(vect[i] < 0){
                System.out.println("Numeros negativos: " + vect[i]);
            }
        }

        sc.close();
    }
}
