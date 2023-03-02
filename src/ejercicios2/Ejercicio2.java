package ejercicios2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String titulo, contenido, html;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introsduzca el título de la página web");
        titulo = sc.nextLine();
        System.out.println("Introduzca el contenido de la página web");
        contenido = sc.nextLine();
        html = "<HTML>\n" +
                " <HEAD>\n" +
                "  <h1>" + titulo + " </h1>\n" +
                " </HEAD>\n" +
                " <BODY>\n" +
                "  <p>" + contenido + "</p>\n" +
                " </BODY>\n" +
                "</HTML>";
        System.out.println(html);
        sc.close();
    }
}
