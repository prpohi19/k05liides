import java.util.Random;

class Game implements Character {
    public int xp=0;
    public int level=1;
    public int xpPerLevel=100;

    public Game(){
        xp=0;
        level=1;
        xpPerLevel=125;
    }
    Random rand = new Random();

    public void craft(){
        int gainz = rand.nextInt(34)+1;
        xp+=gainz;
        System.out.println("You craft a thing and gain "+gainz+" XP!");
        if(xp>=xpPerLevel){
            level++;
            xp=0+xp-xpPerLevel;
            xpPerLevel=xpPerLevel*2;
            System.out.println("You have leveled up to level "+level+"!! You now need "+(xpPerLevel-xp)+" for next level!");
        }
    }
}

