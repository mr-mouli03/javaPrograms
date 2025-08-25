import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
// import java.awt.TextArea;

public class applet extends Applet {
    public void init () {
        setBackground(Color.green);
        setForeground(Color.black);
    }
    public void paint(Graphics h) {
        h.drawString("Hellow world", 100, 100);
        h.drawRect(40, 0, 200, 200);
        h.drawLine(70, 10, 200, 200);
    }
}

