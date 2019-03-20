import java.io.IOException;
import java.util.Arrays;
public class Proov {
    public static void main(String[] arg) throws IOException {
        TekstifailistArvujadaLugeja tekstiLugeja = new TekstifailistArvujadaLugeja("hinded.txt");        
        TekstifailistArvujadaLugeja tekstiLugeja2 = new TekstifailistArvujadaLugeja("eapd.txt");
        System.out.println("Hinded on " +  Arrays.toString(tekstiLugeja.loeArvud()));
        System.out.println("EAPd on " + Arrays.toString(tekstiLugeja2.loeArvud()));
        Keskmine keskmine = new Keskmine();
        System.out.println("Keskmine hinne on "  + keskmine.arvuta(tekstiLugeja.loeArvud(), tekstiLugeja2.loeArvud()));
    }
}
/* TULEMUS
Hinded on [4.0, 3.0, 5.0]
EAPd on [3.0, 4.0, 6.0]
Keskmine hinne on 4.153846153846154
*/
