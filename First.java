import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class First extends Applet {
    public void init (){
        this.setBackground(Color.red);
        this.setForeground(Color.yellow);
    }
    public void paint (Graphics n) {
        n.drawString("Hello world",10,10);
        n.drawLine(12,12,20,20);
        n.drawRect(30, 30, 100, 200);
        n.fillRect(150, 30, 100, 200);
    }
}