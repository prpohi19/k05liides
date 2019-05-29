public class Ristkylik implements Liides {
    static double kylg1=2.3;
    static double kylg2=4;

    @Override
    public double leiaPindala() {
        return kylg1*kylg2;
    }

    @Override
    public double leiaYmbermoot() {
        return 2*(kylg1+kylg2);
    }
}
