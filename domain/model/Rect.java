package domain.model;

public class Rect extends Square {
    private int height = 0;

    public int getHeight(){
        return height;
    }

    public void setHeight(int newHeight){
        if (newHeight>=0)
        height = newHeight;
    }
}
