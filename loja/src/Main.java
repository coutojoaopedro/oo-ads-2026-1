//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(
           "Farinha de Trigo",
           "Nitta",
           6.50,
           180.0,
           100.0,
           70.0,
           1000.0
        );
        produto1.setEstoque(120);
        produto1.exibir();

        System.out.println("-".repeat(80));

        Produto produto2 = new Produto(
                "Vinho Tinto",
                "Periquita",
                42.0,
                250.0,
                90.0,
                90.0,
                1300.0
        );
        produto2.setImportado(true);
        //produto2.setEstoque(30);
        produto2.exibir();

        System.out.println("-".repeat(80));

        Eletronico e1 = new Eletronico(
            "Rádio relógio",
            "Sony",
            62.90,
            100.0,
            180.0,
            140.0,
            350.0,
            0.05
        );
        e1.setImportado(true);
        e1.setVoltagem(0); // Bivolt
        e1.exibir();
        System.out.println("Consumo em 24h: R$ %.2f".formatted(e1.calcularCustoEnergia(24, 0.5)));

        System.out.println("-".repeat(80));

    }
}