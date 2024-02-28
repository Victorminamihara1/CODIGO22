package src;
public class Funcionario {
    String nome;
    int horas;
    Double valorPorHora;
    double valorPagamento;
    public Funcionario(String nome, int horas, double valorPorHora){
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }
   public double pagamento() {

       valorPagamento = horas* valorPorHora;

        return valorPagamento;
    }
}
