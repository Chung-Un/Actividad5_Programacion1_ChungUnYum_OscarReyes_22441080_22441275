/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad5_ventas;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Actividad5_Ventas {

    
    public static void main(String[] args) {
        int numeroVentas=0, suma=0; //definicion de variables
        
        Scanner entrada = new Scanner (System.in); //establecimiento de scanner para ingreso de datos
        
        System.out.println("Ingrese el numero de ventas: ");
        numeroVentas = entrada.nextInt(); //establece el numero de ventas dado por el usuario
        
        int[] ventasInd = new int[numeroVentas]; //el numero de ventas es la cantidad de varibles en el arreglo
        
        for(int i=0; i<numeroVentas; i++){
            System.out.println("Ingrese el precio de la venta " + (i+1));
            ventasInd[i] = entrada.nextInt(); //se establece el precio a la posicion correspondiente del arreglo
            
            suma = suma + ventasInd[i]; //suma
        
        }
        System.out.println("Su total es Lps." + suma +" por " + numeroVentas + " ventas"); //resultado
        
    }
    
}
