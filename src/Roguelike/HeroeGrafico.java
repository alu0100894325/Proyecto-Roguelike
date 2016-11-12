package Roguelike;

import java.awt.Color;
import java.awt.Graphics;

import Dibujable;

public class HeroeGrafico extends Heroe implements Dibujable {
	
	Color color;
	
	public HeroeGrafico(int x, int y, Color unColor) {
		
		super(x, y);
		this.color = unColor;
	}
	
	public void dibujar(Graphics dw) {
		
		dw.setColor(color);
	}
	
	public void setPosicion(double x, double y) {
		
		;
	}
	
	

}
