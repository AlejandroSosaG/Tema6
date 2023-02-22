package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        String frase;
        char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] cont = new int[27];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        frase = sc.nextLine();
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < frase.length(); j++) {
                if (frase.charAt(j)==letras[i])
                    cont[i]++;
            }
            if (cont[i]>0)
            System.out.println(letras[i] + ": " + cont[i] + " veces");
        }
        sc.close();
    }
}
