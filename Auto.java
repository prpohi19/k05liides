package Kodutöö5;

public class Auto implements Tegevused{
    @Override
    public void hääl() {
        System.out.println("Auto teeb wroom");
    }

    @Override
    public void suurus() {
        System.out.println("Auto on väike");
    }

    @Override
    public void ratasteArv() {
        System.out.println("Autol on 4 ratast");
    }
}
