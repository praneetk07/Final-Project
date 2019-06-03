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
import java.util.ArrayList;
public class GameRunner extends Application implements EventHandler<InputEvent>{
	Image enemy = new Image("Enemy.jpg");
	GraphicsContext gc;
	int x = 0;
	int y = 0;
	AnimateObjects animate;
	ArrayList<GameObjects> list;

	public class AnimateObjects extends AnimationTimer{
		public void handle(long now){
			gc.setFill(Color.BLACK);
			gc.fillRect(0,0,800,400);
			//code executed 60 times/sec
			//UPDATE
			for(int i = 0; i< list.size();i++){
				list.get(i).update(gc);
			}

		}
	}
	public static void main(String[] args){
		launch(args);
	}

	public void start(Stage stage){
		stage.setTitle("Final Project Title");
		Group root = new Group();
		Canvas canvas = new Canvas(800, 400);
		root.getChildren().add(canvas);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		gc = canvas.getGraphicsContext2D();
		list = new ArrayList<>();
		list.add(new Man(100,100));
		list.add(new Block(200,200,20,20,Color.BLUE));

		animate = new AnimateObjects();
		animate.start();
		stage.show();
		scene.addEventHandler(KeyEvent.KEY_PRESSED,this);
		scene.addEventHandler(MouseEvent.MOUSE_CLICKED, this);
	}

	public void handle(final InputEvent event){
		if (event instanceof KeyEvent){
			((Man) list.get(0)).handleKeyEvent((KeyEvent) event);
		}
	}


}