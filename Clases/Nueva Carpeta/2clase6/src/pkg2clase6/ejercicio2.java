/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2clase6;

/**
 * cargar un string por teclado e implementar las siguentes metodos
 *
 * @author Jose Miguel
 */
public class ejercicio2 {

    private String cadena;

    public String MediaCadena() {
        String retorno = "";
        for (int i = 0; i < getCadena().length() / 2; i++) {
            retorno += getCadena().charAt(i);
        }

        return retorno;
    }

    /**
     * return the cadena
     */
    public String UltimoValor() {
        return getCadena().charAt(getCadena().length() - 1) + "";
    }

    public String Alrevez() {

        String retorno = "";

        for (int i = getCadena().length() - 1; i >= 0; i--) {
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }

    public String Guion() {
        String retorno = "";

        for (int i = 0; i < getCadena().length(); i++) {

            if (getCadena().length() - 1 == i) {
                retorno += getCadena().charAt(i);
            } else {
                retorno += getCadena().charAt(i) + "-";
            }
        }
        return retorno;

        //To change body of generated methods, choose Tools | Templates.
    }

    public int Vocales() {

        int cantidadVocales = 0;

        for (int i = 0; i < getCadena().length(); i++) {

            if ((getCadena().charAt(i) == 'a')
             || (getCadena().charAt(i) == 'A')
             ||(getCadena().charAt(i) == 'b')
             ||(getCadena().charAt(i) == 'e')
             ||(getCadena().charAt(i) == 'E')
             ||(getCadena().charAt(i) == 'i')
             ||(getCadena().charAt(i) == 'I')
             ||(getCadena().charAt(i) == 'o')
             ||(getCadena().charAt(i) == 'O')
             ||(getCadena().charAt(i) == 'u')
             ||(getCadena().charAt(i) == 'U'))
                    
             

{
cantidadVocales++;
            }
        }

        
        return cantidadVocales;
    }

    public boolean Palindromo() {
        String palabraAlrevez = "";

        for (int i = getCadena().length() - 1; i >= 0; i--) {
            palabraAlrevez += getCadena().charAt(i);
        }
        if (getCadena().equals(palabraAlrevez)) {
            return true;
        } else {
            return false;
        }
    }

    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
}
