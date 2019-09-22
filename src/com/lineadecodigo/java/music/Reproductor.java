package com.lineadecodigo.java.music;

/**
 * @file Reproductor.java
 * @version 2.0
 * @author Pablo Ruiz + Víctor Cuervo (http://lineadecodigo.com)
 * @date   01/junio/2015
 * @url    http://lineadecodigo.com/java/reproducir-musica-por-java/
 * @description v1.0 Reproducir música por Java mediante las librerias de JavaZoom.
 * 				v2.0 Adaptado  a la librería javazoom.jl
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Reproductor {
    private Player player;

    public Reproductor(String sCancion) throws FileNotFoundException, JavaLayerException {
        player = new Player(new FileInputStream(new File(sCancion)));
    }

    public void Play() throws Exception {
        player.play();
    }
    

    public static void main(String args[]){
        try {
        	System.out.println("Cargando el reproductor");
            Reproductor mi_reproductor = new Reproductor("c:/temp/cancion.mp3");
            System.out.println("Ejecutando canción");
            mi_reproductor.Play();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}