package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner bind = new Scanner(System.in);
        System.out.println("Insira a quantidade de Funcionários: ");
        int quantidadeDeUsuario = bind.nextInt();
        Funcionario[] funcionario = new Funcionario[quantidadeDeUsuario];
        Tercerizado[] tercerizado = new Tercerizado[quantidadeDeUsuario];

        for (int x = 0; x < quantidadeDeUsuario; x++) {
            System.out.println("Insirir Nome: ");
            String nome = bind.next();
            System.out.println("Inserir Horas:");
            int horas = bind.nextInt();
            System.out.println("Valor por Hora:");
            double valorPorHora = bind.nextDouble();
            System.out.println("O funcionário é tercerizado? true/false: ");

            boolean tercerizadoF = bind.nextBoolean();
            bind.nextLine();

            if (tercerizadoF) {

                double bonusAdicional = 2.1;
                tercerizado[x] = new Tercerizado(nome, horas, valorPorHora, bonusAdicional);
                System.out.println("Nome: " + tercerizado[x].nome);
                System.out.println("Pagamento: R$" + tercerizado[x].pagamento2());
            } else {

                funcionario[x] = new Funcionario(nome, horas, valorPorHora);
                System.out.println("Nome: " + funcionario[x].nome);
                System.out.println("Pagamento: R$" + funcionario[x].pagamento());

                }
            }
        }
    }


