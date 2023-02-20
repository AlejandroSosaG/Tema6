package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String frase1;
        String frase2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        frase1 = sc.nextLine();
        System.out.println("Introduzca otra frase");
        frase2 = sc.nextLine();
        if (frase1.length()==frase2.length()) {
            System.out.println("Las dos frases tienen la misma longitud");
        }else if (frase1.length()<frase2.length()) {
            System.out.println("La frase 2 es más larga que la 1");
        }else
            System.out.println("La frase 1 es más larga que la 2");
    }
}
