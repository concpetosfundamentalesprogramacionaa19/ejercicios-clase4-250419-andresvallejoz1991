/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;
import java.util.Scanner; //Importar datos de Scanner
/**
 *
 * @author Salas
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        //Inicializar variables
        double tarifa = 3;
        double valorfinal;
        double mensajes;
        double aux;
        double iva;
        //Ingreso de mesajes por teclado
        System.out.println("Ingrese el numero de mensajes al mes");
        mensajes = sc.nextInt();
        
        if (mensajes == 40){
            valorfinal= tarifa;
            System.out.printf("El valor final mensual %f1" ,valorfinal);
        }else{
            if (mensajes>40 && mensajes<200){
                aux = mensajes-40;
                mensajes= aux*0.05;
                tarifa = tarifa+mensajes;
                iva = (tarifa*0.12);
                valorfinal = tarifa-iva;
                System.out.printf("El valor final mensual %f1" ,valorfinal);
            }else{
                if (mensajes<200){
                aux = mensajes - 200;
                mensajes = aux *0.10;
                tarifa = tarifa + mensajes;
                iva = (tarifa*0.12);
                valorfinal = tarifa- iva;
                System.out.printf("El valor final mensual %f1" ,valorfinal);                       
                }
            }
        }
      
    }
}
