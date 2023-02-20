package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String contraseña;
        String intento;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduzca la contraseña");
            contraseña = sc.nextLine();
            System.out.println("¿Cuál es la contraseña?");
            intento = sc.nextLine();
            if (intento.equals(contraseña)!=true){
                if (intento.compareTo(contraseña)<0)
                    System.out.println("La contraseña es mayor alfabéticamente");
                else
                    System.out.println("La contraseña es menor alfabéticamente");
            }
        }while (intento.equals(contraseña)!=true);
        System.out.println("La contraseña es correcta");
        sc.close();
    }
}
