class Naarik implements Koletis{
  public Naarik(){
    HP = 150;
  }

  public void GetPunched(){
    HP -= 50;
    System.out.println("Sind just löödi toorelt, kaotasid elusid! ");
    System.out.println("Allesjäänud HP: "+ HP);
    if(HP <= 0){
      System.out.println("Surid ära, kahju");
    }
  }
}
