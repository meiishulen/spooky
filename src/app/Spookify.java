package app;

import java.util.ArrayList;
import java.util.List;

public abstract class Spookify {

    private List<Artista> artistas = new ArrayList<>();

    private List<Album> albums = new ArrayList<>();

    public List<Artista>  getArtista(){
        return this.artistas;
    }
    
    public void setArtista( List<Artista> artistas){
        this.artistas= artistas;
    }

    public List<Album> getAlbum(){
        return this.albums;
    }
    public void setAlbum(List<Album> albums){
        this.albums= albums;
    }


}