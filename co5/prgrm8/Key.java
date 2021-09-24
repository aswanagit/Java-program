import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code=Key width=300 height=300>
</applet>
*/
public class Key extends Applet implements KeyListener
{
  String msg="";
  int X=20,Y=20;
  public void init()
  {
    addKeyListener(this);
    setBackground(Color.cyan);
    setForeground(Color.red);
    }
   public void keyPressed(KeyEvent ke)
 {
   showStatus("key down");
 }
 public void keyReleased(KeyEvent ke)
{
  showStatus("key up");
}
public void keyTyped(KeyEvent ke)
{
 msg+=ke.getKeyChar();
 repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,X,Y);
}
}