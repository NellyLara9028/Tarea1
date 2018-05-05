/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nalv2;

/**
 *
 * @author Alumno
 */

class Ciudad
{
     String Nombre;
     int habitantes;
     int extension;

Ciudad(String Nombre, int habitantes, int extension)
{
 this.Nombre = Nombre;
 this.extension = extension;
 this.habitantes = habitantes;
}
int obtenerDensidad()
{
   int densidad = habitantes/extension;
   return densidad;
}

}

public class NALV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Ciudad SPS = new Ciudad ("San Pedro Sula", 10000000, 5000);
        System.out.println("Nombre: " + SPS.Nombre);
        System.out.println("Habitantes: " + SPS.habitantes);
        System.out.println("extension: " + SPS.extension + " km2");
        System.out.println("Densidad: " + SPS.obtenerDensidad() + " hab por km2");
    }
    
}
