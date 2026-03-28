public class Main {

    public static void main(String[] args) {
        // teste01();
        // teste02();
        teste03();
    }

    public static void teste03() {
        ContaEspecial conta1 = new ContaEspecial("Alice Almeida", Double.valueOf(1000.0), Double.valueOf(500.0));
        ContaEspecial conta2 = new ContaEspecial("Bruno Borges", Double.valueOf(2500.0), Double.valueOf(1000.0));
        ContaEspecial conta3 = new ContaEspecial("Carla Cardoso", Double.valueOf(300.0), Double.valueOf(200.0));

        conta1.depositar(Double.valueOf(400.0));
        conta1.sacar(Double.valueOf(150.0));

        conta2.sacar(Double.valueOf(800.0));
        conta2.depositar(Double.valueOf(200.0));

        conta3.depositar(Double.valueOf(100.0));
        conta3.sacar(Double.valueOf(50.0));

        System.out.println("=".repeat(40));
        conta1.exibirSaldo();
        conta1.exibirSaldoReal();

        System.out.println("=".repeat(40));
        conta2.exibirSaldo();
        conta2.exibirSaldoReal();

        System.out.println("=".repeat(40));
        conta3.exibirSaldo();
        conta3.exibirSaldoReal();

        System.out.println("=".repeat(40));
    }
}