package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        String palabra, anagrama, intento;
        boolean encontrado = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intoduzca una palabra o frase");
        palabra = sc.nextLine();
        char[] tabla = new char[palabra.length()];
        int[] indice = new int[tabla.length];
        for (int i = 0; i < indice.length; i++) {
            indice[i] = (int) (Math.random()*palabra.length());
            for (int j = 0; j < indice.length; j++) {
                if (indice[i] == indice[j])
                    encontrado = true;
            }
            if (encontrado == false)
            tabla[i] = palabra.charAt(indice[i]);
        }
        anagrama = String.valueOf(tabla);
        System.out.println("El anagrama de la palabra o frase original es " + anagrama);
        System.out.println("¿Cuál es la palabra o frase original?");
        intento = sc.nextLine();
        if (intento.equals(palabra))
            System.out.println("Enhorabuena, ha acertado");
        else
            System.out.println("Ha fallado, lo siento");
    }
}
