package Roguelike;

import java.util.*;

public abstract class Personaje {
	
	private ArrayList<int> posicion_;
	
	
	
	public Personaje(){
		
		this(0,0);
		
	}
	
	public Personaje(int x, int y){
		
		this.posicion_ = new ArrayList<int>();
		this.posicion_.add(x);
		this.posicion_add(y);
		
	}
	
	public abstract boolean mover(int x, int y);
	
	public void setX (int x){	this.posicion_[0] = x;	}
	public void setY (int y){	this.posicion_[1] = y;	}
	public void setPosicion (int x, int y){	this.posicion_[0] = x;	this-posicion_[1] = y;	}
	
	public int getX (){	return(this.posicion_.get(0));	}
	public int getY (){	return(this.posicion_.get(1));	}	
	public ArrayList<int> getPosicion (){	return(this.posicion_);	}

}
