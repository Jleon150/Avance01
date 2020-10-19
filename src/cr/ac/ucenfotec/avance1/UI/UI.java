package cr.ac.ucenfotec.avance1.UI;

import java.io.PrintStream;
import java.util.Scanner;

public class UI {
    private static PrintStream output = new PrintStream(System.out);
    private static Scanner input = new Scanner(System.in);

    public void mostrarMenu(){
        System.out.println("Elija una opcion:");
        output.println("1. Crear una cuenta");
        output.println("2. Registrar artistas, generos, compositores");
        output.println("3. Crear lista de reproduccion");
        output.println("4. Registrar Canciones");
        output.println("5. Crear Album");
        output.println("6. Reproducir Musica");
        output.println("7. Salir");
    }
    public int leeropcion(){
        output.println("Su opcion es: ");
     return input.nextInt();
    }

    public void imprimirMensaje(String mensaje) {
        output.println(mensaje);
    }

    public String leerTexto() {
        return input.next();
    }

}


