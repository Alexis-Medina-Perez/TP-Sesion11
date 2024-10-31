package programas;

import java.util.Scanner;

public class Programa01 {
    
    public static void main(String[] args) {
        
        //Declarar variable
        int numero, sumaPares, cantImpares, resultadoPI, f, c;        
        //Matriz
        int [][] mNumeros = new int[3][3];        
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
        
        sumaPares = 0;
        cantImpares = 0;
        
        //Proceso de datos
        for (f = 0; f < mNumeros.length; f++) {
            for(c = 0; c < mNumeros[0].length; c++) {
                
                resultadoPI = mNumeros[f][c] % 2;
                
                if(resultadoPI == 0) {
                    sumaPares+=mNumeros[f][c];
                }else{
                    cantImpares++;
                }
                
            }
        }
        
        //Salida de datos
        System.out.println("La suma de los digitos pares es: " + sumaPares);
        System.out.println("La cantidad de digitos impares es: " + cantImpares);
    
    }
    
}
