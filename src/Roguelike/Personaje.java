package Roguelike;

import java.util.*;

public abstract class Personaje {
	
	private ArrayList<Integer> posicion_;
	
	
	
	public Personaje(){
		
		this(0,0);
		
	}
	
	public Personaje(int x, int y){
		
		this.posicion_ = new ArrayList<Integer>();
		this.posicion_.add(x);
		this.posicion_.add(y);
		
	}
	
	public abstract void mover(int x, int y);
	
	public void setX (int x){	this.posicion_.clear(); this.posicion_.add(x);	this.posicion_.add(this.posicion_.get(1));	}
	public void setY (int y){	this.posicion_.add(1, y);	}
	public void setPosicion (int x, int y){	this.posicion_.clear();	this.posicion_.add(x);	this.posicion_.add(y);	}
	
	public int getX (){	return(this.posicion_.get(0));	}
	public int getY (){	return(this.posicion_.get(1));	}	
	public ArrayList<Integer> getPosicion (){	return(this.posicion_);	}

}
