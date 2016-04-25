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
public class CriarDemoController {
    
    RegistoExposicao re ;
    List<Exposicao> le;
    Organizador o;//esta variavel está vazia, mas seria obtida pelo utilizador autenticado como organizador.
    ListaDemosExp lde;
    RegistoRecurso rr;
    ListaRecursosDemo lrd;
    List<Recurso> lr;
   
    Demonstracao d;
    public CriarDemoController(CentroDeExposicoes ce){
        re=ce.getRegistoExposicao();
        rr=ce.getRegistoRecurso();
        le=this.getListaExposicoes(o);
    }
    //podia buscar a lista diretamente, mas fica mais modular com método à parte porque pode dar jeito ao UI ir buscar a lista sem ser apenas quando instancia controller
     public List<Exposicao> getListaExposicoes(Organizador o){
        
        le=re.getListaExposicoes(o);
        return le;
    }
     
     public void novaDemonstraçao(Exposicao e){
         lde=e.getListaDemonsExpo();
         d= lde.novaDemonstracao();
     }
     public void setDados(String codigo,String descricao){
         lde.setDados(codigo, descricao);
     }
     public void getListaRecurso(){
          lr=rr.getListaRecurso();
     }
     public void novoRecursoDemo(Recurso r){
         lrd=d.getListaRecursosDemo();
         
     }
     public boolean validaDemo(){
        return lde.validaDemo();//isto é um boolean o ui depois é que tratava
     }
     public void registaDemo(){
         lde.registaDemo();
     }
    
}
