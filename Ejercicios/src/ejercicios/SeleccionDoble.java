/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner; //Importar datos de Scanner
import paquetedos.Operacion; //Importar mensajes del paquete Operacion
/**
 *
 * @author Andrés Vallejo
 */
public class SeleccionDoble {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Inicializar variables
        int calificacion;
        int calificacion2;
        String miMensaje = Operacion.mensaje;
        String miMensaje2 = Operacion.mensaje2;
        //Ingreso por teclado de las notas 1 y 2
        System.out.println("Ingrese la nota 1");
        calificacion = sc.nextInt();
        
        System.out.println("Ingrese la nota 2");
        calificacion2 = sc.nextInt();
        //Primer condicional
         if (calificacion >= 85){
            //Metodo importanto mensaje desde otro paquete
            System.out.printf("%s %d\n" ,miMensaje, calificacion);
    } else {
          //En caso contrario mostrar este mensaje
             System.out.printf("%s %d\n" ,miMensaje2, calificacion);   
         }
         //Segundo condicional
         if (calificacion2 >= 85){
            //Metodo importanto mensaje desde otro paquete
            System.out.printf("%s %d\n" ,miMensaje, calificacion2);
    } else {
          //En caso contrario mostrar este mensaje
             System.out.printf("%s %d\n" ,miMensaje2, calificacion2);   
         } 
    }
}
