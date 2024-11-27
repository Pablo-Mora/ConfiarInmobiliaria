import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear instancias de las clases
        inmobiliaria inmobiliaria = new inmobiliaria();
        client client = new client(12345, "Inmobiliaria Central", "Compra y venta de propiedades", 1, "Juan Pérez", "Cliente frecuente");
        propieties.Propieties propiedad = new propieties().new Propieties(12345, "Inmobiliaria Central", "Descripción general", 101, "Calle 123", "Propiedad en el centro");

        boolean salir = false;

        while (!salir) {
            // Menú interactivo
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Buscar propiedad como cliente");
            System.out.println("2. Agregar nueva propiedad (secretaria)");
            System.out.println("3. Mostrar información del cliente");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Buscar propiedad ---");
                    client.buscarPropiedad();
                    break;

                case 2:
                    System.out.println("\n--- Agregar nueva propiedad ---");
                    System.out.println("Digita el código de la propiedad:");
                    int code = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digita la dirección de la propiedad:");
                    String direccion = sc.nextLine();
                    System.out.println("Digita la descripción de la propiedad:");
                    String descripcion = sc.nextLine();

                    // Crear una nueva propiedad (simulación)
                    propieties.Propieties nuevaPropiedad = new propieties().new Propieties(12345, "Inmobiliaria Central", "Descripción general", code, direccion, descripcion);
                    System.out.println("Propiedad agregada exitosamente.");
                    break;

                case 3:
                    System.out.println("\n--- Información del Cliente ---");
                    System.out.println("ID Cliente: " + client.idClient);
                    System.out.println("Nombre: " + client.nameClient);
                    System.out.println("Descripción: " + client.descriptionClient);
                    break;

                case 4:
                    System.out.println("Saliendo del sistema. ¡Gracias!");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
        sc.close();
    }
}