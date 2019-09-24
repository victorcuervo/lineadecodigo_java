package com.lineadecodigo.java.io;

/**
 * @file CopiarFicheros.java
 * @version 1.0
 * @author Chistian Portilla (http://lineadecodigo.com/author/xhrist14n/)
 * @date   5/enero/2013
 * @url    http://lineadecodigo.com/java/contar-las-vocales-de-un-fichero-en-java/
 * @description Programa que lee el número de vocales de un fichero
 */

import java.io.*;
import java.util.*;

public class ContarVocalesFichero {

    private String Filename="";
    private File file = null;
    private FileReader fr = null;
    private BufferedReader br = null;
    private List<String> lines = new ArrayList<String>();
    public void setFilename(String f){
        Filename=f;
    }
    public void openFile() {
        try {
            file = new File(Filename);
            fr = new FileReader(file);
            br = new BufferedReader(fr);
        } catch (Exception ex) {
        }
        return;
    }
    public void closeFile(){
        try {
            if(fr!=null) fr.close();
            br = null;
            file=null;
            System.gc();//llamada a garbage collector
        } catch (Exception ex) {
        }
    }
    public void readFile(){
        String line="";
        try {
            if(br==null){
                openFile();
            }
            if(br!=null){
               while((line=br.readLine())!=null) {
                   lines.add(line);
               }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {            
            closeFile();
        }
    }
    /**
     Conteo de vocales de una archivo
     **/
    public int countVowels(String filename) {
        int counter = 0;        
        try{
            setFilename(filename);
            openFile();
            readFile();
        }catch(Exception ex){}
        for(String charline:lines){
            counter+=counterVowelsPerLine(charline);
        }
        return counter;
    }
    /**
     Conteo de vocales por linea de texto
     **/
    public int counterVowelsPerLine(String line){
        int counter=0;
        char [] vowels={'a','e','i','o','u','A','E','I','O','U'};
        char [] charsLine=line.toCharArray();
        for(int i=0;i<charsLine.length;i++){
            for(int j=0;j<vowels.length;j++){
                if(charsLine[i]==vowels[j]){
                    counter++;
                }
            }            
        }
        return counter;
    }
	
	public static void main(String[] args) {
        ContarVocalesFichero contador=new ContarVocalesFichero();
        int counter=contador.countVowels("holamundo.txt");
        System.out.println("El fichero tiene "+counter+" vocales");
	}

}
