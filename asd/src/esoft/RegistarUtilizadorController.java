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
public class RegistarUtilizadorController {
    
    RegistoUtilizador ru;
    Utilizador u;
    public RegistarUtilizadorController(CentroDeExposicoes ce){
         ru=ce.getRegistoUtilizador();
    }
    public void novoUtilizador(String nome,String email,String password,String username){
       
        u=ru.novoUtilizador(nome,email,password,username);
    }
    public void registaUtilizador(){
        ru.registaUtilizador();
    }
}
