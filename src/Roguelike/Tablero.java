package Roguelike;

import java.util.*;

public class Tablero {
	
	private ArrayList<ArrayList<Casilla> > board_;	//tablero
	private int m_;									//filas
	private int n_;									//columnas
	
	
	public Tablero(){
		
		this(0,0);
		
	}
	
	public Tablero(int m, int n){
	
		this.m_ = m;
		this.n_ = n;
		
		ArrayList<Casilla> arrayAuxiliar = new ArrayList<Casilla>();

		
		for(int i = 0; i < this.n_; i++){
			
			Casilla casillaAuxiliar = new Casilla();			
			arrayAuxiliar.add(casillaAuxiliar);
			
		}
		
		for(int i = 0; i < this.m_; i++){
			
			this.board_.add(arrayAuxiliar);
			
		}
		
	}
	
	public int getM (){	return(this.m_);	}
	public int getN (){	return(this.n_);	}
	
	public void flipHeroe (int x, int y){
		
		this.board_.get(x).get(y).flipHeroe();
		
	}
	
	public void flipPared (int x, int y){
		
		this.board_.get(x).get(y).flipPared();
		
	}
	
	public void flipPuerta (int x, int y){
		
		this.board_.get(x).get(y).flipPuerta();
		
	}
	
	public void flipMonstruo (int x, int y){
		
		this.board_.get(x).get(y).flipMonstruo();
		
	}
	
	public void flipAmuleto (int x, int y){
		
		this.board_.get(x).get(y).flipAmuleto();
		
	}

};