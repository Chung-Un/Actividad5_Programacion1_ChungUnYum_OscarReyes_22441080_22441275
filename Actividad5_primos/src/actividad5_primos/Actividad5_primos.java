/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad5_primos;

/**
 *
 * @author chung
 */
public class Actividad5_primos {

    public static void main(String[] args) {  
        
        System.out.print("Los numeros primos del 1 - 100 son: ");
        for (int j = 2; j <= 100; j++){//Aqui se establece cada numero de 1 - 100
            int divisores = 0; 
            for(int i = 2; i < j; i++){ //aqui se buscan los divisores del numero, validando los numero que al dividirlos entre el aleatorio dan un residuo 0
                   if(j % i == 0){
                   divisores++;
                }
                
                }
                if (divisores == 0){ // Se imprimen los numeros validados como primos
                    System.out.println(j + " ");
            }
        }       
        
    }
    
}
