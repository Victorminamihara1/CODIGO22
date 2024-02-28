package src;
   public class Tercerizado extends Funcionario{
    public double bonusAdicional;
    public Tercerizado(String nome, int horas, double valorPorHora, double bonusAdicional){

        super(nome, horas, valorPorHora);
        this.bonusAdicional = bonusAdicional;

    }
    public double pagamento2() {

        double resultado = (horas * valorPorHora) * bonusAdicional;

        return  resultado;
    }

}
