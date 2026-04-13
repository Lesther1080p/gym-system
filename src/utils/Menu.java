package utils;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== GYM SYSTEM ===");
        System.out.println("1. Agregar usuario");
        System.out.println("2. Ver usuarios");
        System.out.println("3. Eliminar usuario");
        System.out.println("4. Salir");
        System.out.print("Opción: ");

        return Integer.parseInt(scanner.nextLine());
    }

    public Scanner getScanner() {
        return scanner;
    }
}
