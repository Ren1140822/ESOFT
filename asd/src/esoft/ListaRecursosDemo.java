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
public class ListaRecursosDemo {
    List<Recurso> lr = new ArrayList();
    public void novoRecursoDemo(Recurso r){
        if(!validaRecurso(r)){//Se nao houver duplicados
            addRecurso(r);
        }
    }
    public boolean validaRecurso(Recurso r){
        for(Recurso r2: lr){
            if(r.equals(r2)){//equals implementado na classe recurso
                return true;
            }
        }
        return false;
    }
    public void addRecurso(Recurso r){
        lr.add(r);
    }
}
