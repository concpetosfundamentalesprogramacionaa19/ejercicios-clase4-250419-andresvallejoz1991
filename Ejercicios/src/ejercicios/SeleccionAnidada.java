/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner; //Importar datos de Scanner
import paquetedos.Operacion2; //Importar mensajes del paquete Operacion
import static paquetedos.Operacion2.Mensaje1;
import static paquetedos.Operacion2.Mensaje2;
import static paquetedos.Operacion2.expresion1;
import static paquetedos.Operacion2.expresion2;
import static paquetedos.Operacion2.expresion3;
/**
 *
 * @author Andres Vallejo
 */
public class SeleccionAnidada {
      public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Inicializar variable
        int calificacion;
        //Variable de aprobacion
        String Mensaje = Operacion2.Mensaje1;
        //Variable de reprobado
        String mensaje2 = Operacion2. Mensaje2;
        //Variable Excelente
        String exp1 = Operacion2.expresion1;
        //Variable Muy Buena
        String exp2 = Operacion2.expresion2;
        //Variable Regular
        String exp3 = Operacion2.expresion3;
        //Ingreso por teclado de la calificacion
        System.out.println("Ingrese la calificacion");
        calificacion =sc.nextInt();
        //Condicional Calificacion Excelente
        if (calificacion >=90){
            System.out.printf("%s %s %d\n" ,Mensaje1, expresion1, calificacion);
        }else{
            //Condicional Calificacion Muy buena
            if (calificacion<90 && calificacion>=80){
            System.out.printf("%s %s %d\n" ,Mensaje1, expresion2, calificacion);    
            }else{
                //Condicional Calificacion Regular
                if (calificacion<80 && calificacion>=50){
            System.out.printf("%s %s %d\n" ,Mensaje1, expresion3, calificacion);
                }else{
                    //Mensaje de Reprobado
            System.out.printf("%s %d\n" ,Mensaje2, calificacion);        
                }
            }
        }
      }
}
