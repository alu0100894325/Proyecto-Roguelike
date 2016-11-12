package Roguelike;

public class Heroe extends Personaje {
	
	private int nVidas_;
	private boolean hasAmuleto_;
	
	public Heroe(){ 
		
		this(0,0);
	}
	public Heroe(int x, int y){
		
		super(x, y);
		nVidas_=3;
		hasAmuleto_=false;
	}
	
	public void reducirVida (){
		
		nVidas_--;
	}
	
	public void darAmuleto (){
		
		hasAmuleto_=true;
	}
	
	public void setVida (int i){
		
		nVidas_=i;
	}
	
	public int getVida (){
		
		return nVidas_;
	}
	
	public boolean isAmuleto (){
		
		return hasAmuleto_;
	}
	
	public void mover (int x, int y){
		
		this.setPosicion(x, y);
	}
	
}
