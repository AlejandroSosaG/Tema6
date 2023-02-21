package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        String frase;
        String inversa = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        frase = sc.nextLine();
        for (int i = frase.length()-1; i >= 0; i--) {
            inversa += frase.charAt(i);
        }
        if (frase.equals(inversa) == true)
            System.out.println("La frase es palíndroma");
        else
            System.out.println("La frase no es palíndroma");
        sc.close();
    }
}
