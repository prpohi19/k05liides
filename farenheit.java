public class farenheit implements converter{

    public double convert(double arv) {
        double faren = 0;

        faren = (arv*1.8+32);
        return faren;
    }
}
