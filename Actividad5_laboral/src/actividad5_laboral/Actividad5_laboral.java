/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad5_laboral;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Actividad5_laboral {

    
    public static void main(String[] args) {
        int diaUsuario;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite el numero correspondiente al dia que desea: \n1.Lunes\n2.Martes\n3.Miercoles\n4.Jueves\n5.Viernes\n6.Sabado\n7.Domingo");
        diaUsuario = entrada.nextInt();
        
         if (diaUsuario > 0 && 6 > diaUsuario){
         System.out.println("El dia seleccionado es un dia laboral");
         } 
        else { if(diaUsuario > 5 && 8 > diaUsuario){
                System.out.println("El dia seleccionado no es un dia laboral");
            } 
          
         else {
            System.out.print("Valor ingresado no es valido!!!");
            }
        }
        
        
    }
    
}
