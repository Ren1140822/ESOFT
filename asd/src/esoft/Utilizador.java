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
public class Utilizador {
    String nome,email,password,username;
 
    public Utilizador(){
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }

    public void setUsername(String Username) {
        this.username = Username;
    }
    public boolean validaDados(){
        if(!nome.isEmpty()&&!email.isEmpty()&&!username.isEmpty()&&!password.isEmpty()){
            return true;
        }
        return false;
    }
    
    public boolean equals(Utilizador u){
        boolean resultado=false;
        if(this==u){
           resultado= true;
        }
        if(this.nome.equals(u.nome)&&this.email.equals(u.email)&&this.password.equals(u.password)&&this.username.equals(u.username)){
            resultado = true;
        }
        return resultado;
    }
}
