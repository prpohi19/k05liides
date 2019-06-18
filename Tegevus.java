class Tegevus implements Tegelane {
    public int palk = 0;
    public int hoius = 0;

    public Tegevus() {
        palk = 0;
        hoius = 0;
    }

    public void palgapaev() {
        palk += 1000;
        System.out.println("Said palka, lisandus 1000 eurot.");
    }


    public void kulud() {
        palk -= 900;
        System.out.println("Kulud -900");
    }

    public void hoiaKokku() {
        palk += 50;
        System.out.println("Hoidsid lisaks kokku 50 eurot.");
    }

    public void hoius() {
        if(palk >= 100) {
            hoius += 100;
            palk -= 100;
            System.out.println("Lisasid kogumishoiusele 100 eurot.");
        } else {
            System.out.println("Kontol pole piisavalt raha, et hoiustada.");
        }
      }
}
