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
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    private String nombreusuario;
    private String contraseña;

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getEmail() {
        return email;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    
    
    
    public String getNombre (){
        return nombre;}
    public void setNombre(String nombre){
        this.nombre=nombre;}
        
    
    
    public String getUsuario (){
        return usuario;}
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
    
    
    }

boolean nuevoRegistro (String usuario,String password){
     
    if (usuario.equals("none")&& password.equals("none"))
    {
        
        return true;
    } 
        return false;
    
   
}

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }



}
