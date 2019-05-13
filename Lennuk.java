package Kodutöö5;

public class Lennuk implements Tegevused {
    @Override
    public void hääl() {
        System.out.println("Lennuk teeb wiuuu");
    }

    @Override
    public void suurus() {
        System.out.println("Lennuk on suur");
    }

    @Override
    public void ratasteArv() {
        System.out.println("Lennukil on 3 ratast");
    }
}
