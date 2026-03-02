package entities;

public class ClienteCC {
    private String name;
    private int conta;
    private double saldo;

    public ClienteCC(String name, int conta, double saldo){
        this.name = name;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getConta(){
        return conta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void somarSaldo(double saldo){
        this.saldo += saldo;
    }

    public void tirarSaldo(double saldo){
        this.saldo -= saldo + 5.0;
    }


    public String toString(){
        return " "
        + "Account: "
        + conta
        + " , Holder: "
        + name
        + " , Balance: $"
        + String.format("%.2f", saldo);
    }
}
