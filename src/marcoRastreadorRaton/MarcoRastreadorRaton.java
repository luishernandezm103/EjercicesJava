package marcoRastreadorRaton;

import sun.management.ManagementFactoryHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MarcoRastreadorRaton extends JFrame {

    private JPanel panelRaton;
    private JLabel barraEstado;

    public MarcoRastreadorRaton () {

        super ( "Demostracion de los eventos de raton" );

        panelRaton = new JPanel();
        panelRaton.setBackground( Color.WHITE);
        add (panelRaton, BorderLayout.CENTER);

        barraEstado = new JLabel("Raton fuera de Jpanel");
        add (barraEstado, BorderLayout.SOUTH);

        ManejadorRaton manejador = new ManejadorRaton();
        panelRaton.addMouseListener( manejador );
        panelRaton.addMouseMotionListener( manejador );
    }

    private class ManejadorRaton implements MouseListener, MouseMotionListener {

        public void mouseClicked (MouseEvent evento) {

            barraEstado.setText( String.format( "se hizo clic en [%d , %d]",
                    evento.getX(), evento.getY()));
        }

        public void mousePressed (MouseEvent evento) {
            barraEstado.setText( String.format( "se oprimio en [%d , %d]",
                    evento.getX(), evento.getY()));
        }

        public void mouseReleased (MouseEvent evento) {
            barraEstado.setText( String.format( "se solto en [%d , %d]",
                    evento.getX(), evento.getY()));
        }

        public void mouseEntered (MouseEvent evento) {
            barraEstado.setText( String.format( "Raton entro en [%d , %d]",
                    evento.getX(), evento.getY()));
            panelRaton.setBackground( Color.GREEN );
        }

        public void mouseExited (MouseEvent evento) {
            barraEstado.setText( "Raton fuera del panel" );
            panelRaton.setBackground( Color.white);
        }

        public void mouseDragged (MouseEvent evento) {
            barraEstado.setText( String.format( "se arrastro en [%d , %d]",
                    evento.getX(), evento.getY()));
        }

        public void mouseMoved (MouseEvent evento) {
            barraEstado.setText( String.format( "se movio en [%d , %d]",
                    evento.getX(), evento.getY()));
        }
    }
}
