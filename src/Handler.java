import java.awt.*;
import java.io.*;
import java.util.*;

public class Handler {
    private Queue<Points> points;


    public Handler(int num){
        points = new LinkedList<Points>();
        for (int i = 0; i < num; i++){
            points.add(new Points(new Point()));
        }
    }

    public void tick(int width, int height){
        points.poll();
        points.add(new Points(MouseInfo.getPointerInfo().getLocation()));

        for (Points point : points){
            point.setT((int) point.getT() + 1);
        }
    }

    public void render(Graphics g, int width, int height){
        g.setColor(Color.BLACK);
        g.fillRect(0,0, width, height);
        g.setColor(Color.WHITE);
        for (Points point : points){
            point.render(g);
        }
    }
}