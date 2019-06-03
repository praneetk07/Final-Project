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

public class Block extends GameObjects {

    private Color c;

    public Block(int x, int y, int w, int h, Color c) {
        super(x, y, w, h);
        this.c = c;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(c);
        gc.fillRect(x, y, w, h);
    }

}