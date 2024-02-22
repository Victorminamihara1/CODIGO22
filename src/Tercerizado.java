public class Tercerizado {

    Funcionario funcionario = new Funcionario();
    Main main = new Main();
    public double valorPagamentoTerc[] = new double [Main.quantidadeDeUsuario];

    void pagamento2() {
        for (int x = 0; x < Main.quantidadeDeUsuario; x++) {
            valorPagamentoTerc[x] = (Main.horas[x] * Main.valorPorHora[x]) * 2.1;
            System.out.println("Pagamento: " + valorPagamentoTerc[x]);
        }
    }
}
