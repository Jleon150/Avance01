package cr.ac.ucenfotec.avance1.controlador;

import cr.ac.ucenfotec.avance1.UI.UI;
import cr.ac.ucenfotec.avance1.bl.entidades.*;
import cr.ac.ucenfotec.avance1.bl.logica.Gestor;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Controlador {
    private static PrintStream output = new PrintStream(System.out);
    private static Scanner input = new Scanner(System.in);
    private UI interfaz = new UI();
    private Gestor gestor = new Gestor();
    public String cancionLista;
    //public ArrayList songs = new ArrayList<>();
    private static String[] songs = new String[100];
    private static int nextPosicion = 0;
    private Object[] listas =new Object[2];
    public static String[] paises = {"Argentina", "Brasil", "Canada", "Chile","Holanda", "Costa-Rica", "Espanna", "USA", "Italia"
            , "Dinamarca", "Ecuador", "Colombia", "Francia", "Guatemala", "Jamaica", "México", "Uruguay", "Puerto-Rico"};

    public void ejecutarPrograma() {
        int opcion = 0;
        do {

            interfaz.mostrarMenu();
            opcion = interfaz.leeropcion();
            procesarOpcion(opcion);

        } while (opcion != 7);
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                //Crear una cuenta Usuario y Admin. To Do : Se necesia validar que siempre haya un admin para iniciar el sist.
                crearCuenta();
                interfaz.imprimirMensaje(" Digite cualquier tecla para continuar ");
                String L = interfaz.leerTexto();

                break;
            case 2:
                //Registrar artistas, generos, compositores
                    registros();
                interfaz.imprimirMensaje(" Digite cualquier tecla para continuar ");
                String x = interfaz.leerTexto();
                break;
            case 3:
                    //Crear lista de reproduccion
                crearListaRepro();
                interfaz.imprimirMensaje(" Digite cualquier tecla para continuar ");
                String a = interfaz.leerTexto();
                break;
            case 4:
                //Registrar Canciones y agregarla a una lista
                ingresarCancion();
                mostrarplaylist();
                interfaz.imprimirMensaje(" Digite cualquier tecla para continuar ");
                String y = interfaz.leerTexto();
                break;
            case 5:
               // Crear Album
                break;
            case 6:
               /* Reproducir Musica Formas:
                 buscando una canción específica y reproduciéndola
                 Creando una cola de reproducción, es decir, agregando canciones o álbumes enteros a la lista de canciones que desea escuchar.
                 Seleccionar una lista de reproducción específica.
               * */
                break;
            case 7:
                // Salir
                interfaz.imprimirMensaje("Ha salido del sistema");
                break;
            default:
                interfaz.imprimirMensaje("Opcion desconocida");
        }
    }


    private void crearCuenta() {
        interfaz.imprimirMensaje(" Haz seleccionado la opcion Crear cuenta ");
        interfaz.imprimirMensaje(" Elija una opcion \n 1: Crear cuenta Administrador \n 2 : Crear cuenta Usuario");
        int seleccion = input.nextInt();

        if (seleccion == 1) {

            interfaz.imprimirMensaje("Creando Administrador");
            interfaz.imprimirMensaje("Nombre");
            String nombre = interfaz.leerTexto();
            interfaz.imprimirMensaje("Primer Apellido");
            String apellido1 = interfaz.leerTexto();
            interfaz.imprimirMensaje("Segundo Apellido");
            String apellido2 = interfaz.leerTexto();
            interfaz.imprimirMensaje("Email");
            String email = interfaz.leerTexto();
            interfaz.imprimirMensaje("Cree una contrasena");
            String password = interfaz.leerTexto();
            interfaz.imprimirMensaje("Cree Username");
            String username = interfaz.leerTexto();
            interfaz.imprimirMensaje("Ingrese una imagen para su avatar");
            String avatar = interfaz.leerTexto();
            interfaz.imprimirMensaje("*************");
            Admin nuevo = new Admin(username, avatar, nombre, apellido1, apellido2, password, email);

        }if (seleccion == 2) {
            interfaz.imprimirMensaje("Creando Usuario");
            interfaz.imprimirMensaje("Nombre");
            String nombre = interfaz.leerTexto();
            interfaz.imprimirMensaje("Primer Apellido");
            String apellido1 = interfaz.leerTexto();
            interfaz.imprimirMensaje("Segundo Apellido");
            String apellido2 = interfaz.leerTexto();
            interfaz.imprimirMensaje("Edad");
            int edad = input.nextInt();
            if (edad>18) {
                interfaz.imprimirMensaje("Pais de nacimiento");
                String pais = interfaz.leerTexto();
                interfaz.imprimirMensaje("identificacion");
                String identificacion = interfaz.leerTexto();
                interfaz.imprimirMensaje("Email");
                String email = interfaz.leerTexto();
                interfaz.imprimirMensaje("Cree una contrasena");
                String password = interfaz.leerTexto();
                interfaz.imprimirMensaje("Cree Username");
                String username = interfaz.leerTexto();
                interfaz.imprimirMensaje("Ingrese una imagen para su avatar");
                String avatar = interfaz.leerTexto();
                gestor.agregarUsuarios(avatar, username, nombre, apellido1, apellido2, password, email, edad, pais, identificacion);

                interfaz.imprimirMensaje("Usuario creado");
            }else{
                interfaz.imprimirMensaje("Edad no permitida");
            }
        }
    }
public void encontrarUser(){
    interfaz.imprimirMensaje("Ingrese username que desea buscar");
    String username = interfaz.leerTexto();
    UsuarioFinal encontrado = gestor.encontrarUsuario(username);
    if (encontrado != null) {
        interfaz.imprimirMensaje("Si existe");
    } else {
        interfaz.imprimirMensaje("No existe");
    }
}
public void listarUsuarios(){
    ArrayList<UsuarioFinal> lista = gestor.listarUsuarios();
        interfaz.imprimirMensaje("Lista de Usuarios");
        for (int i = 0; i < lista.size(); i++) {
        interfaz.imprimirMensaje(lista.get(i).toString());
    }

}
    private void crearListaRepro() {
        interfaz.imprimirMensaje(" Haz seleccionado la opcion crear lista de reproduccion ");
        interfaz.imprimirMensaje("Nombre de la lista");
        String nombreLista = interfaz.leerTexto();
        interfaz.imprimirMensaje("Fecha de creacion de la Lista");
        String fechaCreacionLista= interfaz.leerTexto();
        gestor.crearlistasrepro(nombreLista,fechaCreacionLista);
        interfaz.imprimirMensaje(" Lista creada ");
    }
    private void ingresarCancion() {
        interfaz.imprimirMensaje(" Haz seleccionado la opcion agregar cancion ");
        interfaz.imprimirMensaje("Nombre");
        String nombreCancion = interfaz.leerTexto();
        interfaz.imprimirMensaje("Lista de artistas, géneros y compositores.");
        listarArtista();
        listarGenero();
        listarCompositor();
        interfaz.imprimirMensaje("Genero de la cancion");
        String generoCancion = interfaz.leerTexto();
        interfaz.imprimirMensaje("Artista");
        String artistaCancion = interfaz.leerTexto();
        interfaz.imprimirMensaje("Fecha de lazamiento");
        String lazamientoCancion = interfaz.leerTexto();
        interfaz.imprimirMensaje("Compositor");
        String compositorCancion = interfaz.leerTexto();
        interfaz.imprimirMensaje("Album al que pertenece");
        String albumcancion = interfaz.leerTexto();
        gestor.registrarCancion(nombreCancion,generoCancion,artistaCancion,compositorCancion,lazamientoCancion,albumcancion);
        interfaz.imprimirMensaje(" Cancion agregada ");


    }

public void registros(){
    interfaz.imprimirMensaje(" Haz seleccionado la opcion Registrar artistas, generos, compositores ");
    interfaz.imprimirMensaje(" Elija una opcion \n 1: Registrar artistas \n 2 : Registrar generos \n 3 : Registrar compositores ");
    int seleccion = input.nextInt();
    switch (seleccion){
        case 1:
            interfaz.imprimirMensaje("Registrando artista");
            interfaz.imprimirMensaje("Nombre");
          String nombre = interfaz.leerTexto();
            interfaz.imprimirMensaje("Apellido");
            String apellido = interfaz.leerTexto();
            interfaz.imprimirMensaje("Nombre Artistico");
             String nombreArtistico= interfaz.leerTexto();
            interfaz.imprimirMensaje("Fecha Nacimiento");
             String fechaNacimiento= interfaz.leerTexto();
            interfaz.imprimirMensaje("Ingresa la Fecha Defuncion o 'No' sino aplica");
             String fechaDefuncion= interfaz.leerTexto();
            interfaz.imprimirMensaje(" Ingrese el pais de Origen");
            interfaz.imprimirMensaje("Lista de paises ");
            interfaz.imprimirMensaje(Arrays.toString(paises));
             String pais= interfaz.leerTexto();
            interfaz.imprimirMensaje("Genero Musical");
             String genero= interfaz.leerTexto();
            interfaz.imprimirMensaje("Descripcion");
             String descripcion= interfaz.leerTexto();
            interfaz.imprimirMensaje("Edad");
             int edad= input.nextInt();
             gestor.registroArtistas(nombre,apellido,nombreArtistico,fechaNacimiento,fechaDefuncion,pais,genero,descripcion,edad);
            interfaz.imprimirMensaje(" Artista agregado");
            break;
        case 2:
            interfaz.imprimirMensaje("Registrando Generos");
            interfaz.imprimirMensaje("Nombre");
            String nombreGenero = interfaz.leerTexto();
            interfaz.imprimirMensaje("Descripcion");
            String descripcionGenero = interfaz.leerTexto();
            gestor.registarGenero(nombreGenero,descripcionGenero);
            interfaz.imprimirMensaje(" Genero agregado");

            break;
        case 3:
            interfaz.imprimirMensaje("Registrando Compositor");
            interfaz.imprimirMensaje("Nombre");
            String nombreCompositor= interfaz.leerTexto();
            interfaz.imprimirMensaje("Apellido");
            String apellidoCompositor = interfaz.leerTexto();
            interfaz.imprimirMensaje("Pais de origen");
            String paisCompositor= interfaz.leerTexto();
            interfaz.imprimirMensaje("Edad");
            int edadCompositor = input.nextInt();
            interfaz.imprimirMensaje("Genero al que pertenece");
            String generoCompositor = interfaz.leerTexto();
            gestor.registroCompositor(nombreCompositor,apellidoCompositor,paisCompositor,edadCompositor,generoCompositor);
            interfaz.imprimirMensaje(" Genero agregado");
            break;

        default:
            interfaz.imprimirMensaje("Opcion desconocida");

    }


}
    public void listarGenero () {
        ArrayList<Genero> lista = gestor.listarGeneros();
        interfaz.imprimirMensaje("Lista de Generos");
        for (int i = 0; i < lista.size(); i++) {
            interfaz.imprimirMensaje(lista.get(i).toString());
        }
    }
    public void listarArtista () {
        ArrayList<Artista> lista = gestor.listarArtistas();
        interfaz.imprimirMensaje("Lista de Artistas");
        for (int i = 0; i < lista.size(); i++) {
            interfaz.imprimirMensaje(lista.get(i).toString());
        }
    }
    public void listarCompositor () {
        ArrayList<Compositor> lista = gestor.listarCompositores();
        interfaz.imprimirMensaje("Lista de Compositores");
        for (int i = 0; i < lista.size(); i++) {
            interfaz.imprimirMensaje(lista.get(i).toString());
        }
    }

    public void listarCanciones () {
        ArrayList<Cancion> lista = gestor.listarCanciones();
        interfaz.imprimirMensaje("Lista de Canciones guardadas");
        for (int i = 0; i < lista.size(); i++) {
            interfaz.imprimirMensaje(lista.get(i).toString());
        }
    }
    public void mostrarplaylist () {
        ArrayList<ListaReproduccion> lista = gestor.listarepro();
        interfaz.imprimirMensaje("Listas de reproduccion");
        for (int i = 0; i < lista.size(); i++) {
            interfaz.imprimirMensaje(lista.get(i).toString());
        }
    }
}