import javax.swing.JFrame;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame jFrame = getFrame();
        jFrame.add(new Car());
    }
    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 500, dimension.height / 2 - 320 , 1000, 640);
        return jFrame;
    }
}
