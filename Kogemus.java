class Kogemus implements Hitman, Sihtmärk{
  public int health = 100;
  public void tulista(){
     if(t2psus >= 85){
       health = 0;
       System.out.println("Sa lasid vastasele täpselt pähe");
     }
    else if(t2psus >= 51){
        health -= 50;
        System.out.println("Oma ebatäpsuse tõttu lasid sihtmärgile kõhtu, sihtmärgi elusi: "+health);
      }else {
        health -= 25;
        System.out.println("Oma ebatäpsuse riivas kuul sihtmärki, sihtmärgil elusi: "+health+"  Proovi uuesti, kui oled natukene täpsem");
      }
  if (health == 0){
    System.out.println("Vastane hävitatud!");
  }
   }
 }
