package ProyectoParadigmas.cl;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class RedOrdenamiento extends JFrame{
    private JMenuBar mb;
    private JMenu menu1,menu2,menu3,menu4;
    private JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12;
    public RedOrdenamiento() {
        setLayout(null);
        mb=new JMenuBar();
        setJMenuBar(mb);
        
        //Archivo//
        menu1=new JMenu("Archivos");
        mb.add(menu1);
        mi1=new JMenuItem("Nuevo");
      //mi1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {...}});;
        menu1.add(mi1);
        mi2=new JMenuItem("Abrir");
      //mi2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {...}});;
        menu1.add(mi2);
        mi3=new JMenuItem("Guardar");
      //mi3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {...}});;
        menu1.add(mi3);
        mi4=new JMenuItem("Ver Tutorial");
      //mi4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {...}});;
        menu1.add(mi4);
        mi5=new JMenuItem("Empezar Test");
      //mi5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {...}});;
        menu1.add(mi5);
        mi6=new JMenuItem("Imprimir");
      //mi6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {...}});;
        menu1.add(mi6);
        mi7=new JMenuItem("Salir");
        mi7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);	}
			});;
        menu1.add(mi7);
        
        //Edicion//
        menu2=new JMenu("Edicion");
        mb.add(menu2);
        mi8=new JMenuItem("Deshacer");
      //mi8.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {...}});;
        menu2.add(mi8);
        mi9=new JMenuItem("Rehacer");
      //mi9.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {...}});;
        menu2.add(mi9);
        mi10=new JMenuItem("Borrar red");
      //mi10.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {...}});;
        menu2.add(mi10);

        //Opciones//
        menu3=new JMenu("Opciones");
        mb.add(menu3);
        
        //Ayuda//
        menu4=new JMenu("Ayuda");
        mb.add(menu4);
        mi11=new JMenuItem("Ver menu de ayuda");
      //mi11.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {...}});;
        menu4.add(mi11);
        mi12=new JMenuItem("Acerca de");
      //mi12.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {...}});;
        menu4.add(mi12);
    
    }
    
}