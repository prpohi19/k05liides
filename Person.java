class Person implements Human {
    public int energy = 0;
    public int money = 0;

    public Person() {
        energy = 0;
        money = 0;
    }

    public void sleep() {
        energy += 5;
        System.out.println("Said +5 energiat.");
    }

    public void work() {
        if(energy > 0) {
            money += 10;
            energy -= 1;
            System.out.println("Said €10 ja kulus 1 energia.");
        } else {
            System.out.println("Maga, et tööd teha.");
        }
   }
}