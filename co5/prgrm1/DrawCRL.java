import java.awt.*;
import java.applet.*;
/*
<applet code="DrawCRL" width=500 height=400>
</applet>
*/
public class DrawCRL extends Applet {
public void paint(Graphics g) {
g.fillOval(10,10,150,150);
g.fillRect(20,300,200,200);
g.drawLine(900,50,80,200);
}
}