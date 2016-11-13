package Roguelike;

import javax.swing.JFrame;
import java.awt.EventQueue;

public class Juego extends JFrame {
	
	private String message = "Game Over";
    private HeroeGrafico heroe;
    private TableroGrafico tablero;
    
	public Juego() (){
		
		tablero = new TableroGrafico()
		add(tablero);
        
        setResizable(false);
        pack();
        
        setTitle("Roguelike");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
        	
            @Override
            public void run() {    
            	
                JFrame ex = new Juego();
                ex.setVisible(true);                
            }
        });
	}
	
	

}
