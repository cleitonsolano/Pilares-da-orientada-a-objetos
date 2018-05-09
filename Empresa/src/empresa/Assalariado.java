
package empresa;

/**
 *Classe que repesenta todas as caracteristicas e ações de um empregado Assalariado
 * @author Cleiton Solano
 */
public class Assalariado extends Empregado{
    private double salario;
    private boolean remuneradoounao;
    /**primeiro utilizar esse metodo na função principal para armazenar todos os dados de um
     * determinado assalariado
     */
    public Assalariado(String n, String sn, String c, double ss){
        super(n,sn,c);
       this.setSalario(ss);
    }
    /** usar esse metodo para aribuir um valor na variavel rnt, onde vai ser adquirida atravez do metodo
     * construtor anterior. onde se a variavel ss - salario, for = 0, a variavel rnr = 0(Printar o assalariado é voluntario)) e caso contrario
     *  ss != 0(vale transporte), a variável rnr = 1(printar o assalariado é estagiario). 
     */
    public Assalariado(String n, String sn, String c, double ss, boolean rnr){
        super(n,sn,c);
        this.setSalario(ss);
        this.setRemuneradoounao(rnr);
    }
    
    /** neste metotodo vencimento, vai ser sempre zero pois nessa classe os empregados
     * não ganhanham salario ou seja não tem como atrasar!
     */
    @Override
    public double vencimento(){
    
        return 0.0;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isRemuneradoounao() {
        return remuneradoounao;
    }

    public void setRemuneradoounao(boolean remuneradoounao) {
        this.remuneradoounao = remuneradoounao;
    }
    
    /**Este metodo @return uma string com todos os dados do empregado Assalariado*/
    @Override
    public String toString() {
        if(this.remuneradoounao == true){
            return super.toString() + "Assalariado{" + "salario=" + salario + ", É voluntário sem remuneração" + '}';
        }else{
            return super.toString() + "Assalariado{" + "salario=" + salario + ", É voluntário com remuneraçao de apens vale trasporte" + '}';
        }
        
    }
    
    
}
