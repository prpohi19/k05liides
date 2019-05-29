public class õun implements LeitudAsi, Söödav {

    private String name;

    public õun(String name) {
        this.name = name;
    }

    @Override
    public void söö() {
        System.out.println("Mmm, sa sõid 1 " + this.name);
    }
}