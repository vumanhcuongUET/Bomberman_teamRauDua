package entities;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import graphics.Sprite;
import javafx.scene.input.KeyEvent;

public abstract class Entity {
    //Tọa độ X tính từ góc trái trên trong Canvas
    protected int x;

    //Tọa độ Y tính từ góc trái trên trong Canvas
    protected int y;

    protected Image img;

    //Khởi tạo đối tượng, chuyển từ tọa độ đơn vị sang tọa độ trong canvas
    public Entity( int xUnit, int yUnit, Image img) {
        this.x = xUnit * Sprite.SCALED_SIZE;
        this.y = yUnit * Sprite.SCALED_SIZE;
        this.img = img;
    }


    public void render(GraphicsContext gc) {
        gc.drawImage(img, x, y);
    }
    public abstract void update(KeyEvent event);

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setImg(Image img) {
        this.img = img;
    }
}