/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spplarragast2.pkg2;
import java.util.Scanner;
/**
 *
 * @author AALS
 */
public class SPPLarragaST22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Alfredo Alejandro Lárraga Sosa A01410278 LMC
       
        
        System.out.println("Introduzca sus valores");
        op();
            
    }
static int data(String valor){
    Scanner kb = new Scanner (System.in);
    
    System.out.print("Itroduce " + valor + ": ");
    int datos = kb.nextInt();
    
    return datos;
}  
static void div(int valor){
    if ((valor%2)==0){
        System.out.println(valor+" su número par");
    } if ((valor%3)==0){
          System.out.println(valor+" su número es divisible entre 3");
        } if ((valor%5)==0) {
            System.out.println(valor+" es un número divisible entre 5");
            } else {}
}
static void op(){
    int valinf = data("un valor inferior");
    int valsup = data("un valor superior");
    int count = valinf - 1;
    System.out.println("Tus valores entre "+valinf+" y "+valsup+" son estos: ");
    while (count < valsup){
        System.out.println(count=count+1);
    }System.out.println("");
    div(valinf);
    div(valsup);
    
}

}
                
    
    

