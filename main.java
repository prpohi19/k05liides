import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg){
        System.out.println("1 = Celsius -> Farenheit 2 = Farenheit -> Celsius");
        int choice = scanner.nextInt();
        System.out.println(("Sisestage kraadid: "));
        double temp = scanner.nextDouble();

        if(choice == 1) {
            converter f1 = new farenheit();
            double finalAnswer = f1.convert(temp);

            System.out.println(finalAnswer + "F");
        } else if(choice == 2) {
            converter c1 = new celsius();
            double finalAnswer = c1.convert(temp);

            System.out.println(finalAnswer + "C");
        }
    }
}
