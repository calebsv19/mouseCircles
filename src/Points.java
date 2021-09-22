import java.awt.*;

public class Points {
    private Point point;
    private double t;

    public Points(Point point){
        this.point = point;
        t = 0;
    }

    public void tick(){
        t += .3;
    }

    public void render(Graphics g){
        g.drawOval(point.x - (int) (t / 2), point.y - (int) (t / 2), (int) t, (int) t);
    }

    public double getT(){
        return t;
    }

    public void setT(int num){
        t = num;
    }
}
