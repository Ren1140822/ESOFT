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
public class Exposicao {
    String titulo,descricao,local,periodo;
    
    ListaOrganizadores lo;
    ListaFAE lf;
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    public void setPeriodo(String dataIni,String dataF){
        this.periodo= dataIni+" "+ dataF;
    }
    public void valida(){
        
    }
    public ListaOrganizadores getListaOrganizadores(){
        return lo;
    }
    public ListaFAE getListaFAE(){
        return lf;
    }
}
