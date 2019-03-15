package tund2;

import java.util.Random;

public class Character implements Actions {
    int x, y;
    String name;
    TypeOfCharacter typeOfCharacter;
    Direction direction;

    public Character(String name, TypeOfCharacter newTypeOfCharacter){
        x = 0;
        y = 0;
        this.name = name;
        typeOfCharacter = newTypeOfCharacter;
        direction = Direction.RIGHT;
    }

    public void move(){
        if(direction == direction.RIGHT){ x++; }
        if(direction == direction.LEFT) { x--; }
        if(direction == direction.UP) { y++; }
        if(direction == direction.DOWN) { y--; }
    }

    public void changeDirection(Direction newDirection){
        direction = newDirection;
    }

    public String speak(){
        return "I´m a " + typeOfCharacter + " named " + name;
    }


    public int distanceFrom(Character c){
        int dx = c.x - x;
        int dy = c.y - y;
        if (dx < 0){ dx = -dx; }
        if (dy < 0){ dy = -dy; }

        return dx + dy;
    }

    public String toString() {
        return typeOfCharacter + " kohal x:" + x + ", y:" + y + " suund: " + direction;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int newX){
        x = newX;
    }

    public void newRandomLocation(){
        Random r = new Random();
        this.x = r.nextInt(10 - 1) + 1;
        this.y = r.nextInt(10 - 1) + 1;
    }

    public void setY(int newY){
        y = newY;
    }
}
