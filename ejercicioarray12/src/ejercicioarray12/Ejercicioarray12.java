/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarray12;
import java.util.Scanner;

/**
 *
 * Leer por teclado una tabla de 10 elementos numericos enteros y una posicion entre 0 y 9
 * Eliminar el elmento situado en la posición situada sin dejar huecos
 */
public class Ejercicioarray12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
       int array[] = new int [10];
        Scanner entrada = new Scanner(System.in);
        int pos;
        System.out.println("Llenar el arreglo.");
        for(int i=0;i<10;i++)                               // se guardan 10 elementos
        {
            System.out.print(i+".Digite un numero");
            array[i] = entrada.nextInt();
        }
        //hasta aquí todo normal
        do
        {
            System.out.print("Ingrese la posicion a eliminar: ");
            pos = entrada.nextInt();
            if(pos < 0 || pos > 9)
            {
                System.out.println("La posicion no es valida, intentelo de nuevo.");
            }
        }
        while(pos < 0 || pos > 9); //esto se repetira hasta que la posicion sea entre 0 y 9
        
        for(int i=pos;i<9;i++)
        {
            array[i] = array[i+1];
        }                          //crece la posicion en 1 desde la posicion indicada
        
        System.out.print("\nEl nuevo arreglo es: ");
        for(int i=0;i<9;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
        
      }   
    
    

