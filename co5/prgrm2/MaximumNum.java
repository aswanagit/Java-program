import java.awt.*;
import java.applet.*;

/*
<applet code="MaximumNum" width=500 height=300>
<param name=num1 value=10>
<param name=num2 value=20>
<param name=num3 value=30>
</applet>
*/

public class MaximumNum extends Applet {
   String param;
   int max;
   public void start() {
        param=getParameter("num1");
        int val1=Integer.parseInt(param);
        param=getParameter("num2");
        int val2=Integer.parseInt(param);
        param=getParameter("num3");
        int val3=Integer.parseInt(param);
        if(val1>=val2 && val1>=val3)
        max=val1;
        else if(val2>=val1 && val2>=val3)
        max=val2;
        else
        max=val3;
   }

public void paint(Graphics g) {
  g.drawString("Maximum number is:" + String.valueOf(max),100,100);
}
}