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

public class Man extends GameObjects{

	private Image image;
	private int dx;
	private int dy;	

	public Man(int x, int y){
		super(x, y, 50, 100);
		image = new Image("Man.jpg");		
	}

	@Override
	public void update(GraphicsContext gc) {
		System.out.println(dx);
		x += dx;
		y += dy;
		draw(gc);
	}

	@Override
	public void draw(GraphicsContext gc) {
		gc.drawImage(image, x, y, w, h);
	}

	public void handleKeyEvent(KeyEvent event) {
		if(event.getCode() == KeyCode.RIGHT)
			dx = 2;
		else if(event.getCode() == KeyCode.LEFT)
			dx = -2;
	}

}