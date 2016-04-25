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
public class Demonstracao {
    private String codigoUnico,descricao;

    ListaRecursosDemo lrd = new ListaRecursosDemo();
    public Demonstracao(){
        
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ListaRecursosDemo getListaRecursosDemo() {
        return lrd;
    }
    public boolean valida(){
        return (this.codigoUnico!=null&&this.descricao!=null)?true:false;
    }
    
}
