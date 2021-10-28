public class Empregado Extends Pessoa{

    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public double calcularSalario(){
        double salarioTotal;
        salarioTotal=this.salarioBase-this.imposto;
        return salarioLiquido;
    }

}