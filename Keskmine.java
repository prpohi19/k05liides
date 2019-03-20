public class Keskmine implements Algoritm{
	public double arvuta(double[] hinded, double[] eapd){
		double summa=0;
		int summa2=0;
		for(int i=0; i<hinded.length; i++){
			summa+=hinded[i]*eapd[i];
			summa2+=eapd[i];
		}
		return summa/summa2;
	}
}