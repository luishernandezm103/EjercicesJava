package marcoFlowLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcoFlowLayout extends JFrame {

    private JButton botonJButtonIzquierda;
    private JButton botonJButtonCentro;
    private JButton botonJButtonDerecha;
    private FlowLayout esquema;
    private Container contenedor;

    public MarcoFlowLayout() {

        super("Demostracion de FlowLayout");

        esquema = new FlowLayout();
        contenedor = getContentPane();
        setLayout(esquema);

        botonJButtonIzquierda = new JButton("Izquierda");
        add (botonJButtonIzquierda);
        botonJButtonIzquierda.addActionListener(

                new ActionListener() {

                    public void actionPerformed (ActionEvent evento){

                        esquema.setAlignment(FlowLayout.LEFT);

                        esquema.layoutContainer( contenedor );

                    }
                }
        );

        botonJButtonCentro = new JButton("centro");
        add (botonJButtonCentro);
        botonJButtonCentro.addActionListener(

                new ActionListener() {

                    public void actionPerformed (ActionEvent evento){

                        esquema.setAlignment(FlowLayout.CENTER);

                        esquema.layoutContainer( contenedor );

                    }
                }
        );

        botonJButtonDerecha = new JButton("Derecha");
        add (botonJButtonDerecha);
        botonJButtonDerecha.addActionListener(

                new ActionListener() {

                    public void actionPerformed (ActionEvent evento){

                        esquema.setAlignment(FlowLayout.RIGHT);

                        esquema.layoutContainer( contenedor );

                    }
                }
        );
    }
}
