package com.lineadecodigo.java.swing.borrador;

import java.awt.AWTEvent;
import java.awt.FlowLayout;
import java.awt.event.AWTEventListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TeclaPulsada extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel etiqueta;
	
	TeclaPulsada(){
		super("Tipo Evento");
		getContentPane().setLayout(new FlowLayout());	
				
		etiqueta = new JLabel("Pulsa sobre las teclas o combinaciones de ellas");		
		add(etiqueta);
		
		
		/*
		 * 1 - básico de tecla pulsada
		 * 2 - que letra has pulsado
		 * 3 - keycode y las constantes
		 * 4 - control-c (con la mascara)
		 * 5 - escape para cerrar app
		 * 
		 */
		
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("Pulsaste una tecla");
				System.out.println(e.getKeyChar());
				// NO FUNCIONA- System.out.println(KeyEvent.getKeyText(e.getKeyCode()));
				
				
				
				
				
				
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("Soltaste la tecla");
				
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
					System.out.println("Escape");
				
				
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("Mantienes pulsada una tecla");
				
				// No funciona
				if (((e.getModifiers() & KeyEvent.CTRL_MASK) == KeyEvent.CTRL_MASK) && (e.getKeyCode() == KeyEvent.VK_C))
					System.out.println("Ctrl-C para copiar");
				
				
			}
		});

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setSize(400,80);
		setVisible(true);
		
	}
	
	private class TipoEventoListener implements AWTEventListener {
		
		public void eventDispatched(AWTEvent e){
			
			switch (e.getID()) {
				case MouseEvent.MOUSE_CLICKED:
					System.out.println("Click con ratón");
					break;
				case MouseEvent.MOUSE_ENTERED:
					System.out.println("Ratón Entrando en Ventana");
					break;
				case MouseEvent.MOUSE_EXITED:
					System.out.println("Salida del ratón de la Ventana");
					break;
				case MouseEvent.MOUSE_PRESSED:
					System.out.println("Click presionado");
					break;
				case MouseEvent.MOUSE_RELEASED:
					System.out.println("Click levantado");
					break;
				
				case WindowEvent.WINDOW_ACTIVATED:
					System.out.println("Ventana Activada");
					break;
				case WindowEvent.WINDOW_DEACTIVATED:
					System.out.println("Ventana desactivada");
					break;
				case WindowEvent.WINDOW_GAINED_FOCUS:
					System.out.println("Ventana obtiene el foco");
					break;
				case WindowEvent.WINDOW_LOST_FOCUS:
					System.out.println("Ventana pierde el foco");
					break;
					
				case KeyEvent.KEY_PRESSED:
					System.out.println("Letra pulsada");
					break;				
				case KeyEvent.KEY_RELEASED:
					System.out.println("Letra levantada");
					break;					
				case KeyEvent.KEY_TYPED:
					System.out.println("Letra tecleada");
					break;
						
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new TeclaPulsada();

	}

}
