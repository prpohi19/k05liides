public class Ring implements Liides{
    static double raadius=5;

    @Override
    public double leiaPindala() {
        return Math.PI*Math.pow(raadius,2);
    }

    @Override
    public double leiaYmbermoot() {
        return 2*Math.PI*raadius;
    }
}
