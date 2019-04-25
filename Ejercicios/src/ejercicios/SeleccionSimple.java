/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
import paquetedos.Operacion;
/**
 *
 * @author Salas
 */
public class SeleccionSimple {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Documentación
        Scanner sc = new Scanner (System.in);
        //Inicializacion de variables
        int calificacion;
        int calificacion2;
        String miMensaje = Operacion.mensaje;
        //Ingreso por teclado nota 1
        System.out.println("Ingrese la calificacion 1");
        calificacion = sc.nextInt();
        // Ingreso por teclado de nota 2
        System.out.println("Ingrese la calificacion 2");
        calificacion2 = sc.nextInt();
        //Condicional para calificacion 1
        if (calificacion >= 85){
            //Metodod por mensajes desde el mismo paquete
            //System.out.printf("Usted está aprobado con %d\n" , calificacion);
            //Metodo importanto mensaje desde otro paquete
            System.out.printf("%s %d\n" ,miMensaje, calificacion);
    }
        if (calificacion2 >= 85){
            //Metodod por mensajes desde el mismo paquete
            //System.out.printf("Usted está aprobado con %d\n" , calificacion2);
             //Metodo importanto mensaje desde otro paquete
            System.out.printf("%s %d\n" ,miMensaje, calificacion2);
        }
    
}
}
