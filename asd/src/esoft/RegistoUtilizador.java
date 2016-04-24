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
public class RegistoUtilizador {
    List<Utilizador>listaUtilizadores;
    Utilizador u;
    
    
    public List<Utilizador>getListaUtilizadores(){
        
        return listaUtilizadores;
    }
    public Utilizador novoUtilizador(String nome,String email,String password,String username){
        u=new Utilizador();
        u.setEmail(email);
        u.setNome(nome);
        u.setPassword(password);
        u.setUsername(username);
        if(u.validaDados()){
            return u;
        }
        return null;
    }
    public void registaUtilizador(){
        validaUtilizador();
    }
    public void validaUtilizador(){
        for(Utilizador u2:listaUtilizadores){
            if(!u2.equals(u)){
                addUtilizador();
            }
        }
    }
    public void addUtilizador(){
        listaUtilizadores.add(u);
    }
}
