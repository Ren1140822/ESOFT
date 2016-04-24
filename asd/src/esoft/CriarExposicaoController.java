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
public class CriarExposicaoController {

    String titulo, desc, dataIni, dataF, local;
    RegistoExposicao re;
    RegistoUtilizador ru;
    ListaOrganizadores lo;
    Exposicao e;
    List<Utilizador> lu;

    public CriarExposicaoController(CentroDeExposicoes ce) {
         re = ce.getRegistoExposicao();
         ru = ce.getRegistoUtilizador();
    }

    public void novaExposicao() {
       
        e = re.novaExposicao();

    }

    public void setDados(String titulo, String desc, String dataIni, String dataF, String local) {
        e.setTitulo(titulo);
        e.setDescricao(desc);
        e.setPeriodo(dataIni, dataF);
        e.setLocal(local);
    }

    public List<Utilizador> getListaUtilizadores(List<Utilizador> lista) {
        
        lu = ru.getListaUtilizadores();
        return lu;
    }

    public void novoOrganizador(Utilizador u) {
        lo = e.getListaOrganizadores();
        lo.novoOrganizador(u);
    }

    public void validaExposicao() {
        re.validaExposicao(e);
    }

    public void registaExposicao() {
        re.registaExposicao(e);
    }
}
