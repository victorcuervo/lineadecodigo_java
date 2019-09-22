package com.lineadecodigo.java.graficos;

/**
 * @file GraficosJFreeChart.java
 * @version 1.0
 * @author Pablo Ruiz (http://lineadecodigo.com)
 * @date   29/mayo/2012
 * @url    http://lineadecodigo.com/java/graficos-en-java-con-jfreechart/
 * @description Programa que utiliza JFreeChart para generar gráficos.
 */

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class GraficosJFreeChart extends javax.swing.JFrame {
    
	private static final long serialVersionUID = 1L;
	
	JFrame frame = new JFrame("Probando JFreeChart");
    
	public GraficosJFreeChart() {
        initComponents();
        frame.setSize(500, 270);
        frame.setLocationRelativeTo(getRootPane());        
        this.setLocationRelativeTo(getRootPane());
    }
    
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Generar gráfico");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row 1", "Column 1");
        dataset.addValue(5.0, "Row 1", "Column 2");
        dataset.addValue(3.0, "Row 1", "Column 3");
        dataset.addValue(2.0, "Row 2", "Column 1");
        dataset.addValue(3.0, "Row 2", "Column 2");
        dataset.addValue(2.0, "Row 2", "Column 3");
        dataset.addValue(10.0,"Row 3", "Column 4");
        dataset.addValue(10.0,"Row 3", "Column 4");
        
        JFreeChart chart = ChartFactory.createBarChart(
                "Ejemplo Básico para Línea de Código", //Título
                "Categorías", //Categorías
                "Valores", // Valores
                dataset, // data
                PlotOrientation.VERTICAL, // Orientación
                true, // include legend
                true, // tooltips?
                true // URLs?
                );
        
        ChartPanel chartPanel = new ChartPanel(chart, false);
        frame.setContentPane(chartPanel);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficosJFreeChart().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
