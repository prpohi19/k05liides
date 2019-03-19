public class Auto implements Tegevus{
   private double kytus = 0;
   private double kilometraaž = 0;
   private double keskmineKytuseKulu;

    public Auto(double kytus, double kilometraaž, double keskmineKytuseKulu){
        this.kytus=kytus;
        this.kilometraaž=kilometraaž;
        this.keskmineKytuseKulu=keskmineKytuseKulu;
    }

    public void tangi(int l) {
        this.kytus += l;
        System.out.println("Teil on autos "+kytus+" liitrit kütust");
    }

    public double s6ida(int km) {
        if(kytus-(keskmineKytuseKulu/100.0*km) >= 0) {
            kilometraaž += km;
            kytus = kytus - (keskmineKytuseKulu / 100.0 * km);
            System.out.println("Läbisite "+km+" km");
        } else {
            System.out.println("Teil ei ole piisavalt kütust, et läbida "+km+" km");
        }
        return kilometraaž;
    }
}
