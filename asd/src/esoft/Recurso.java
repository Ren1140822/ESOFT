/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esoft;

/**
 *
 * @author PRenato
 */
public class Recurso {
    String nome;
    public Recurso(){
        
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public boolean validaLocal(){
        return (nome!=null)?true:false;
    }
    public boolean equals(Recurso r){
        if(this.nome.equals(r.nome)){
            return true;
        }
        return false;
    }
}
