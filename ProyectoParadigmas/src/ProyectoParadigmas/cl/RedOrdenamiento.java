package ProyectoParadigmas.cl;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class RedOrdenamiento extends JFrame{
	
	public static int ALTO = 600;
	public static int ANCHO = 800;
	public static String TITULO = "Redes de Ordenamiento";
	
	JTabbedPane pane = new JTabbedPane();
	JPanel panelTutorial = new JPanel();
	JPanel panelCrearRed = new JPanel();
	//JPanel panelRed = new JPanel();
	
	JButton boton1 = new JButton("Entrada");
	JButton boton2 = new JButton("Nodo");
	JButton boton3 = new JButton("Red");
	JButton boton4 = new JButton("Resultado");
	
	ButtonGroup migrupo = new ButtonGroup();
	
	
	JButton boton5 = new JButton("Como Jugar");
	JButton boton6 = new JButton("¿Que es un nodo? ");
	JButton boton7 = new JButton("Mision del juego");
	
	//JButton boton8 = new JButton("-. Aqui se crea la Red .-");
	
	@SuppressWarnings("deprecation")
	public RedOrdenamiento() {
		super(TITULO);
		setSize(ANCHO, ALTO);
		addWindowListener(new WindowHandler());
		ColocarComponentes();
		setBackground(Color.pink);
		show();
	}
	
	void ColocarComponentes(){
		
		boton1.setBackground(Color.white);
		boton2.setBackground(Color.white);
		boton3.setBackground(Color.white);
		boton4.setBackground(Color.white);
		panelCrearRed.add(boton1);
		panelCrearRed.add(boton2);
		panelCrearRed.add(boton3);
		panelCrearRed.add(boton4);
		panelCrearRed.setBackground(Color.white);
		panelCrearRed.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));	
		
		
		
		panelTutorial.setLayout(new GridLayout(0,1,0,100));
		migrupo.add(boton5);
		migrupo.add(boton6);
		migrupo.add(boton7);
		boton5.setBackground(Color.white);
		boton6.setBackground(Color.white);
		boton7.setBackground(Color.white);
		panelTutorial.add(boton5);
		panelTutorial.add(boton6);
		panelTutorial.add(boton7);
		panelTutorial.setBackground(Color.darkGray);
		panelTutorial.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Elija un Tutorial: "));
		
		
		pane.addTab("Tutorial", panelTutorial);
		pane.addTab("Crear Red", panelCrearRed);
		
		this.getContentPane().add(pane);
		}
	
		
	class WindowHandler extends WindowAdapter{
		public void windowClosing(WindowEvent e){
		System.exit(0);
	}
	}	
}
