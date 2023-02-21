package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        String palabra1;
        String palabra2;
        int cont1 = 0, cont2 = 0;
        char[] pal1, pal2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca dos palabras");
        palabra1 = sc.nextLine();
        palabra2 = sc.nextLine();
        pal1 = palabra1.toCharArray();
        pal2 = palabra2.toCharArray();
        if (pal1.length==pal2.length){
            for (int i = 0; i < pal1.length; i++) {
                for (int j = 0; j < pal2.length; j++) {
                    if (pal1[i]==pal2[j])
                        cont1++;
                    if (pal2[i]==pal1[j])
                        cont2++;
                }
            }
            if (cont1==cont2 && cont1==palabra1.length())
                System.out.println("Las palabras son anagramas");
        }else
            System.out.println("Las palabras no son anagramas");
        sc.close();
    }
}
