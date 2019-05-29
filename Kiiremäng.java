public class Kiiremäng {
    public static void main(String[] args) {

        LeitudAsi seljakott [] = new LeitudAsi[2];

        LeitudAsi õun = new õun("õun");
        LeitudAsi kivi = new kivi("kivi");


        seljakott[0] = õun;
        seljakott[1] = kivi;

        for (int i=0; i<seljakott.length; i++) {
            LeitudAsi currentObject = seljakott[i];
            if (currentObject instanceof Söödav) {
                ((Söödav) currentObject).söö();
            }
        }
    }
}