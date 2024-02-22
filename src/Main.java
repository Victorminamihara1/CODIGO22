import java.util.Scanner;

public class Main {

    public static int quantidadeDeUsuario = 999;

    public static String nome[] = new String[quantidadeDeUsuario];

    public static int horas[] = new int[quantidadeDeUsuario];

    public static double valorPorHora[] = new double[quantidadeDeUsuario];

    public static boolean tercerizadoF[] = new boolean[quantidadeDeUsuario];

    public static double valorPagamento[] = new double[quantidadeDeUsuario];


    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        Tercerizado tercerizado = new Tercerizado();


        Scanner bind = new Scanner(System.in);
        System.out.println("Insira a quantidade de Funcionários: ");
        quantidadeDeUsuario = bind.nextInt();

        for(int x = 0; x < quantidadeDeUsuario; x++) {
            System.out.println("Insirir Nome: ");
            nome[x] = bind.next();
            System.out.println("Inserir Horas:");
            horas[x] = bind.nextInt();
            System.out.println("Valor por Hora:");
            valorPorHora[x] = bind.nextDouble();
            System.out.println("O funcionário é tercerizado? true/false: ");
            tercerizadoF[x] = bind.nextBoolean();
        }
        for (int x = 0; x <= quantidadeDeUsuario; x++) {
            System.out.println("Nome: " + nome[x]);
            if(tercerizadoF[x] == true){
                tercerizado.pagamento2();
            } else if (tercerizadoF[x] == false){
                funcionario.pagamento();
            }
        }
    }
}