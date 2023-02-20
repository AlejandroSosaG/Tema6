package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        String frase;
        String palabra;
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        frase = sc.nextLine();
        System.out.println("Introduzca una palabra");
        palabra = sc.next();
        for (int i = 0; i < frase.length();) {
            if (frase.indexOf(palabra, i)!=-1){
                cont++;
                i = frase.indexOf(palabra, i) + 1;
            }else
                i++;
        }
        System.out.println("La frase tiene " + cont + " veces la palabra " + palabra);
        sc.close();
    }
}
