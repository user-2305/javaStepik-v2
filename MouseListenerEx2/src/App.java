import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class App {
    public static void main(String[] args) throws Exception {
        MyFrame frame = new MyFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocation(1000, 300);
    }   
}
class MyFrame extends JFrame{
    public MyFrame(){
        setTitle("Main frame");
        setSize(600, 600);
        MyPanel panel = new MyPanel();
        Container pane = getContentPane();
        pane.add(panel);
    }
}
class MyPanel extends JPanel{
    private ArrayList circle;
    private Ellipse2D current;
    public MyPanel() {
        circle = new ArrayList<>();
        current = null;
        addMouseListener(new MyMouse());
        addMouseMotionListener(new MyMove());
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < circle.size(); i++) {
            g2.setColor(new Color((i *100 + 20) % 255, (i * 120 + 111) % 255, (i * 70 + 20) % 255));
            g2.fill((Ellipse2D) circle.get(i)) ;
        }
    }
    public void add(Point2D p){
        current = new Ellipse2D.Double(p.getX() - 10, p.getY() - 10, 50, 50);
        circle.add(current);
        repaint();
    }
    public Ellipse2D find(Point2D p){
        for (int i = 0; i < circle.size(); i++) {
            Ellipse2D e = (Ellipse2D) circle.get(i);
            if(e.contains(p)) return e;
        }
        return null;
    }
    private void remove(Ellipse2D e) {
        if(e == null) return;
        if(e == current) current = null;
        circle.remove(e);
        repaint();
    }
    private class MyMouse extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            current = find(e.getPoint());
            if(current == null) add(e.getPoint());
        }
        public void mouseClicked(MouseEvent e){
            if(e.getClickCount() >= 2){
                current = find(e.getPoint());
            if(current != null) remove(current);
            }
        }
        
    }
    private class MyMove implements MouseMotionListener{
        public void mouseMoved(MouseEvent e) {
            if(find(e.getPoint()) == null){
                setCursor(Cursor.getDefaultCursor());
            }else{
                setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
            }
        }
        public void mouseDragged(MouseEvent e) {
            if(current != null){
                current.setFrame(e.getX() - 10, e.getY() - 10, 50, 50);
                repaint();
            }
        }
    }
}