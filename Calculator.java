import java.util.*;

public class Calculator implements CalcInterface {
  public void Add(int[] numbers){
    int answer = 0;
    for(int i = 0; i < numbers.length; i++){
      if(i == 0){
        answer = numbers[i];
      } else {
        answer += numbers[i];
      }
    }
    System.out.println("---");
    System.out.println("Liitmise vastus: " + answer);
  }
  public void Deduct(int[] numbers){
    int answer = 0;
    for(int i = 0; i < numbers.length; i++){
      if(i == 0){
        answer = numbers[i];
      } else {
        answer -= numbers[i];
      }
    }
    System.out.println("---");
    System.out.println("Lahutamise vastus: " + answer);
  }
  public void Multiply(int[] numbers){
    int answer = 0;
    for(int i = 0; i < numbers.length; i++){
      if(i == 0){
        answer = numbers[i];
      } else {
        answer *= numbers[i];
      }
    }
    System.out.println("---");
    System.out.println("Korrutamise vastus: " + answer);
  }
  public void Divide(int[] numbers){
    double answer = 1.0;
    for(int i = 0; i < numbers.length; i++){
      if(i == 0){
        answer = numbers[i];
      } else {
        answer /= numbers[i];
      }
    }
    System.out.println("---");
    System.out.println("Jagamise vastus: " + answer);
  }
}
