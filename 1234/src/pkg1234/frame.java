package pkg1234;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class frame extends JFrame{
    DragPanel dragPanel = new DragPanel();
    JButton boton = new JButton();
    frame() {
        this.add(boton);
        this.add(dragPanel);
        this.setTitle("Drag & Drop demo");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
    
        
    
}
