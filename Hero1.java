class Hero{
	int x, n; 
	Tyyp tyyp;
	Elu elu;
	public Hero(){
		x=3;
		tyyp=Tyyp.MANGIJA;
		elu=Elu.SAMA;
	}
	public void play(int _n){
		
		n=_n;
		if(elu==Elu.MIINUS){x=x+n;}
		
		
	}
	public int  vahe(Hero t){
		int dx=t.x+x;
		return dx;
	}
	public void arvutaElu(Elu uusElu){elu=uusElu;}
	public String toString(){
		return tyyp+ " elude arv on " +x;
	}
	
}

