package quad;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import quad.Main;

public class Main extends JFrame {

	private JPanel contentPane;
	Canvas canvas;

	public static void main(String[] args) {
		 
        EventQueue.invokeLater(() -> {
            JFrame ex = new Main();
            ex.setVisible(true);
        });
	}

	
	public Main() {
		StartUI();
        StartCanvas();
	}

	private void StartUI() {
		getContentPane().add(new Canvas());
        setResizable(true);
        pack();
        setTitle("QuadTree");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void StartCanvas() {
        
        
        setBackground(Color.white);
        
        
        setFocusable(true);

      
        setPreferredSize(new Dimension(canvas.cWidth, canvas.cHeight));
	
	
}
	}
