package programas;

import java.util.Scanner;

public class Programa04 {
    
    public static void main(String[] args) {
        
        //Declarar variable
        int f, c, cantElemMatriz;
        double sueldo, sumaSueldos, promedioSueldos;
        //Matriz
        double [][] mSueldos = new double[5][5];        
        //Objeto
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        for (f = 0; f < mSueldos.length; f++) {
            for(c = 0; c < mSueldos[0].length; c++) {
                do {                    
                    System.out.print("Ingresar sueldo: ");
                    sueldo = lectura.nextInt();
                    if (sueldo < 1025 || sueldo > 10000) {
                        System.out.println("Error: El sueldo debe estar entre 1025 y 10000. Intenta de nuevo.");
                    }
                } while (sueldo < 1025 || sueldo > 10000);
                mSueldos[f][c] = sueldo;
            }
        }
        
        sumaSueldos = 0.0;
        
        for (f = 0; f < mSueldos.length; f++) {
            for(c = 0; c < mSueldos[0].length; c++) {
                sumaSueldos+=mSueldos[f][c];
            }
        }
        
        cantElemMatriz = mSueldos.length * mSueldos[0].length;
        promedioSueldos = sumaSueldos / cantElemMatriz;
        
        //Salida de datos
        System.out.println("La suma de los sueldos es: " + sumaSueldos);
        System.out.println("El promedio de los sueldos es: " + promedioSueldos);
    }
}