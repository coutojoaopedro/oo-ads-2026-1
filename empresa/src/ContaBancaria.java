public class ContaBancaria {

    public Double saldo;
    public String titular;

    public ContaBancaria(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(Double quantia) {
        this.saldo += quantia;
    }

    public void sacar(Double quantia) {
        this.saldo -= quantia;
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + this.titular + " | Saldo: R$ " + this.saldo);
    }
}