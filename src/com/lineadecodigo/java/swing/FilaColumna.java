package com.lineadecodigo.java.swing;

/**
 * @file FilaColumna.java
 * @version 1.0
 * @author Víctor Cuervo (http://lineadecodigo.com)
 * @date   23/septiembre/2015
 * @url    http://lineadecodigo.com/java/fila-y-columna-del-jtextarea/
 * @description Programa que controla la fila y columna en la que se encuentra un cursor en el JTextArea
 */

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class FilaColumna extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTextArea editor;
    private JTextField status;
    
    public FilaColumna() {
        
    	setTitle("Columna y Fila en un TextArea");
        setSize(500,500);

        // Inicializamos el Layout
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        editor = new JTextArea();

        // Añadimos el Listener para guardar la posición
        
        editor.addCaretListener(new CaretListener() {
            
        	public void caretUpdate(CaretEvent e) {
                JTextArea editArea = (JTextArea)e.getSource();

                // Valores iniciales de la línea y columna
                int linea = 1;
                int columna = 1;

                try {
                	int caretpos = editArea.getCaretPosition();
  
                    linea= editArea.getLineOfOffset(caretpos);
  
                    columna = caretpos - editArea.getLineStartOffset(linea);
                    
                    // Ya que las líneas las cuenta desde la 0
                    linea += 1;
                }
                catch(Exception ex) { }

                // Actualizamos el estado
                actualizarEstado(linea, columna);
            }
        });

        // Añadimos los campos al Layout
        add(editor, BorderLayout.CENTER);

        status = new JTextField();
        add(status, BorderLayout.SOUTH);

        // Inicializamos a 1,1
        actualizarEstado(1,1);
    }

    // Método para actualizar el estado
    private void actualizarEstado(int linea, int columna) {
        status.setText("Linea: " + linea + " Columna: " + columna);
    }

    public static void main(String args[]) {
        FilaColumna app = new FilaColumna();
        app.setVisible(true);
    }
	
	
}
