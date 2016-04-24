/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esoft;

import java.util.List;

/**
 *
 * @author PRenato
 */
public class ListaFAE {
    List<FAE> listaFAE;
    FAE f;
    public void novoFAE(Utilizador u){
        f= new FAE();
        f.setUtilizador(u);
    }
    public void registaFAE(){
        validaFAE();
        addFAE();
    }
    public void validaFAE(){
        if(f!=null){
            
        }
    }
    public void addFAE(){
        listaFAE.add(f);
    }
}
