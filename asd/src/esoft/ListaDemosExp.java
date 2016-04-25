/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esoft;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PRenato
 */
public class ListaDemosExp {
    Demonstracao d;
    private List<Demonstracao>listaDemo = new ArrayList();
    public Demonstracao novaDemonstracao(){
        d= new Demonstracao();
        return d;
    }
    public void setDados(String codigo,String descricao){
        d.setCodigoUnico(codigo);
        d.setDescricao(descricao);
    }
    public boolean validaDemo(){
       return d.valida();
    }
    public void registaDemo(){
       listaDemo.add(d);
    }
   
}
