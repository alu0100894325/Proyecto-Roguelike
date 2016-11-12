package Roguelike;//matriz

//import java.util.*; 

public class Casilla {
		
	private boolean pared_;
	private boolean puerta_;
	private boolean monstruo_;
	private boolean heroe_;
	private boolean amuleto_;
		

	public Casilla(){
		
		this.pared_ = false;
		this.puerta_ = false;
		this.monstruo_ = false;
		this.heroe_ = false;
		this.amuleto_ = false;		
		
	}
		
	public boolean isPared (){		return(this.pared_);	}
	public boolean isPuerta (){		return(this.puerta_);	}
	public boolean isMonstruo (){		return(this.monstruo_);	}
	public boolean isHeroe (){		return(this.heroe_);	}
	public boolean isAmuleto (){		return(this.amuleto_);	}
		
	public void flipPared (){	this.pared_ = !this.pared_;	}	
	public void flipPuerta (){	this.puerta_ = !this.puerta_;	}	
	public void flipMonstruo (){	this.monstruo_ = !this.monstruo_;	}
	public void flipHeroe (){	this.heroe_ = !this.heroe_;	}
	public void flipAmuleto (){	this.amuleto_ = !this.amuleto_;	}

	
};
