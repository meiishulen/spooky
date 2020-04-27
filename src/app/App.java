package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);
    public static Spookify SpookifyService;

    public static void main(String[] args) throws Exception {
        // Opciones a Ingresar
        //1. Crear un Artista
        //2. Crear un Album
        //3. Crear una cancion
        //4. Reproducir Cancion
        // 5. listar canciones

        int opcion;
        opcion = elegirOpcion();
        switch (opcion) {
            case 1:
                crearArtista();

                break;

            case 2:
                crearAlbum();

                break;

            case 3:
                crearCancion();

                break;

            case 4:
                reproducirCancion();

                break;

            case 5:
                listarCanciones();

            default:
                break;
        }
         
    }

     public static int elegirOpcion() {

        System.out.println("*******************");
        System.out.println(" 1 Crear Artista ");
        System.out.println(" 2 Crear Album");
        System.out.println(" 3 Crear Cancion");
        System.out.println(" 4 Repoducir Cancion");
        System.out.println(" 5 Listar Canciones");
        System.out.println("********************");

        int opcion;
        opcion = Teclado.nextInt();
        Teclado.nextLine();
        return opcion;      

    }

    public static void crearArtista(){
    }

    public static void crearAlbum(){
    }

    public static void crearCancion(){

    }

    public static void reproducirCancion(){
    }

    public static void listarCanciones(){
    }

}