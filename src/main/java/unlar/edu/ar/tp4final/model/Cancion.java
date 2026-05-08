package unlar.edu.ar.tp4final.model;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;
//import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
//@AllArgsConstructor

public class Cancion {
    private String UIID;
    private String titulo;
    private String artista;
    private String album;
    private genero genero;
    private int duracionSegundos;
    private AtomicInteger reproducciones;
    private double rating;
    private LocalDate fechaLanzamiento;

    public enum genero{
        POP, ROCK, JAZZ, CLASICA, ELECTRONICA,
    }
    public Cancion(String titulo, String artista, String album, genero genero, int duracionSegundos, LocalDate fechaLanzamiento) {
        this.UIID = UUID.randomUUID().toString();
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.genero = genero;
        this.duracionSegundos = duracionSegundos;
        this.reproducciones = new AtomicInteger(0);
        this.rating = 0.0;
        this.fechaLanzamiento = fechaLanzamiento;
    }
    public void reproducir() {
        reproducciones.incrementAndGet();
    }



}
