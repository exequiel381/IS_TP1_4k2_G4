/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author fiume
 */
public class Autenticacion {

    
    
    private String usuario;
    private String pass;
    
    public Autenticacion( String usuario, String pass) {
        
       
        this.pass=pass;
        this.usuario=usuario;
    }
    
    public String ObtenerRol(){
        
            Usuario user=null;
            String rol="";
            
            Repositorio c = Repositorio.getRepositorio();
            
           for(Usuario u:c.usuarios){
               if(u.getUser().equals(usuario)){
                   if(u.getPass().equals(pass)){
                       user = u;
                       rol=u.getEmpleado().getRol();
                   }
               }
           }
           
           if(user==null) JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
            
           
        
            return rol;
    }
    
}
