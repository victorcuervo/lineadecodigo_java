package com.lineadecodigo.java.swing;

/**
 * @file JuegoBasico.java
 * @version 1.0
 * @author Ariel Carraro (http://lineadecodigo.com)
 * @date   12/octubre/2012
 * @url    http://lineadecodigo.com/java/un-juego-sencillo-con-java-swing/
 * @description Juego Básico con Java Swing para adivinar la suma de dos números
 */

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class JuegoBasico extends JFrame{

	private static final long serialVersionUID = 1L;
	final private JTextField txtNum1,txtNum2,txtResultado,txtIntentos,txtAciertos,txtFallas;
	private JButton btnActiva,btnComprueba;
	private JButton btnSalir;
	private long num1,num2,valor;
	
	long suma_prog;
	int intentos=0,aciertos=0,fallas=0;
	

   public JuegoBasico(){

	   txtNum1=new JTextField(6);
	   txtNum1.setEnabled(false);
	   txtNum2=new JTextField(6);txtNum2.setEnabled(false);
	   txtResultado=new JTextField(6);txtResultado.setEnabled(false);
	   txtIntentos=new JTextField(6);txtIntentos.setEnabled(false);
	   txtAciertos=new JTextField(6);txtAciertos.setEnabled(false);
	   txtFallas=new JTextField(6);txtFallas.setEnabled(false);




	   JPanel panel=new JPanel();   
	   panel.add(new JLabel("Número 1:"));
	   panel.add(txtNum1);
	   panel.add(new JLabel("+"));
	   panel.add(new JLabel("Número 2:"));
	   panel.add(txtNum2);
	   panel.add(new JLabel("=  Resultado"));
	   panel.add(txtResultado);
	   panel.add(new JLabel("Intentos:"));
	   panel.add(txtIntentos);
	   panel.add(new JLabel("Aciertos:"));
	   panel.add(txtAciertos);
	   panel.add(new JLabel("Fallas:"));
	   panel.add(txtFallas);
  
	   btnActiva= new JButton("Activar");
	   btnActiva.addActionListener(new ActionListener() {
      
		   public void actionPerformed(ActionEvent e) {
         

			   	JuegoBasico aleatorio=new JuegoBasico();
				aleatorio.setNum1(aleatorio.obtenerAleatorio1());
				aleatorio.setNum2(aleatorio.obtenerAleatorio2());
				
				txtNum1.setText(String.valueOf(aleatorio.getNum1()));// no. 1
				txtNum2.setText(String.valueOf(aleatorio.getNum2()));// no.2
				txtResultado.setText("");
		   }

	   });


	   btnComprueba= new JButton("Comprobar");
	   btnComprueba.addActionListener(new ActionListener() {
      
		   public void actionPerformed(ActionEvent e) {
			   
			   JuegoBasico alea=new JuegoBasico();				
			   valor=Long.parseLong(JOptionPane.showInputDialog("Introduce valor"));				
			   alea.setValor(valor);				
			   txtResultado.setText(String.valueOf(alea.getValor()));//valor del usuario								
				
				//-------------------------------------------------------------------------------------
			   suma_prog=Long.parseLong(txtNum1.getText())+ Long.parseLong(txtNum2.getText());
				
				if(suma_prog==alea.getValor()){
					aciertos+=1;
					intentos+=1;
					txtIntentos.setText(String.valueOf(intentos));
					txtAciertos.setText(String.valueOf(aciertos));
				}else{
					fallas+=1;
					intentos+=1;
					txtIntentos.setText(String.valueOf(intentos));
					txtFallas.setText(String.valueOf(fallas));
				}
				//----------------------------------------------------------------------------


		   }

	   });

	   btnSalir= new JButton("Salir");
	   btnSalir.addActionListener(new ActionListener() {
      
		   public void actionPerformed(ActionEvent e) {
			   System.exit(0);
		   }
	   });


	   panel.add(btnActiva);panel.add(btnComprueba);
	   panel.add(btnSalir);
  
	   setTitle("Aleatorio");
	   setSize(620,180);
	 
	   setDefaultLookAndFeelDecorated(true);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   add(panel);

   }



	public static void main(String[] args)throws Exception{
    
		for(UIManager.LookAndFeelInfo laf:UIManager.getInstalledLookAndFeels()){
				if("Nimbus".equals(laf.getName()))
					try {
						UIManager.setLookAndFeel(laf.getClassName());
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel" ) ;
		    //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
						JuegoBasico Aleatorio=new JuegoBasico();
						Aleatorio.setVisible(true);						
					} catch (ClassNotFoundException e) {
						System.out.println("[Main.main:ClassNotFoundException]"+ e.getMessage());
					} catch (InstantiationException e) {
						System.out.println("[Main.main:InstantiationException]"+ e.getMessage());
					}
		}
	}

	public long getNum1() {
		return num1;
	}

	public void setNum1(long num1) {
		this.num1 = num1;
	}

	public long getNum2() {
		return num2;
	}

	public void setNum2(long num2) {
		this.num2 = num2;
	}
	
	public long obtenerAleatorio1(){
		return (long)(Math.random()*1000);
	}
	
	public long obtenerAleatorio2(){
		return (long)(Math.random()*1000);
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}

}