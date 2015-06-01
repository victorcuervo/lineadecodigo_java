package com.lineadecodigo.java.music;

/**
 * @file Reproductor.java
 * @version 1.0
 * @author Pablo Ruiz (http://lineadecodigo.com)
 * @date   23-abril-2010
 * @url    http://lineadecodigo.com/java/reproducir-musica-por-java/
 * @description Reproducir música por Java mediante las librerias de JavaZoom.  
 */


import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayer;

public class Reproductor {
    private BasicPlayer player;

    public Reproductor() {
        player = new BasicPlayer();
    }

    public void Play() throws Exception {
        player.play();
    }

    public void AbrirFichero(String ruta) throws Exception {
        player.open(new File(ruta));
    }

    public void Pausa() throws Exception {
        player.pause();
    }

    public void Continuar() throws Exception {
        player.resume();
    }

    public void Stop() throws Exception {
        player.stop();
    }

    public static void main(String args[]){
        try {
            Reproductor mi_reproductor = new Reproductor();
            mi_reproductor.AbrirFichero("c:/temp/cancion.mp3");
            mi_reproductor.Play();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}