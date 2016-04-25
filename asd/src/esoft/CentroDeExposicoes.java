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
public class CentroDeExposicoes {
    private static RegistoUtilizador ru = new RegistoUtilizador();
    private static RegistoExposicao re = new RegistoExposicao();
    private static RegistoRecurso rr = new RegistoRecurso();
    public  RegistoUtilizador getRegistoUtilizador(){
        return ru;
    }
        public RegistoExposicao getRegistoExposicao(){
        return re;
    }
    public RegistoRecurso getRegistoRecurso(){
        return rr;
    }
        
    //METODOS E VARS EXCLUSIVOS UC7 - SEM PADROES HC/LC  
       private static List<Utilizador>utilizadoresNaoRegistados;
       
       public static List<Utilizador>getRegistosPendentes(){
           return utilizadoresNaoRegistados;
       }
       public static Utilizador getUtilizador(Utilizador u){
           for(Utilizador user:utilizadoresNaoRegistados){
               if(user.equals(u)){
                   return user;
               }
           }
           return null;
       }
        public static void ConfirmarUtilizador(Utilizador u){
           //Aqui adicionava-se ao array de utilizadores normalizados, que já não se encontra nesta classe
           //Este UC (UC7) não aplica o padrão HC/LC 
           //Se fosse aplicada, a confirmaçao do utilizador seria feita na classe RegistoUtilizador.
            
        }
        
        
        
        
        
        
        
        
}
