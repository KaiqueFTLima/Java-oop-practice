package application;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

import entities.ClienteCC;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int conta = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder: ");
        String name = sc.nextLine();
        System.out.println("Is there na initial deposit (y/n)?");
        String aux = sc.nextLine();
        double saldo = 0;
        if (Objects.equals(aux, "y")){
            System.out.println("Enter initial deposit value: ");
            saldo = sc.nextDouble();
        }

        ClienteCC clienteCC = new ClienteCC(name, conta, saldo);
        System.out.println(clienteCC);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        saldo = sc.nextDouble();
        clienteCC.somarSaldo(saldo);
        System.out.println("Updated account data: " + clienteCC);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        saldo = sc.nextDouble();
        clienteCC.tirarSaldo(saldo);

        System.out.println("Updated account data: " + clienteCC);

        sc.close();
    }
}
