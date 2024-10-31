package programas;

import java.util.Scanner;

public class Programa02 {
    
    public static void main(String[] args) {
        
        //Declarar variable
        int numero, f, c, cantElemMatriz;
        double promedioNum, sumaNum = 0.0;
        //Matriz
        int [][] mNumeros = new int[3][4];        
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
        
        //Proceso de datos
        for (f = 0; f < mNumeros.length; f++) {
            for(c = 0; c < mNumeros[0].length; c++) {
                sumaNum+=mNumeros[f][c];
            }
        }
        
        cantElemMatriz = mNumeros.length * mNumeros[0].length;
        promedioNum = sumaNum / cantElemMatriz;
        
        //Salida de datos
        System.out.println("La suma de los elementos es: " + sumaNum);
        System.out.println("El promedio de los elementos es: " + promedioNum);
    
    }
    
}
