package ejercicio5;

import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
        double suma,x,y;
        Scanner input = new Scanner(System.in);
        suma = 0;
        System.out.println("Ingrese el valor de x");
        x = input.nextDouble();
        suma = suma + x;
        y = 40;
        x = x + Math.pow(y,2);
        suma = suma + x/y;
        System.out.println("El valor de la suma es: "+suma);
    }
    
}
