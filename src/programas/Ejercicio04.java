package programas;

import java.util.Scanner;

public class Ejercicio04 {
    
    public static void main(String[] args) {
        
        //Declarar variable
        int f, c, cantElemMatriz;
        double venta, totalVentas, promedioVentas;
        //Matriz
        double [][] mVentas = new double[3][3];        
        //Objeto
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        for (f = 0; f < mVentas.length; f++) {
            for(c = 0; c < mVentas[0].length; c++) {
                do {                    
                    System.out.print("Ingresar sueldo: ");
                    venta = lectura.nextInt();
                    if (venta < 1000 || venta > 10000) {
                        System.out.println("Error: La venta debe estar entre 1000 y 10000. Intenta de nuevo.");
                    }
                } while (venta < 1000 || venta > 10000);
                mVentas[f][c] = venta;
            }
        }
        
        totalVentas = 0.0;
        
        for (f = 0; f < mVentas.length; f++) {
            for(c = 0; c < mVentas[0].length; c++) {
                totalVentas+=mVentas[f][c];
            }
        }
        
        cantElemMatriz = mVentas.length * mVentas[0].length;
        promedioVentas = totalVentas / cantElemMatriz;
        
        //Salida de datos
        System.out.println("El total de las ventas es: " + totalVentas);
        System.out.println("El promedio de las ventas es: " + promedioVentas);
    }
}