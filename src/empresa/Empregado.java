
package empresa;

/**
 *Classe que reprepresenta todos os empregados da empresa
 * @author Cleiton Solano
 */
public class Empregado {
    private String nome, sobrenome, cpf;
    /**Este metodo construtor ele pega todas as variaveis da classe Empregado 
     * 
     */
    public Empregado( String n, String sn, String c){
      this.setCpf(c);
      this.setNome(n);
      this.setSobrenome(sn);
    
    }
    /**Este metodo construtor não realiza a leitura do nome e do sobrenome pois o cpf é um atribto de chave
     *primaria, ou seja ele sozinho é capaz de diferenciar os empregado  
     */
    public Empregado( String c){ 
      this.setCpf(c);
    
    }

    public double vencimento(){
        return 0.0;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    /**Este metodo @return uma string com todos os dados do empregado*/
    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + '}';
    }

    
}
