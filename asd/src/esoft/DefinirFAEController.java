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
public class DefinirFAEController {
    List<Exposicao> le;
    List<Utilizador> lu;
    Organizador o;
    RegistoExposicao re;
    RegistoUtilizador ru;
    ListaFAE lf;
    public DefinirFAEController(CentroDeExposicoes ce){
        re=ce.getRegistoExposicao();
        ru = ce.getRegistoUtilizador();
    }
    public List<Exposicao> getListaExposicoes(Organizador o){
        
        le=re.getListaExposicoes(o);
        return le;
    }
    public List<Utilizador>getListaUtilizadores(){
        
        lu=ru.getListaUtilizadores();
        return lu;
    }
    public void novoFAE(Exposicao e,Utilizador u){
        lf=e.getListaFAE();
    }
    public void registaFAE(){
        lf.registaFAE();
    }
    
}
