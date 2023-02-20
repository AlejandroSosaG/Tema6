package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String frase;
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        frase = sc.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==' ')
                cont++;
        }
        System.out.println("La frase tiene " + cont + " espacios en blanco");
        sc.close();
    }
}
