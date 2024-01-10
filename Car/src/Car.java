import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;

import javax.swing.JComponent;

public class Car extends JComponent{
    @Override
    protected void paintComponent(Graphics g) {
        Color colorGrey2 = new Color(40,40,40);
        Color yellow = new Color(255,255,0);
        Color white = new Color(235, 235, 235);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(white);
        g2.fill(getBounds());
        g2.setColor(colorGrey2);
        g2.setStroke(new BasicStroke(7));
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        GeneralPath path = new GeneralPath();
        path.moveTo(200, 300);
        path.quadTo(450, 0100, 700, 300);
        path.quadTo(870, 320, 900, 400);
        path.quadTo(915, 440, 875, 450);
        path.lineTo(150, 450);
        path.quadTo(120, 425, 130, 400);
        path.quadTo(140, 350, 200, 300);
        g2.setColor(yellow);
        g2.fill(path);
        g2.setColor(colorGrey2);
        g2.draw(path);
        GeneralPath path2 = new GeneralPath();
        path2.moveTo(230, 300);
        path2.quadTo(450, 100, 670, 300);
        path2.lineTo(231, 300);
        g2.setColor(white);
        g2.fill(path2);
        g2.setColor(colorGrey2);
        g2.draw(path2);
        g2.setColor(colorGrey2);
        g2.drawRect(425, 202, 30, 98);
        g2.setColor(yellow);
        g2.fillRect(425, 193, 30, 120);
        GeneralPath path3 = new GeneralPath();
        g2.setColor(colorGrey2);
        path3.moveTo(460, 330);
        path3.lineTo(500, 330);
        g2.draw(path3);
        GeneralPath path4 = new GeneralPath();
        path4.moveTo(820, 350);
        path4.quadTo(880, 360, 880, 410);
        path4.quadTo(820, 400, 820, 350);
        g2.setColor(white);
        g2.fill(path4);
        g2.setColor(colorGrey2);
        g2.draw(path4);
        //отверстия кузова под левое колесо
        g2.fillOval(220, 400, 150, 150);
        g2.setColor(white);
        g2.fillOval(227, 407, 135, 135);
        //отверстия кузова под правое колесо
        g2.setColor(colorGrey2);
        g2.fillOval(650, 400, 150, 150);
        g2.setColor(white);
        g2.fillOval(657, 407, 135, 135);
        //затерание лишних линий прямоугольником
        g2.fillRect(200, 454, 800, 200);
        // левое колесо
        g2.setColor(colorGrey2);
        g2.fillOval(232, 413, 125, 125);
        g2.setColor(white);
        g2.fillOval(272, 452, 45, 45);
        //правое колесо
        g2.setColor(colorGrey2);
        g2.fillOval(662, 413, 125, 125);
        g2.setColor(white);
        g2.fillOval(702, 452, 45, 45);

        
        



        
        
        
        
        // path.closePath();
        // path.quadTo();





        // g2.drawOval(getHeight() / 2 - 150, getWidth() / 2 - 55, 300, 300);
        // g2.setColor(white);
        // g2.fillOval(getHeight() / 2 - 112, getWidth() / 2 - 200, 225, 225);
        // g2.setColor(colorGrey2);
        
        // g2.drawOval(getHeight() / 2 - 112, getWidth() / 2 - 200, 225, 225);
        // g2.setColor(white);
        // g2.fillOval(getHeight() / 2 - 65, getWidth() / 2 - 280, 130, 130);
        // g2.setColor(colorGrey2);
        // g2.drawOval(getHeight() / 2 - 65, getWidth() / 2 - 280, 130, 130);
        // g2.setColor(white);
        // g2.fillOval(getHeight() / 2 - 75, getWidth() / 2 - 300, 150, 30);
        // g2.fillRoundRect(getHeight() / 2 - 50, getWidth() / 2 - 350, 100, 60, 20, 20);
        // g2.setColor(colorGrey2);
        // g2.drawOval(getHeight() / 2 - 75, getWidth() / 2 - 300, 150, 30);
        // g2.setColor(white);
        // g2.fillRoundRect(getHeight() / 2 - 50, getWidth() / 2 - 350, 100, 60, 20, 20);
        // g2.setColor(colorGrey2);
        // g2.drawRoundRect(getHeight() / 2 - 50, getWidth() / 2 - 350, 100, 60, 20, 20);
        // g2.drawLine(330, getWidth() / 2 - 310, 430, getWidth() / 2 - 310);
        // //глаза и пуговицы
        // g2.setStroke(new BasicStroke(3));
        // g2.drawOval(getHeight() / 2 - 5, getWidth() / 2 - 308, 15, 15);
        // g2.drawOval(getHeight() / 2 - 30, getWidth() / 2 - 250, 20, 20);
        // g2.fillOval(getHeight() / 2 - 22, getWidth() / 2 - 242, 10, 10);
        // g2.drawOval(getHeight() / 2 + 30, getWidth() / 2 - 250, 20, 20);
        // g2.fillOval(getHeight() / 2 + 38, getWidth() / 2 - 242, 10, 10);
        // g2.fillOval(getHeight() / 2 - 20, getWidth() / 2 - 190, 10, 10);
        // g2.fillOval(getHeight() / 2 - 5, getWidth() / 2 - 180, 10, 10);
        // g2.fillOval(getHeight() / 2 + 10, getWidth() / 2 - 175, 10, 10);
        // g2.fillOval(getHeight() / 2 + 25, getWidth() / 2 - 180, 10, 10);
        // g2.fillOval(getHeight() / 2 + 40, getWidth() / 2 - 190, 10, 10);
        // g2.drawOval(getHeight() / 2 + 30, getWidth() / 2 - 140, 15, 15);
        // g2.drawOval(getHeight() / 2 + 45, getWidth() / 2 - 100, 15, 15);
        // g2.drawOval(getHeight() / 2 + 44, getWidth() / 2 - 60, 15, 15);


        // //морковь
        // GeneralPath path = new GeneralPath();
        // path.moveTo(getHeight() / 2 + 10, getWidth() / 2 - 215);
        // path.lineTo(getHeight() / 2 + 100, getWidth() / 2 - 230);
        // path.lineTo(getHeight() / 2 + 15, getWidth() / 2 - 200);
        // path.quadTo(getHeight() / 2 + 15, getWidth() / 2 - 200, getHeight() / 2 + 10, getWidth() / 2 - 215);
        // g2.setColor(white);
        // g2.fill(path);
        // g2.setColor(colorGrey2);
        // g2.draw(path);

        // //правая рука
        // g2.setStroke(new BasicStroke(5));
        // g2.drawLine(getHeight() / 2 + 115, getWidth() / 2 - 100, getHeight() / 2 + 220, getWidth() / 2 - 130);
        // g2.drawLine(getHeight() / 2 + 220, getWidth() / 2 - 130, getHeight() / 2 + 235, getWidth() / 2 - 160);
        // g2.drawLine(getHeight() / 2 + 220, getWidth() / 2 - 130, getHeight() / 2 + 265, getWidth() / 2 - 145);
        // g2.drawLine(getHeight() / 2 + 220, getWidth() / 2 - 130, getHeight() / 2 + 250, getWidth() / 2 - 110);
        // //левая рука
        // g2.drawLine(getHeight() / 2 - 115, getWidth() / 2 - 100, getHeight() / 2 - 220, getWidth() / 2 - 130);
        // g2.drawLine(getHeight() / 2 - 220, getWidth() / 2 - 130, getHeight() / 2 - 235, getWidth() / 2 - 160);
        // g2.drawLine(getHeight() / 2 - 220, getWidth() / 2 - 130, getHeight() / 2 - 265, getWidth() / 2 - 145);
        // g2.drawLine(getHeight() / 2 - 220, getWidth() / 2 - 130, getHeight() / 2 - 250, getWidth() / 2 - 110);
    }
}
