package ejercicios2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String frase, camel = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        frase = sc.nextLine();
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' '){
                camel += Character.toUpperCase(frase.charAt(i+1));
                i++;
            }else
                camel += frase.charAt(i);
        }
        System.out.println(camel);
    }
}
