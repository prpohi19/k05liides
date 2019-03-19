import java.util.*;

public class ReadNumbers {
  Scanner reader = new Scanner(System.in);
  public int[] ReadNumbers(){
    System.out.print("Mitut arvu tehe sisaldab: ");
    int input = reader.nextInt();
    int[] numbers = new int[input];
    for (int i = 0; i < input; i++){
      System.out.print("Sisestage arv: ");
      numbers[i] = reader.nextInt();
    }
    return numbers;
  }
}
