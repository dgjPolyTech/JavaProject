package chapter07.access;

public class Rabbit {
    private String shape;
    private int x, y;

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setShape(String shape){
        this.shape = shape;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public String getShape(){
        return shape;
    }

    public String getPosition(){
        return x+","+y;
    }
}
