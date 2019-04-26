import java.util.Scanner;
public class Proov5{
	public static void main(String[] arg){
		int sisend1=0;
		Hero juku=new Hero();
		Hero kati=new Hero();
		juku.play(sisend1);
		kati.arvutaElu(Elu.MIINUS);
		kati.play(sisend1);
		System.out.println(juku);
		System.out.println(kati);
		System.out.println(juku.vahe(kati));
		
		Scanner lugeja=new Scanner(System.in);
		while(juku.vahe(kati)>0){
		

			System.out.println("Sisesta kas Juku kaotas, teenis elu juurde või on sama seis: ");
			int sisend=lugeja.nextInt();
			
				juku.arvutaElu(Elu.MIINUS);
			    juku.play(sisend);
			System.out.println(juku);
			
			
			
			System.out.println("Sisesta kas Kati kaotas, teenis elu juurde või on sama seis: ");
			sisend=lugeja.nextInt();
				kati.arvutaElu(Elu.MIINUS);
			    kati.play(sisend);
			System.out.println(kati);
			
		}
		System.out.println("0:0 Mängu lõpp!");
	}
	
}	