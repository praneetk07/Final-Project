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
public class Bullet extends GameObjects{
	int dx;
	int dy;

	public Bullet(int x, int y, int dx, int dy){
		super(x,y, 20, 5);
		this.dx = dx;
		this.dy = dy;
	}

	@Override
	public void update(GraphicsContext gc){
		x+=dx;
		y+=dy;
		draw(gc);
	}

	@Override
	public void draw(GraphicsContext gc){
		gc.fillRect(x, y, w, h);
	}
}