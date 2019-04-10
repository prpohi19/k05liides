

public class Tegelane implements Tegevused{
//Funktsioon arvutab nädalas magatud tunnid kokku
  public int howManyHours(int[] days){
    int together = 0;
    //for(int i : days){
    for(int i=0; i < days.length; i++){
      together = together + days[i];
    //System.out.println(together);
    }
    return together;
  }
  public int avaragePerDay(int together){
    double avarege = together / 7.0;
    //System.out.println(Math.round(avarege));
    return (int)Math.round(avarege);
  }

 public static void main(String args[]) {
   Tegelane uni = new Tegelane();
   int[] days = {6, 5, 8, 4, 8, 9, 7};

   System.out.println("Kokku unetunde: " + uni.howManyHours(days));
   System.out.println("Magad nädalas keskmiselt " + uni.avaragePerDay(uni.howManyHours(days)) + " tundi.");
 }
}
