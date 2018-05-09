
package empresa;

import java.util.*;
import javax.swing.*;

/**
 * Classe principal
 * @author Cleiton Solano
 * @version 0.1
 * @since feito 30/04/2018
 */
public class Empresa {
    
    public static void main(String[] args) {
        ArrayList<Assalariado> listassalariados = new ArrayList<>();
        ArrayList<Comissionado> listcomissionados = new ArrayList<>();
        ArrayList<Horista> listhoristas = new ArrayList<>();
        
        int op = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Assalarido\n2 - Cadastrar Comissionado\n 3 - Cadastrar Horista\n"));
        
        int opp = 0;
        switch(op){
            case 1: 
                while(opp == 0){
                    
                    String nome = JOptionPane.showInputDialog("Informe o Nome:");
                    String snome = JOptionPane.showInputDialog("Informe o Sobrenome:");
                    String cpf = JOptionPane.showInputDialog("Informe o CPF:");
                    double salario = (Double.parseDouble(JOptionPane.showInputDialog("Digite o salario:")));
                    
                    if(salario == 0){ /** é voluntario*/
                        listassalariados.add(new Assalariado(nome, snome, cpf, salario,true));
                    }else{/** é estagiario*/
                        listassalariados.add(new Assalariado(nome, snome, cpf, salario,false));
                    }
                    opp = JOptionPane.showConfirmDialog(null,"Cadastrar novo Assalariado?","Cadastro Assalariado",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                }
                break;
            
            case 2:
                opp = 0;
                while(opp == 0){
                    String cpf = JOptionPane.showInputDialog("Informe o CPF:");
                    double totalvendas = (Double.parseDouble(JOptionPane.showInputDialog("Digite o total de vendas feitas pelo comissionado:")));
                    double taxacomissao = (Double.parseDouble(JOptionPane.showInputDialog("Digite qual o valor da taxa de comissao:")));
                    listcomissionados.add(new Comissionado(cpf, totalvendas, taxacomissao));
                    opp = JOptionPane.showConfirmDialog(null,"Cadastrar novo Comissionado?","Cadastro Comissionado",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                }
                break;
                
            case 3:
                opp = 0;
                while(opp == 0){
                    String cpf = JOptionPane.showInputDialog("Informe o CPF:");
                    double precohoras= (Double.parseDouble(JOptionPane.showInputDialog("Digite o vlaor do preço horas do horista:")));
                    double horastrabalhadas = (Double.parseDouble(JOptionPane.showInputDialog("Digite quantas horas foram compridas pelo horista:")));
                    listhoristas.add(new Horista(cpf, precohoras, horastrabalhadas));
                }
                break;
        }
        int oppp = Integer.parseInt(JOptionPane.showInputDialog("1- Imprimir dados Assalariados\n2 - Imprimir dados Comissionados\n3 - Imprimir dados Horistas\n"));
        
        switch(oppp){
            case 1:
                for(int i=0; i< listassalariados.size();i++){
                    JOptionPane.showMessageDialog(null, listassalariados.get(i).toString());
                }
                break;
            
            case 2:
                for(int i=0;i< listcomissionados.size();i++){
                    JOptionPane.showMessageDialog(null,listcomissionados.get(i).toString());
                }
                break;
                
            case 3:
                for(int i=0;i< listhoristas.size();i++){
                    JOptionPane.showMessageDialog(null,listhoristas.get(i).toString());
                }
                
                break;
        
        }
    }
    
}
