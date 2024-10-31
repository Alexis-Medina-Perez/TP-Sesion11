package programas;

import java.util.Scanner;

public class Programa03 {
    
    public static void main(String[] args) {
        
        //Declarar variable
        int numero, f, c, numMayor, numMenor;
        //Matriz
        int [][] mNumeros = new int[4][4];        
        //Objeto
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        for (f = 0; f < mNumeros.length; f++) {
            for(c = 0; c < mNumeros[0].length; c++) {
                System.out.print("Ingresar numero: ");
                numero = lectura.nextInt();
                mNumeros[f][c] = numero;
            }
        }
        
        numMayor = 0;
        numMenor = 99;
        
        //Proceso de datos
        for (f = 0; f < mNumeros.length; f++) {
            for(c = 0; c < mNumeros[0].length; c++) {
                
                if(mNumeros[f][c] > numMayor) {
                    numMayor = mNumeros[f][c];
                }
                if(mNumeros[f][c] < numMenor) {
                    numMenor = mNumeros[f][c];
                }
            }
        }
        
        //Salida de datos
        System.out.println("El numero mayor es: " + numMayor);
        System.out.println("El numero menor es: " + numMenor);
    
    }
    
}
