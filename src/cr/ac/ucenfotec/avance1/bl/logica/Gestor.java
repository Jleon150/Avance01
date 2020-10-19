package cr.ac.ucenfotec.avance1.bl.logica;

import cr.ac.ucenfotec.avance1.bl.entidades.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Gestor {
    private static Scanner input = new Scanner(System.in);
    private static PrintStream output = new PrintStream(System.out);
    private ArrayList<Cancion> canciones= new ArrayList<>(100);;
    private ArrayList<UsuarioFinal> usuarios = new ArrayList<>(10);
    private ArrayList<Artista> artistas = new ArrayList<>(50);
    private ArrayList<Compositor> compositores = new ArrayList<>(50);
    private ArrayList<Genero> generos = new ArrayList<>(50);
    public ArrayList<ListaReproduccion> listarepro = new ArrayList<>(100);
    public ArrayList songs = new ArrayList<>();
    public Gestor(ArrayList<UsuarioFinal> usuarios) {
        this.usuarios = usuarios;
    }
    public String nombrelistas="";

    public Gestor() {

    }

    public void agregarUsuarios(String avatar, String username, String nombre, String apellido1, String apellido2,
                                String password, String email, int edad, String pais, String idenficacion){

        UsuarioFinal nuevo = new UsuarioFinal(avatar,nombre,username,apellido1,apellido2,password,email,edad,pais,idenficacion);

        usuarios.add(nuevo);

    }
    public UsuarioFinal encontrarUsuario(String username){
        for (int i = 0; i<usuarios.size() ; i++) {
            UsuarioFinal temp = usuarios.get(i);
            if(Objects.equals(temp.getClass(), username)){
                return temp;
            }
        }
        return null;
    }
    public ArrayList<UsuarioFinal> listarUsuarios() {
        return this.usuarios;
    }

    public void registroArtistas(String nombre, String apellido, String nombreArtistico,
                                 String fechaNacimiento, String fechaDefuncion, String pais, String genero, String descripcion, int edad){
        Artista nuevoArtista = new Artista( nombre,  apellido,  nombreArtistico,
                 fechaNacimiento,  fechaDefuncion,  pais,  genero,  descripcion,  edad);
        artistas.add(nuevoArtista);
    }

    public ArrayList<Artista> listarArtistas() {
        return this.artistas;
    }

    public void registroCompositor(String nombre, String apellido, String pais, int edad, String genero){
        Compositor nuevoCompositor = new Compositor(nombre, apellido,pais,edad,genero);
        compositores.add(nuevoCompositor);

    }
    public ArrayList<Compositor> listarCompositores(){
        return this.compositores;
    }
    public void registarGenero(String nombre, String descripcion){
        Genero nuevoGenero = new Genero(nombre,descripcion);
        generos.add(nuevoGenero);
    }

    public ArrayList<Genero> listarGeneros() {
        return this.generos;
    }
    public void registrarCancion(String nombre, String genero, String artista,
                                 String compositor, String lazamiento, String album){

        Cancion nuevaCancion = new Cancion(nombre,genero,artista,compositor,lazamiento,album);
        canciones.add(nuevaCancion);

        System.out.println("Desea agregar esta cacion a una lista 1:Si - 2:No" );
        int opcion = input.nextInt();

          if(opcion ==1){

                    int numLista = 0;
                    System.out.println("Mostrando listas agregadas ");

                    for (int i = 0; i < listarepro.size(); i++) {
                        System.out.println(i + "--->" + listarepro.get(i).getNombreLista());
                    }
                    System.out.println("Seleccione un numero de la lista ");
                    numLista = input.nextInt();

                    agregarCancionListas(numLista, nuevaCancion);

                    System.out.println("Cancion agregada ");

            }


    }
    public ArrayList<Cancion> listarCanciones() {
        return this.canciones;
    }

     public ArrayList<ListaReproduccion> listarepro(){
        return this.listarepro;
     }

    public void crearlistasrepro(String nombreLista, String fechaCreacionLista) {

            ListaReproduccion nuevaLista = new ListaReproduccion(nombreLista,fechaCreacionLista);
            listarepro.add(nuevaLista);



    }
   // private void agregarCancionLista(String nombreLista, String fechaCreacionLista, Cancion cancion1) {

    //}
    public void listaMasEscuchada(){

    }

    private void agregarCancionListas(int numLista, Cancion nuevaCancion) {
        listarepro.get(numLista).agregarCancionEnListaRepro(nuevaCancion);

    }




}



