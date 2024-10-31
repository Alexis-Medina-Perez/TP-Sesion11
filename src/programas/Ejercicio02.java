package programas;

import java.util.Scanner;

public class Ejercicio02 {
    
    public static void main(String[] args) {
        
        //Declarar variable
        int f, c, cantElemMatriz;
        double venta, totalCompras, promedioCompras;
        //Matriz
        double [][] mCompras = new double[4][4];        
        //Objeto
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        for (f = 0; f < mCompras.length; f++) {
            for(c = 0; c < mCompras[0].length; c++) {
                System.out.print("Ingresar compra: ");
                venta = lectura.nextInt();
                mCompras[f][c] = venta;
            }
        }
        
        totalCompras = 0.0;
        
        for (f = 0; f < mCompras.length; f++) {
            for(c = 0; c < mCompras[0].length; c++) {
                totalCompras+=mCompras[f][c];
            }
        }
        
        
        cantElemMatriz = mCompras.length * mCompras[0].length;
        promedioCompras = totalCompras / cantElemMatriz;
        
        //Salida de datos
        System.out.println("La suma de las compras es: " + totalCompras);
        System.out.println("El promedio de las compras es: " + promedioCompras);
    }
}

