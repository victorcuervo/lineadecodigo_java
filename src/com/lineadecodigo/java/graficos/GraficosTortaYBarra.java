package com.lineadecodigo.java.graficos;

/**
 * @file CrearGraficos.java
 * @version 1.0
 * @author  Feffo Calendino (http://lineadecodigo.com)
 * @date   29/mayo/2012
 * @url    http://lineadecodigo.com/java/crear-grafico-de-torta-y-barras/
 * @description Crea y muestra un grafico de torta y uno de barras en un JFrame.
 */


import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class GraficosTortaYBarra {

	public static void main(String[] args) {
		
		setLookAndFeel();

		Random rnd = new Random(System.currentTimeMillis());
		// Establece una semilla para el random

		int[] array = new int[10];

		for (int i = 0; i < 10000; i++)
			array[rnd.nextInt(10)]++;
		// Cada vez que el random da un numero, se aumenta en uno la
		// cantidad de veces que fue dado.

		JFrame frame = new JFrame("CrearGraficos - LineaDeCodigo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(2, 1));
		
		frame.add(crearGraficoTorta(array));
		frame.add(crearGraficoBarras(array));
		// Agregamos un panel con el grafico a la ventana
		
		frame.pack(); 
		// Redimensiona el tamaño del frame, al minimo posible.
		
		frame.setLocationRelativeTo(null); 
		// Establece la ubicacion del frame ene l centro de la pantalla.
		
		frame.setVisible(true);
	}

	private static void setLookAndFeel() {
		try {
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager
					.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	private static JPanel crearGraficoTorta(int[] array) {
		DefaultPieDataset dataset = new DefaultPieDataset();

		// Este for agrega las 'porciones' a nuestro grafico de torta.
		for (int i = 0; i < array.length; i++)
			dataset.setValue("Valor " + i + ": " + array[i], array[i]);
		// El ultimo parametro indica el valor de la
		// torta que ocupa cada porcion.

		// Una vez completado el dataset, se crea el
		// grafico de torta en base a el.
		JFreeChart chart = ChartFactory.createPieChart("Repeticion de randoms",
				dataset, true, true, true);

		// chart.setBackgroundPaint(Color.white); // Establece el color de fondo.
		// chart.removeLegend(); // Este metodo elimina las referencias.

		return new ChartPanel(chart);
		// Finalmente para mostrar el grafico se crea un nuevo panel
		// con el grafico en cuestion y lo retornamos.
	}
	
	private static JPanel crearGraficoBarras(int[] array) {

		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		// Creo una serie para los valores
		String serie = "Numeros";

		// Se agregan los valores al dataset
		for (int i = 0; i < array.length; i++)
				dataset.addValue(array[i], serie, "" + i);

		// Una vez completado el dataset, se crea el
		// grafico de barras en base a el.
		JFreeChart chart = ChartFactory.createBarChart("Repeticion de randoms", null, null,
				dataset, PlotOrientation.HORIZONTAL, true, true, false);
	
		// chart.setBackgroundPaint(Color.white); // Establece el color de fondo.
		// chart.removeLegend(); // Este metodo elimina las referencias.

		return new ChartPanel(chart);
		// Finalmente para mostrar el grafico se crea un nuevo panel
		// con el grafico en cuestion y lo retornamos.
	}
} 