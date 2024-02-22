import java.util.Scanner;

public class Funcionario {
   Main main = new Main();
   public static void pagamento() {
        for (int x = 0; x < Main.quantidadeDeUsuario; x++) {
            Main.valorPagamento[x] = Main.horas[x] * Main.valorPorHora[x];
            System.out.println("Pagamento: " + Main.valorPagamento[x]);
        }
    }
}
