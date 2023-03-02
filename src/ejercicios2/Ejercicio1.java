package ejercicios2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String frase, sentencia = "";
        int inicio = 0, fin = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una sentencia en C");
        frase = sc.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            fin = frase.indexOf("/*", i) -1;
            if (fin!=-2){
                sentencia += frase.substring(inicio, fin);
            }
            if (frase.indexOf("*/", i) != -1){
                inicio = frase.indexOf("*/", inicio) +2;
                i = inicio-1;
            }
        }
        System.out.println(sentencia);
    }
}
