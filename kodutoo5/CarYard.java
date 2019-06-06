import java.util.*;

class CarYard implements Cars {
    public void CarAmount() {
        Random howMany = new Random();
        int  min, max, range;
        double amount;
        min = 50;
        max = 150;
        range = (max - min) + 1;
        amount = (Math.random() * range) + min;
        System.out.println("There are " + Math.round(amount) + " cars in the yard.");
    }
    public void TotalValue() {
        Random howMany = new Random();
        int  min, max, range;
        double amount;
        min = 100000;
        max = 3000000;
        range = (max - min) + 1;
        amount = (Math.random() * range) + min;
        System.out.println("Sellable cars total value is " + Math.round(amount) + " euros.");
    }
}
