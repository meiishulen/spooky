package app;

public class Cancion  extends Contenido{

    private String nombre;
    private int duracion; //en segundos.
    private Album album;
    private Artista artista;
    private String letra;
     
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public int getDuracion(){
        return this.duracion;
    }
    public void setDuacion(int duracion){
        this.duracion = duracion;
    }
    public Album getAlbum(){
        return this.album;
    }
    public void setAlbum(Album album){
        this.album= album;
    }

    public Artista getArtista(){
        return this.artista;
    }

    public void setAtista( Artista artista){
        this.artista= artista;
    }

    public String getLetra(){
        return this.letra;
    }

    public void setLetra(String letra){
        this.letra=letra;
    }





}
