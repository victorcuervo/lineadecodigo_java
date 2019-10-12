package com.lineadecodigo.java.swing.borrador;

import java.awt.AWTEvent;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TipoEvento extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel etiqueta;
	
	TipoEvento(){
		super("Tipo Evento");
		getContentPane().setLayout(new FlowLayout());	
				
		etiqueta = new JLabel("Entra y sal de la ventana. Pulsa con el ratón y a las teclas.");		
		add(etiqueta);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		tk.addAWTEventListener(new TipoEventoListener(), AWTEvent.WINDOW_EVENT_MASK | AWTEvent.KEY_EVENT_MASK | AWTEvent.MOUSE_EVENT_MASK);
		

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
		new TipoEvento();

	}

}
