package domain.model;

public class square extends Shape{
    private int width = 0;

    public int getWidth(){
        return width;
    }

    public void setWidth(int newWidth){
    if (newWidth>=0)
    width = newWidth;
    }

    public int getHeight(){
        return getHeight();
    }

    public void setHeight(int newHeight){
        setWidth(newHeight);
    }
}
