import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
import java.awt.Polygon;
public class MyPanelClass extends JPanel {
            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width+1, height+1);
                        
//                        //Draw a border
//                        g.setColor(Color.GREEN);
//                        g.drawRect(x1, y1, width, height);
//                        
//                      //Draw a second border
//                        g.setColor(Color.BLUE);
//                        g.drawRect(x1+3, y1+3, width-6, height-6);
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, height/5, width, height/5);
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, 3*(height/5), width, height/5);
                        
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval(getWidth()/2-30, getHeight()/2-30, 55, 55);
                       
                        Polygon p = new Polygon();
                        p.addPoint(x1, y1);
                        p.addPoint((x1+x2)/2, (y1+y2)/2);
                        p.addPoint(x1, y2);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p);
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(width/125+ width/150+25, height/75+height/10+73);
                        p2.addPoint(width/125+ width/150+41, height/75+height/10+73);
                        p2.addPoint(width/125+ width/150+47, height/75+height/10+58);
                        p2.addPoint(width/125+ width/150+53, height/75+height/10+73);
                        p2.addPoint(width/125+ width/150+69, height/75+height/10+73);
                        p2.addPoint(width/125+ width/150+56, height/75+height/10+83);
                        p2.addPoint(width/125+ width/150+61, height/75+height/10+98);
                        p2.addPoint(width/125+ width/150+47, height/75+height/10+88);
                        p2.addPoint(width/125+ width/150+34, height/75+height/10+98);
                        p2.addPoint(width/125+ width/150+38, height/75+height/10+83);           
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
            }
}