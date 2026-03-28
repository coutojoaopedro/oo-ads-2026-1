public class ContaEspecial extends ContaBancaria {

    public Double limite;

    public ContaEspecial(String titular, Double saldo, Double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Titular: " + this.titular +
                " | Saldo com limite: R$ " + (this.saldo + this.limite));
    }

    public void exibirSaldoReal() {
        System.out.println("Titular: " + this.titular +
                " | Saldo real: R$ " + this.saldo);
    }
}