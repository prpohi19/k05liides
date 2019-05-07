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
/*
You craft a thing and gain 28 XP!
You craft a thing and gain 31 XP!
You craft a thing and gain 10 XP!
You craft a thing and gain 33 XP!
You craft a thing and gain 22 XP!
You craft a thing and gain 31 XP!
You have leveled up to level 2!! You now need 220 for next level!
You craft a thing and gain 22 XP!
You craft a thing and gain 2 XP!
You craft a thing and gain 4 XP!
You craft a thing and gain 14 XP!
You craft a thing and gain 18 XP!
You craft a thing and gain 15 XP!
You craft a thing and gain 32 XP!
You craft a thing and gain 11 XP!
You craft a thing and gain 12 XP!
You craft a thing and gain 2 XP!
You craft a thing and gain 27 XP!
You craft a thing and gain 34 XP!
You craft a thing and gain 7 XP!
You craft a thing and gain 15 XP!
You craft a thing and gain 27 XP!
You have leveled up to level 3!! You now need 478 for next level!
You craft a thing and gain 24 XP!
You craft a thing and gain 20 XP!
You craft a thing and gain 24 XP!
You craft a thing and gain 33 XP!
You craft a thing and gain 31 XP!
You craft a thing and gain 2 XP!
You craft a thing and gain 20 XP!
You craft a thing and gain 14 XP!
You craft a thing and gain 16 XP!
You craft a thing and gain 22 XP!
*/

