/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package applicationprintcatch;

/**
 *
 * @author ******
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Producto producto = new Producto();
        int opcion;

        do {
            System.out.print("*******");
            System.out.println("Menu de opciones:");
            System.out.println("1. Crear un nuevo producto");
            System.out.println("2. Imprimir informacion del producto");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    scanner.nextLine();  // Limpiar el buffer
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese la cantidad del producto: ");
                    int cantidad = scanner.nextInt();

                    producto = new Producto(nombre, precio, cantidad);
                    System.out.println("Producto creado con éxito!");
                    break;
                case 2:
                    System.out.println("Información del producto:");
                    System.out.println(producto);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }
}

