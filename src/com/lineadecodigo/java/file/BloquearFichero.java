package com.lineadecodigo.java.file;

/**
 * @file BloquearFichero.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   16/septiembre/2012
 * @url    http://lineadecodigo.com/java/bloquear-un-fichero-con-java/
 * @description Bloquear el acceso a un fichero
 */

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

public class BloquearFichero {

	public static void main(String[] args) {
	 try {
		 
	    // Definimos el fichero y el canal a utilizar
	    File file = new File("test.txt");
	    FileChannel channel = new RandomAccessFile(file, "rw").getChannel();

	    // Bloqueamos el fichero
	    FileLock lock = channel.lock();

	    // Intentamos adquirir el bloqueo del fichero
	    try {
	        lock = channel.tryLock();
	    } catch (OverlappingFileLockException e) {
	      // Fichero ya bloqueado
	    }	    
	    
	    // Liberamos el bloqueo
	    lock.release();
	    channel.close();
	    
	} catch (Exception e) {
	}

	}

}
