public class celsius implements converter{

    @Override
    public double convert(double arv) {
        double celsius = 0;

        celsius = (arv-32)/1.8;

        return celsius;
    }
}
