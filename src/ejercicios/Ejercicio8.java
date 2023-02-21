package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        String frase;
        int pos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        frase = sc.nextLine();
        if (frase.startsWith("Javalín, javalón ")==true){
            System.out.println("La frase introducida está en el idioma de Javalandía");
            pos = frase.indexOf("javalín, javalón");
            System.out.println("El mensaje sin muletilla es " + frase.substring(pos+17).trim());
        } else if (frase.endsWith("javalén, len, len")) {
            System.out.println("La frase introducida está en el idioma de Javalandía");
            pos = frase.lastIndexOf("javalén, len, len");
            System.out.println("El mensaje sin muletilla es " + frase.substring(0, pos).trim());
        }else
            System.out.println("La frase introducida no está en el idioma de Javalandía");
        sc.close();
    }
}
