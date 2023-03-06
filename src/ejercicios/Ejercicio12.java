package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        String palabra1;
        String palabra2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca dos palabras");
        palabra1 = sc.nextLine();
        palabra2 = sc.nextLine();
        char[] pal1 = palabra1.toCharArray(), pal2 = palabra2.toCharArray();
        Arrays.sort(pal1);
        Arrays.sort(pal2);
        if (pal1.equals(pal2)){
            System.out.println("Las palabras son anagramas");
        }else
            System.out.println("Las palabras no son anagramas");
        sc.close();
    }
}
