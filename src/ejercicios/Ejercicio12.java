package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        String palabra1;
        String palabra2;
        int cont1 = 0, cont2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca dos palabras");
        palabra1 = sc.nextLine();
        palabra2 = sc.nextLine();
        if (palabra1.length()==palabra2.length()){
            for (int i = 0; i < palabra1.length(); i++) {
                for (int j = 0; j < palabra2.length(); j++) {
                    if (palabra1.charAt(i)==palabra2.charAt(j))
                        cont1++;
                }
            }
            if (cont1==cont2 && cont1==palabra1.length())
                System.out.println("Las palabras son anagramas");
            else
                System.out.println("Las palabras no son anagramas");
        }else
            System.out.println("Las palabras no son anagramas");
        sc.close();
    }
}
