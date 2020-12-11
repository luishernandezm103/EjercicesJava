package marcoDemoTeclas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MarcoDemoTeclas extends JFrame implements KeyListener {

    private String linea1 = "";
    private String linea2 = "";
    private String linea3 = "";
    private JTextArea areaTexto;

    public MarcoDemoTeclas () {
        super("Demostracion de los eventos de pulsacion de teclas");

        areaTexto = new JTextArea( 10 , 5 );
        areaTexto.setText("Oprima cualquier tecla en el teclado...");
        areaTexto.setEnabled(false);
        areaTexto.setDisabledTextColor(Color.BLACK);
        add ( areaTexto );

        addKeyListener(this);
    }

    public  void keyPressed (KeyEvent evento){
        linea1 = String.format("tecla oprimida: %s",
        evento.getKeyText(evento.getKeyCode() ) );
    establecerLineas2y3 ( evento );
    }

    public  void keyReleased (KeyEvent evento){
        linea1 = String.format("tecla liberada: %s",
                evento.getKeyText(evento.getKeyCode() ) );
        establecerLineas2y3 ( evento );
    }

    public  void keyTyped (KeyEvent evento){
        linea1 = String.format("tecla oprimida: %s",
                evento.getKeyText(evento.getKeyChar() ) );
        establecerLineas2y3 ( evento );
    }

    public  void establecerLineas2y3 (KeyEvent evento){
        linea2 = String.format("esta tecla %s es una tecla de accion",
                (evento.isActionKey() ? "" : "no " ) );

       String temp = evento.getKeyModifiersText(evento.getModifiers());

       linea3 = String.format("Teclas modificadas oprimidas: %s" ,
               (temp.equals("") ? "ninguna" : temp ) );

       areaTexto.setText( String.format("%s\n%s\n%s\n",
               linea1,linea2,linea3) );
    }
}
