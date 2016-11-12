package Roguelike;

import java.util.Random;

public class Monstruo extends Personaje {
	
	public Monstruo(){ 
		
		this(0,0);
	}
	
	public Monstruo(int x, int y){
		
		super(x, y);
	}
	
	public void mover (int x, int y){
		
		Random rnd = new Random();
		int i = (int)(rnd.nexDouble() * 8);
		
		switch (i){
			case 0: ;break;
			case 1: ;break;
			case 2: ;break;
			case 3: ;break;
			case 4: ;break;
			case 5: ;break;
			case 6: ;break;
			case 7: ;break;
		
		}
		
		this.setPosicion(x, y);
	}

}
