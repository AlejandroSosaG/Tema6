package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        String palabra, anagrama = "", intento;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intoduzca una palabra o frase");
        palabra = sc.nextLine();
        for (int i = 0; i < palabra.length(); i++) {

        }
        System.out.println("El anagrama de la palabra o frase original es " + anagrama);
        System.out.println("¿Cuál es la palabra o frase original?");
        intento = sc.nextLine();
        if (intento.equals(palabra))
            System.out.println("Enhorabuena, ha acertado");
        else
            System.out.println("Ha fallado, lo siento");
    }
}
