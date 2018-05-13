package empresa;

/**
 * Classe que repesenta todas as caracteristicas e ações de um empregado Horista
 * @author Cleiton Solano
 */
public class Horista extends Empregado{
    private double precohora, horatrabalhadas;
    
    /**Este metodo onstrutor da classe horista mais completo*/
    public Horista(String n, String sn, String c, double ph, double ht) {
        super(n, sn, c);
        this.setPrecohora(ph);
        this.setHoratrabalhadas(ht);
    }
    /**Este metodo onstrutor da classe horista mais incompleto(continua estando certo), outras variaveis são auxiliares*/
    public Horista(String c, double ph, double ht) {
        super(c);
        this.setPrecohora(ph);
        this.setHoratrabalhadas(ht);
    }
    /** neste metotodo vencimento, vai calcular o valor
     *  que a empresa vai ter que pagar ao horista, se a mesma não pagar o seu salario no dia certo
     */
    @Override
    public double vencimento(){
        double taxa = 0.4;
        return taxa*this.precohora;
    }
    
    public double salario_h(){
    
        return this.horatrabalhadas * this.precohora;
    }

    public double getPrecohora() {
        return precohora;
    }

    public void setPrecohora(double precohora) {
        this.precohora = precohora;
    }

    public double getHoratrabalhadas() {
        return horatrabalhadas;
    }

    public void setHoratrabalhadas(double horatrabalhadas) {
        this.horatrabalhadas = horatrabalhadas;
    }

/**Este metodo @return uma string com todos os dados do empregado Horista*/    
    @Override
    public String toString() {
        return super.toString() + "Horista{" + "precohora=" + precohora + ", horatrabalhadas=" + horatrabalhadas + '}';
    }

    
    
}
