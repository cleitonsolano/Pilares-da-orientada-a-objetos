
package empresa;

/**
 * Classe que representa todas as cracteristicas e açõe de um empregado Comissionados
 * @author Cleiton Solano
 */
public class Comissionado extends Empregado {
    private double totalvenda, taxacomissao;

    
    /**Este metodo construtor ele pega todas as variaveis da classe comissionado + todas as variaveis de Empregado 
     * 
     */
    public Comissionado(String n, String sn, String c, double tv, double txc){
        super(n,sn,c);
        this.setTaxacomissao(tv);
        this.setTotalvenda(txc);
    }
    /**Este metodo onstrutor da classe Comissionado mais incompleto(continua estando certo), outras variaveis são auxiliares*/
    public Comissionado(String c, double tv, double txc){
        super(c);
        this.setTaxacomissao(tv);
        this.setTotalvenda(txc);
    }
    
    /** neste metotodo vencimento, vai calcular o valor
     *  que a empresa vai ter que pagar ao comissionado, se a mesma não pagar o seu salario no dia certo!
     */
    @Override
    public double vencimento(){
        double taxa = 0.5;
        return taxa * this.totalvenda;
    }
    public double salario_c(){
        return this.taxacomissao * this.totalvenda;
    }

    public double getTotalvenda() {
        return totalvenda;
    }

    public void setTotalvenda(double totalvenda) {
        this.totalvenda = totalvenda;
    }

    public double getTaxacomissao() {
        return taxacomissao;
    }

    public void setTaxacomissao(double taxacomissao) {
        this.taxacomissao = taxacomissao;
    }

    /**Este metodo @return uma string com todos os dados do empregado Comissionados*/
    @Override
    public String toString() {
        return super.toString() + "Comissionado{" + "totalvenda=" + totalvenda + ", taxacomissao=" + taxacomissao + '}';
    }
    
    
    
}
