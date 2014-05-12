package ProyectoParadigmas.cl;
//menu inicio

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;



public class Inicio {
	public static final void menu(){
		JFrame ventana = new JFrame();
		ventana.setLayout(null);
		JButton boton1 = new JButton("Tutorial");
		JButton boton2 = new JButton("Crear");
		JButton boton3 = new JButton("Abrir");
		JButton boton4 = new JButton("Salir");
		JLabel titulo = new JLabel("Redes de Ordenamiento");
		ventana.setResizable(false);
		ventana.setSize(190, 330);
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
		ventana.setVisible(true);
	}
}
