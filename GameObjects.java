import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.*;
import javafx.scene.media.AudioClip;
import java.net.URL;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.event.*;
import javafx.scene.input.*;
import javafx.scene.text.*;
public abstract class GameObjects{
	protected int x;
	protected int y;
	protected int w;
	protected int h;

	public GameObjects(int x, int y, int w, int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	public void update(GraphicsContext gc){
		draw(gc);
	}

	public abstract void draw(GraphicsContext gc);

	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getW(){
		return w;
	}
	public int getH(){
		return h;
	}

	public Rectangle2D getRect() {
		return new Rectangle2D(x, y, w, h);
	}

	public boolean collides(GameObjects gameObjects) {
		return getRect().intersects(gameObjects.getRect());
	}
}
