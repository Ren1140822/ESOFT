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
public class ListaOrganizadores {
    private List<Organizador> listaOrganizadores;
    private Organizador o;
    
    public void novoOrganizador(Utilizador u){
        o= new Organizador();
        o.setUtilizador(u);
    }
      
    public void validaOrganizador(){
        if(o!=null){
            //EXEMPLO DE VALIDAÇAO
        }
    }
      
    public void addOrganizador(){
        listaOrganizadores.add(o);
    }
    public List<Organizador>getListaOrganizadores(){
        return listaOrganizadores;
    }
}
