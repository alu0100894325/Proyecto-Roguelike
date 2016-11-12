package Roguelike;

import java.awt.*;
import java.util.ArrayList;

import Dibujable;

public class TableroGrafico extends Tablero implements Dibujable {
	
	private ArrayList<ArrayList<CasillaGrafica> > gb_;
	
	
	public TableroGrafico (){
		
		super();
		
	}
	
	public TableroGrafico (int x, int y){
		
		super(x, y);
		
	}
	
	

}
