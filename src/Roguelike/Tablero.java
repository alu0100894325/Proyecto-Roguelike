package Roguelike;

import java.util.*;

public class Tablero {
	
	private ArrayList<ArrayList<Casilla> > board_;
	private int m_;
	private int n_;
	
	
	public Tablero(){}
	public Tablero(int m, int n){
	
		this.m_ = m;
		this.n_ = n;
		
		//this.board_.resize(this.m_);
		
		for(int i = 0; i < this.m_; i++){
			
			//this.board_.resize(this.n_);
			
		}
		
	}

}