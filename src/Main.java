import models.Usuario;
import services.GimnasioService;
import utils.Menu;
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        GimnasioService service = new GimnasioService();
        int opcion;
        do {
            opcion = menu.mostrarMenu();
            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Nombre completo: ");
                        String nombre = menu.getScanner().nextLine();
                        if (!nombre.isEmpty()) {
                            String[] partes = nombre.split(" ");
                            String nombreFormateado = "";

                            for (String parte : partes) {
                                if (!parte.isEmpty()) {
                                    nombreFormateado += parte.substring(0, 1).toUpperCase() +
                                            parte.substring(1).toLowerCase() + " ";
                                }
                            }
                            nombre = nombreFormateado.trim();
                        }

                        System.out.print("Edad: ");
                        int edad = Integer.parseInt(menu.getScanner().nextLine());

                        System.out.print("Peso en kilogramos: ");
                        double peso = Double.parseDouble(menu.getScanner().nextLine());

                        Usuario u = new Usuario(nombre, edad, peso);
                        service.agregarUsuario(u);

                        System.out.println("Usuario agregado correctamente");

                    } catch (Exception e) {
                        System.out.println("Error: ingresa datos válidos");
                    }
                    break;

                case 2:
                    service.listaUsuarios();
                    break;

                case 3:
                    if (!service.hayUsuarios()) {
                        System.out.println("No hay usuarios registrados");
                        break;
                    }
                    System.out.println("\n--- Lista de usuarios ---");
                    service.listaUsuarios();

                    try {
                        System.out.print("Ingrese número de usuario a eliminar: ");
                        int index = Integer.parseInt(menu.getScanner().nextLine());

                        boolean eliminado = service.eliminarUsuario(index);

                        if (eliminado) {
                            System.out.println("Usuario eliminado");
                        } else {
                            System.out.println("Índice inválido");
                        }

                    } catch (Exception e) {
                        System.out.println("Error: ingresa un número válido");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);
    }
}