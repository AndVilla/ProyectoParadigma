package ProyectoParadigmas.cl;
//menu inicio

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;



public class Inicio {
	public static final void menu(){
		final JFrame ventana = new JFrame();
		ventana.setLayout(null);
		ventana.setLocationRelativeTo(null);
		JButton boton1 = new JButton("Tutorial");
		JButton boton2 = new JButton("Crear");
		JButton boton3 = new JButton("Abrir");
		JButton boton4 = new JButton("Salir");
		boton2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				 RedOrdenamiento window = new RedOrdenamiento();
				 ventana.dispose();
				 }
		});
		
		boton4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);	}});
		
		JLabel titulo = new JLabel("Redes de Ordenamiento");
		ventana.setResizable(false);
		ventana.setSize(190, 330);
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dimen = ventana.getSize();
		ventana.setLocation((pantalla.width/2 - dimen.width/2), (pantalla.height/2 - dimen.height/2));
		titulo.setBounds(24, 5, 200, 10);
		ventana.add(titulo);
		boton1.setBounds(45, 50, 100, 50);
		ventana.add(boton1);
		boton2.setBounds(45, 110, 100, 50);
		ventana.add(boton2);
		boton3.setBounds(45, 170, 100, 50);
		ventana.add(boton3);
		boton4.setBounds(45, 230, 100, 50);
		ventana.add(boton4);
		ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		ventana.getContentPane().setBackground(Color.white);
		ventana.setVisible(true);
	}
}
