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