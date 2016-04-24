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
public class DefinirRecursoController {
    private RegistoRecurso re;
    Recurso r;
    public DefinirRecursoController(CentroDeExposicoes ce){
        re=ce.getRegistoRecurso();
    }
    public void novoRecurso(String nome){
        
        r=re.novoRecurso();
        r.setNome(nome);
    }
    public void registaRecurso(){
        re.registaRecurso(r);
    }
}
