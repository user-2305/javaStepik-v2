import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame {

    public App() {
        setTitle("Информационное окно");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    JOptionPane.showMessageDialog(App.this, "Ваше имя");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                App example = new App();
                example.setVisible(true);
            }
        });
    }
}
