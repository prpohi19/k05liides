import java.util.*;

class BMW implements Autod {
    public void AutodeHulk() {
        Random hulk = new Random();
        int  min, max, range;
        double amount;
        min = 100;
        max = 200;
        range = (max - min) + 1;
        amount = (Math.random() * range) + min;
        System.out.println("Laos on " + Math.round(amount) + " autot");
    }
    public void LaoVäärtus() {
        Random hulk = new Random();
        int  min, max, range;
        double amount;
        min = 1000000;
        max = 2000000;
        range = (max - min) + 1;
        amount = (Math.random() * range) + min;
        System.out.println("Laos väärtus on " + Math.round(amount) + " eurot");
    }
}