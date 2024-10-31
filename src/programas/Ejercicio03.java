package programas;

import java.util.Scanner;

public class Ejercicio03 {
    
    public static void main(String[] args) {
        
        //Declarar variable
        int f, c;
        double venta, VentaMayor, VentaMenor;
        //Matriz
        double [][] mVentas = new double[4][4];        
        //Objeto
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        for (f = 0; f < mVentas.length; f++) {
            for(c = 0; c < mVentas[0].length; c++) {
                do {                    
                    System.out.print("Ingresar sueldo: ");
                    venta = lectura.nextInt();
                    if (venta < 10 || venta > 5000) {
                        System.out.println("Error: La venta debe estar entre 10 y 5000. Intenta de nuevo.");
                    }
                } while (venta < 10 || venta > 5000);
                mVentas[f][c] = venta;
            }
        }
        
        VentaMayor = Integer.MIN_VALUE;
        VentaMenor = Integer.MAX_VALUE;
        
        for (f = 0; f < mVentas.length; f++) {
            for(c = 0; c < mVentas[0].length; c++) {
                if (mVentas[f][c] > VentaMayor) {
                    VentaMayor = mVentas[f][c];
                }
                if (mVentas[f][c] < VentaMenor) {
                    VentaMenor = mVentas[f][c];
                }
            }
        }
        
        //Salida de datos
        System.out.println("La venta mayor es: " + VentaMayor);
        System.out.println("La venta menor es: " + VentaMenor);
    }
}