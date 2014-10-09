/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2clase6;

/**
 *realizar una clase, que permita cargar una direccion de email en el constructor, luego en otro metodo mostrar un mensaje si contiene
 * el caracter '@'
 * @author Jose Miguel
 */
public class ejercicio1 {
    private String email;
    
    public ejercicio1(String pEmail){
    this.email=pEmail;
}
    
    public String ValidarCorreo()
    {
        String mensaje="el correo no contiene @";
    for (int i=0; i<email.length();i++) {
        if(email.charAt(i)=='@')
        {
            mensaje="el correo si contiene @";
        }
    }
    return mensaje;
    }
}
