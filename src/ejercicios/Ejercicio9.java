package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q','r', 's', 't', 'u', 'v'};
        char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        char letra;
        String frase = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduza una letra");
            letra = sc.next().charAt(0);
            letra = codifica(conjunto1, conjunto2, letra);
            if (letra != '.')
            frase += letra;
        }while (letra !='.');
        System.out.println(frase);
        sc.close();
    }
    public static char codifica(char[] conj1, char[] conj2, char c){
        char codigo = '.';
        for (int i = 0; i < conj1.length; i++) {
            if (conj1[i] == c){
                codigo = conj2[i];
            }
        }
        return codigo;
    }
}
