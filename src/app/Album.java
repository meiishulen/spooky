package app;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String nombre;

    private int anio;

    private Artista artista;

    private List <Cancion> canciones= new ArrayList<>();

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getAnio(){
        return this.anio;
    }

    public void setAnio(int anio){
         this.anio = anio;
    }

    public Artista getArtista(){
        return this.artista;
    }
    public void setArtista( Artista artista){
        this.artista = artista;
    }

    public List<Cancion > getCancionList(){
        return this.canciones;

    }
    public void setCancion( List <Cancion> canciones){
         this.canciones= canciones;
    }
}
