import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Hitman lask = new Kogemus();
    Scanner reader = new Scanner(System.in);
    System.out.println("Mitu lasku soovid teha? ");
    int kord = reader.nextInt();

    for(int i= 0; i < kord; i++){
        lask.tulista();
    }

  }
}
