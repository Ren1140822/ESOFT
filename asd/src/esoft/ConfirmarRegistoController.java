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
public class ConfirmarRegistoController {
    List<Utilizador>luNaoRegistados;
    Utilizador este;
    CentroDeExposicoes ce;
    public ConfirmarRegistoController(CentroDeExposicoes ce){
        //UC7 NAO VAI BUSCAR CLASSE , NAO EXISTE
    }
    public void getRegistosPendentes(){
        luNaoRegistados=ce.getRegistosPendentes();
    }
    public void getInformacaoUtilizador(Utilizador u){
        este=ce.getUtilizador(u);
    }
    public void ConfirmarUtilizador(){
        ce.ConfirmarUtilizador(este);
    }
}
