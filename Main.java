public class Main {
    public static void main(String[] args) {
        Ristkylik rk=new Ristkylik();
        Ring ring=new Ring();
        System.out.println("Ristkülik:\npindala on "+rk.leiaPindala());
        System.out.println("ümbermõõt on "+rk.leiaYmbermoot());
        System.out.printf("Ring:\npindala on %.1f\n", ring.leiaPindala());
        System.out.printf("ümbermõõt on %.1f\n", ring.leiaYmbermoot());
    }
}
