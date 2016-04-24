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
public class RegistoRecurso {
     private Recurso r;
     private List<Recurso>listaRecurso= new ArrayList();
    public Recurso novoRecurso(){
        r= new Recurso();
        return r;
    }
    public void registaRecurso(Recurso r){
        if(!validaRecursoGlobal(r)){
            addRecurso(r);
        }
    }
    public boolean validaRecursoGlobal(Recurso r){
        for(Recurso r2:listaRecurso){
            if(r.equals(r2)){
                return true;
            }
        }
        return false;
    }
    public void addRecurso(Recurso r){
        listaRecurso.add(r);
    }
}
