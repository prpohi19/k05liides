class player implements playerinterface {
    public int kaugus=0;
    public int aeg=0;

    public player(){
            kaugus=0;
            aeg=6; //tundi
            }

    public void maga(){
            aeg+=6;
        System.out.println("Puhaksid ennast välja, saad veel 6 tundi liikuda");
            }


    public void konniedasi(){
            if(aeg>0){
                kaugus+=3;
                aeg -=1;
                System.out.println("Liikusid kõndides tunniga 3km edasi, kaugus hetkel "+kaugus);
            }else{
                System.out.println("mine maga!");
            }
    }

    public void jookseedasi(){
            if(aeg>0){
                kaugus+=7;
                aeg -=1;
                System.out.println("Liikusid joostes tunniga 7km edasi, kaugus hetkel "+kaugus);
            }else{
                System.out.println("mine maga!");
            }
    }

    public void konnitagasi(){
            if(aeg>0){
                kaugus-=3;
                aeg -=1;
                System.out.println("Liikusid kõndides tunniga 3km tagasi, kaugus hetkel "+kaugus);
            }else{
                System.out.println("mine maga!");
            }
    }

    public void jooksetagasi(){
            if(aeg>0){
                kaugus-=7;
                aeg -=1;
                System.out.println("Liikusid joostes tunniga 7km tagasi, kaugus hetkel "+kaugus);
            }else{
                System.out.println("Ei saa liikuda, oled liiga väsinud, mine maga!");
            }
    }
}