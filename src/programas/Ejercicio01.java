package programas;

import java.util.Scanner;

public class Ejercicio01 {
    
    public static void main(String[] args) {
        
        //Declarar variable
        int f, c;
        double venta, sumaVentas;
        //Matriz
        double [][] mVentas = new double[4][4];        
        //Objeto
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        for (f = 0; f < mVentas.length; f++) {
            for(c = 0; c < mVentas[0].length; c++) {
                System.out.print("Ingresar sueldo: ");
                venta = lectura.nextInt();
                mVentas[f][c] = venta;
            }
        }
        
        sumaVentas = 0.0;
        
        for (f = 0; f < mVentas.length; f++) {
            for(c = 0; c < mVentas[0].length; c++) {
                sumaVentas+=mVentas[f][c];
            }
        }
        
        //Salida de datos
        System.out.println("La suma de las ventas es: " + sumaVentas);
    }
}