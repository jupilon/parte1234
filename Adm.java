public class Adm Extends Empregado{

    private double ajudaCusto;


    @Override
    public double calcularSalario(){
        return super.calcularSalario()+ajudaCusto;
    }
}