/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package noticiasPackage;


/**
 *
 * @author pc
 */
public class CheckLoginBean {
    
    private String usuario;
    private String pass;
    
    public String getUsuario (){
        return usuario;
        
        
    }
    public void setUsuario(String usuario){
        this.usuario=usuario;
        
    }
    
    public String getPass (){
        return pass;
        
        
    }

    /**
     *
     * @param pass
     */
    public void setPass(String pass){
        this.pass=pass;
        
    }
    
    
    boolean checkAcceso (String usuario,String password){
        
          if (usuario.equals("dimas")&& password.equals("dimas")){
        
        return true;
               
    }else {
          return false;
      }
    
    
    }}
