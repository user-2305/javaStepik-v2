import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;

public class App implements KeyListener {

    private FileWriter fileWriter;

    public App() {
        try {
            fileWriter = new FileWriter("C:\\Projects\\Java [Stepik]\\JavaSwing2\\KeyLogerExample\\src\\javakeylog.txt", true); // Открываем файл для записи (добавляем данные в конец файла)
        } catch (IOException e) {
            System.out.println("Ошибка при открытии файла: " + e.getMessage());
        }

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
    @Override
    public void keyTyped(KeyEvent e) {
        char typedChar = e.getKeyChar();
        saveToFile(String.valueOf(typedChar));
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Character keyCode = e.getKeyChar();
        // saveToFile(String.valueOf(keyCode));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Дополнительная логика, если необходимо
    }

    public static void main(String[] args) {
        App keyLog = new App();
        JFrame frame = getFrame();
        frame.addKeyListener(keyLog);
    }

    public void startListening() {
        // Код добавления KeyListener'а к компоненту, на котором нужно отслеживать клавиши
    }

    public void saveToFile(String data) {
        try {
            fileWriter.write(data);
            fileWriter.flush(); // Сохраняем данные в файл
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    public void closeFile() {
        try {
            fileWriter.close(); // Закрываем файл после завершения работы
        } catch (IOException e) {
            System.out.println("Ошибка при закрытии файла: " + e.getMessage());
        }
    }
}
